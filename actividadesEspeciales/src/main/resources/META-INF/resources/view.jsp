<%@page import="java.text.SimpleDateFormat"%>
<%@page import="com.liferay.portal.kernel.service.UserLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.model.User"%>
<%@page import="java.util.List"%>
<%@page import="com.eulen.actividades.service.model.ActividadesEspeciales"%>
<%@page import="com.eulen.actividades.portlet.util.Constants"%>
<%@ page import="com.liferay.portal.kernel.theme.ThemeDisplay"%>

<%@ include file="/init.jsp" %>

<%
	// Recoger parametros de session
	List<ActividadesEspeciales> activitiesList = (List<ActividadesEspeciales>)request.getAttribute(Constants.REQ_ACTIVITIES_LIST);

	// Formateadores de fecha
	SimpleDateFormat sdfSoloFecha = new SimpleDateFormat("dd/MM/yyyy");
	SimpleDateFormat sdfSoloHora = new SimpleDateFormat("HH:mm");
%>

<div class="taglib-social-activities">
	<%
	if(activitiesList==null || activitiesList.size()==0){ %>
		<div class="ae-noresults">
			A&uacute;n no existen actividades especiales en este Site
		</div>
	<%} else {
		String fechaAnterior = "";
		for(ActividadesEspeciales actividadEspecial : activitiesList){
			User userAct = UserLocalServiceUtil.getUser(actividadEspecial.getUserId()); 
			String fullName="";
			if (userAct.getScreenName().equals("crmuser")){
				fullName = "Desde CRM se";
			}
			else{
				fullName=userAct.getFullName(false, false);
			}
			String fechaActual = (actividadEspecial.getCreateDate()!=null ? sdfSoloFecha.format(actividadEspecial.getCreateDate()) : "");
			String horaActual = (actividadEspecial.getCreateDate()!=null ? sdfSoloHora.format(actividadEspecial.getCreateDate()) : "");
			
			if(!fechaActual.equals(fechaAnterior)) {
				if(!fechaAnterior.equals("")) {%>
					</div>
				<%} %>	
				
				<div class="list-group-card list-unstyled">
					<div class="splitter"><%=fechaActual %></div>
			<%} %>
				<div class="list-group-item">
					<div class="card card-horizontal">
						<div class="card-row card-row-padded"> 
							<div class="card-col-field">
								<div class=" aspect-ratio-bg-cover user-icon" style="background-image:url(<%=userAct.getPortraitURL(themeDisplay) %>)"></div>
							</div>
							<div class="card-col-content card-col-gutters"> 
								<h5 class="text-default"><%=horaActual %></h5> 
								
								<%=fullName%>&nbsp;<%=actividadEspecial.getText() %>
							</div>
						</div>
						
					</div>
				</div>		
			<%
			fechaAnterior = (actividadEspecial.getCreateDate()!=null ? sdfSoloFecha.format(actividadEspecial.getCreateDate()) : "");
		}
	}%>		
	</div>
	
	<portlet:actionURL var="verMasActividadesEspecialesURL" name="verMasActividadesEspeciales"/>
		
	<aui:form action="<%= verMasActividadesEspecialesURL %>" method="post" name="myForm">
		<div class="social-activities-see-more">
			<aui:button type="submit" value="VER TODAS" />
		</div>
	</aui:form>
</div>
