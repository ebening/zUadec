<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.rol-resources"/>
<html>
<head>
<title>Edit <fmt:message key="rol.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1><fmt:message key="navigation.edit"/> <fmt:message key="rol.title"/></h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexRol"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		<form:form action="${pageContext.request.contextPath}/saveRol" method="POST" modelAttribute="rol">
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="rol.idrol.title"/>:
						</td>
						<td>
							<c:choose>
								<c:when test='${newFlag}' >
							<form:input id="rol_idRol" path="idRol" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "rol_idRol",widgetType : "dijit.form.NumberTextBox",widgetAttrs : {promptMessage: "<fmt:message key="rol.idrol.help"/>", constraints : {places:0}}})); </script>
								</c:when>
								<c:otherwise>
							${rol.idRol}
						&nbsp;
									<form:hidden id="rol_idRol" path="idRol"/>
								</c:otherwise>
							</c:choose>
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="rol.nombrerol.title"/>:
						</td>
						<td>
							<form:input id="rol_nombreRol" path="nombreRol" cssStyle="width:300px;"/>
							<script type="text/javascript">Spring.addDecoration(new Spring.ElementDecoration({elementId : "rol_nombreRol",widgetType : "dijit.form.ValidationTextBox",widgetAttrs : {promptMessage: "<fmt:message key="rol.nombrerol.help"/>"}})); </script>
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