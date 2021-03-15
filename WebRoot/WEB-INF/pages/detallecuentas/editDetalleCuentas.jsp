<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.detallecuentas-resources"/>
<html>
<head>
<title>Edit <fmt:message key="detallecuentas.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="detallecuentas.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexDetalleCuentas"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveDetalleCuentas" method="POST" modelAttribute="detallecuentas">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="detallecuentas.iddetallecuentas.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="detallecuentas_idDetalleCuentas" path="idDetalleCuentas" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "detallecuentas_idDetalleCuentas",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="detallecuentas.iddetallecuentas.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${detallecuentas.idDetalleCuentas}
						&nbsp;
									<form:hidden id="detallecuentas_idDetalleCuentas" path="idDetalleCuentas"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="detallecuentas.numero.title"/>:
						</td>
						<td>
							<form:input id="detallecuentas_numero" path="numero" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "detallecuentas_numero",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="detallecuentas.numero.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="detallecuentas.ciclo.title"/>:
						</td>
						<td>
							<form:input id="detallecuentas_ciclo" path="ciclo" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "detallecuentas_ciclo",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="detallecuentas.ciclo.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="detallecuentas.cuentapagar.title"/>:
						</td>
						<td>
							<form:input id="detallecuentas_cuentaPagar" path="cuentaPagar" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "detallecuentas_cuentaPagar",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="detallecuentas.cuentapagar.help"/>"}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="detallecuentas.idtipocuenta.title"/>:
						</td>
						<td>
							<form:input id="detallecuentas_idTipoCuenta" path="idTipoCuenta" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "detallecuentas_idTipoCuenta",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="detallecuentas.idtipocuenta.help"/>", constraints : {places:0}}})); </script>
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