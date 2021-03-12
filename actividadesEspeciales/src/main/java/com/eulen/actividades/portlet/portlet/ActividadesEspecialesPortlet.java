package com.eulen.actividades.portlet.portlet;

import com.eulen.actividades.portlet.util.Constants;
import com.eulen.actividades.service.model.ActividadesEspeciales;
import com.eulen.actividades.service.service.ActividadesEspecialesLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.Order;
import com.liferay.portal.kernel.dao.orm.OrderFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import java.io.IOException;
import java.util.List;
import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.ProcessAction;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import org.osgi.service.component.annotations.Component;

/**
 * @author irodriguezba
 * 
 * Portlet que, utilizando actividadesEspecialesService, recupera la lista de actividades recientes de un Site y las muestra a modo de listado
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.eulen",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=actividadesEspeciales Portlet",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class ActividadesEspecialesPortlet extends MVCPortlet {
	
	/**
	 * Logger de la clase
	 */
	private static Log _log = LogFactoryUtil.getLog(ActividadesEspecialesPortlet.class);
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException, IOException {
		_log.info("Entrando en render de Actividades Especiales");
		
	    try {
	    	ThemeDisplay themeDisplay = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	   
	    	// Almacenar listados en request session para recorrerlos en la JSP
	    	if(renderRequest.getAttribute(Constants.REQ_ACTIVITIES_LIST) == null){ 
	    		renderRequest.setAttribute(Constants.REQ_ACTIVITIES_LIST, obtenerActividadesEspeciales(themeDisplay, 10));
	    	}
			
	    } catch (Exception e) {
	    	_log.error("Exception generica: " + e.getMessage());
	    	throw new PortletException(e);
	    }
	    
	    super.render(renderRequest, renderResponse);
	}
	
	@ProcessAction(name = "verMasActividadesEspeciales")
	public void verMasActividadesEspeciales(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		 try {
		    ThemeDisplay themeDisplay = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);
		   
		    // Almacenar listados en request session para recorrerlos en la JSP
		    actionRequest.setAttribute(Constants.REQ_ACTIVITIES_LIST, obtenerActividadesEspeciales(themeDisplay, QueryUtil.ALL_POS));
				
		 } catch (Exception e) {
		    	_log.error("Exception generica: " + e.getMessage());
		    	throw new PortletException(e);
		 }
		
		actionResponse.setRenderParameter("mvcPath", "/view.jsp");
	}
	
	public List<ActividadesEspeciales> obtenerActividadesEspeciales(ThemeDisplay themeDisplay, int maximo) throws PortletException{
		try {
	    	// Obtener el Site en el que se esta
	    	long siteId = themeDisplay.getLayout().getGroupId();
	    	
	    	// Definir ordenacion
			Order order = OrderFactoryUtil.desc("createDate");
						
			// Definir dynamic query
			DynamicQuery entryQuery = ActividadesEspecialesLocalServiceUtil.dynamicQuery();
			entryQuery.add(RestrictionsFactoryUtil.eq("groupId", siteId)).addOrder(order);
			
			// Ejecutar consulta
			return ActividadesEspecialesLocalServiceUtil.dynamicQuery(entryQuery, 0, maximo);
	    	
	    } catch (Exception e) {
	    	_log.error("Exception generica: " + e.getMessage());
	    	throw new PortletException(e);
	    }
	}
}
