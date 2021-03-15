<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.solicitud-resources"/>
<html>
<head>
<title>Edit <fmt:message key="solicitud.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="solicitud.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexSolicitud"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveSolicitud" method="POST" modelAttribute="solicitud">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.idsolicitud.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="solicitud_idSolicitud" path="idSolicitud" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_idSolicitud",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.idsolicitud.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${solicitud.idSolicitud}
						&nbsp;
									<form:hidden id="solicitud_idSolicitud" path="idSolicitud"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.fechasolicitud.title"/>:
						</td>
						<td>
							<input id="solicitud_fechaSolicitud" name="fechaSolicitud" type="text" value="<fmt:formatDate value="${solicitud.fechaSolicitud.time}" pattern="yyyy-MM-dd"/>" dojoType="dijit.form.DateTextBox" constraints="{datePattern:'<fmt:message key="date.format"/>'}" trim="true" promptMessage="<fmt:message key="date.format" />" invalidMessage="<fmt:message key="date.format.invalid" /> <fmt:message key="date.format" />." style="width:300px;" />
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.fondo.title"/>:
						</td>
						<td>
							<form:input id="solicitud_fondo" path="fondo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_fondo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.fondo.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.ncbancaria.title"/>:
						</td>
						<td>
							<form:input id="solicitud_NCbancaria" path="NCbancaria" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_NCbancaria",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.ncbancaria.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.unidadorg.title"/>:
						</td>
						<td>
							<form:input id="solicitud_unidadOrg" path="unidadOrg" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_unidadOrg",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.unidadorg.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.importe.title"/>:
						</td>
						<td>
							<form:input id="solicitud_importe" path="importe" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_importe",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.importe.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.autorizador.title"/>:
						</td>
						<td>
							<form:input id="solicitud_autorizador" path="autorizador" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_autorizador",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.autorizador.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.elaborador.title"/>:
						</td>
						<td>
							<form:input id="solicitud_elaborador" path="elaborador" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_elaborador",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.elaborador.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.contrato.title"/>:
						</td>
						<td>
							<form:input id="solicitud_contrato" path="contrato" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_contrato",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.contrato.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.rfcproveedor.title"/>:
						</td>
						<td>
							<form:input id="solicitud_rfcProveedor" path="rfcProveedor" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_rfcProveedor",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.rfcproveedor.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.cheque.title"/>:
						</td>
						<td>
							<form:input id="solicitud_cheque" path="cheque" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_cheque",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.cheque.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.idtipotramite.title"/>:
						</td>
						<td>
							<form:input id="solicitud_idTipoTramite" path="idTipoTramite" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_idTipoTramite",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.idtipotramite.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.cuentapagar.title"/>:
						</td>
						<td>
							<form:input id="solicitud_cuentaPagar" path="cuentaPagar" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_cuentaPagar",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.cuentapagar.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.ciclo.title"/>:
						</td>
						<td>
							<form:input id="solicitud_ciclo" path="ciclo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_ciclo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.ciclo.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.folioventanilla.title"/>:
						</td>
						<td>
							<form:input id="solicitud_folioVentanilla" path="folioVentanilla" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_folioVentanilla",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.folioventanilla.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.foliosdr.title"/>:
						</td>
						<td>
							<form:input id="solicitud_folioSdr" path="folioSdr" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_folioSdr",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.foliosdr.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.ncompromiso.title"/>:
						</td>
						<td>
							<form:input id="solicitud_NCompromiso" path="NCompromiso" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_NCompromiso",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.ncompromiso.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.clavebeneficiario.title"/>:
						</td>
						<td>
							<form:input id="solicitud_claveBeneficiario" path="claveBeneficiario" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "solicitud_claveBeneficiario",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="solicitud.clavebeneficiario.help"/>"}})); </script>
						</td>
					</tr>
				</tbody>
			</table>
			<span class="inputbutton"><input class="savebutton" id="save" type="submit" value="<fmt:message key="navigation.save"/>"/></span>
			<script type="text/javascript">Spring.addDecoration(new Spring.ValidateAllDecoration({elementId:'save', event:'onclick'}));</script>
		</form:form>
		<div class="clear">&nbsp;</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>