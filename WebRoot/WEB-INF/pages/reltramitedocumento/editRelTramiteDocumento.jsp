<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.reltramitedocumento-resources"/>
<html>
<head>
<title>Edit <fmt:message key="reltramitedocumento.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="reltramitedocumento.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexRelTramiteDocumento"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveRelTramiteDocumento" method="POST" modelAttribute="reltramitedocumento">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reltramitedocumento.idtramitedoc.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="reltramitedocumento_idTramiteDoc" path="idTramiteDoc" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reltramitedocumento_idTramiteDoc",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reltramitedocumento.idtramitedoc.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${reltramitedocumento.idTramiteDoc}
						&nbsp;
									<form:hidden id="reltramitedocumento_idTramiteDoc" path="idTramiteDoc"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reltramitedocumento.idtipotramite.title"/>:
						</td>
						<td>
							<form:input id="reltramitedocumento_idTipoTramite" path="idTipoTramite" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reltramitedocumento_idTipoTramite",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reltramitedocumento.idtipotramite.help"/>", constraints : {places:0}}})); </script>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="reltramitedocumento.iddocumento.title"/>:
						</td>
						<td>
							<form:input id="reltramitedocumento_idDocumento" path="idDocumento" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "reltramitedocumento_idDocumento",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="reltramitedocumento.iddocumento.help"/>", constraints : {places:0}}})); </script>
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