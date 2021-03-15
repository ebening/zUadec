<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.usuario-resources"/>
<html>
<head>
<title>List <fmt:message key="usuario.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="usuario.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newUsuario"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="usuario.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="usuario.idusuario.title"/></th>
					<th class="thead"><fmt:message key="usuario.apellidopaterno.title"/></th>
					<th class="thead"><fmt:message key="usuario.nombre.title"/></th>
					<th class="thead"><fmt:message key="usuario.login.title"/></th>
					<th class="thead"><fmt:message key="usuario.apellidomaterno.title"/></th>
					<th class="thead"><fmt:message key="usuario.password.title"/></th>
					<th class="thead"><fmt:message key="usuario.idrol.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${usuarios}" var="current" varStatus="i">
					<c:choose>
						<c:when test="${(i.count) % 2 == 0}">
		    				<c:set var="rowclass" value="rowtwo"/>
						</c:when>
						<c:otherwise>
		    				<c:set var="rowclass" value="rowone"/>
						</c:otherwise>
					</c:choose>	
				<tr class="${rowclass}">
					<td nowrap="nowrap" class="tabletd">
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectUsuario?idUsuarioKey=${current.idUsuario}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editUsuario?idUsuarioKey=${current.idUsuario}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteUsuario?idUsuarioKey=${current.idUsuario}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.idUsuario}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.apellidoPaterno}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.nombre}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.login}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.apellidoMaterno}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.password}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.idRol}
						&nbsp;
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
		</div>
	</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>