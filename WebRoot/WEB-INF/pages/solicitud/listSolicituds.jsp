<%@ page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.solicitud-resources"/>
<html>
<head>
<title>List <fmt:message key="solicitud.title"/>s</title>
</head>
<body>
<div id="contentarea" >
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
	<div id="content">
		<h1>Manage <fmt:message key="solicitud.title"/>s</h1>
		<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/newSolicitud"><span><img src="${pageContext.request.contextPath}/images/icons/new.gif" /><fmt:message key="navigation.new"/> <fmt:message key="solicitud.title"/></span></a></div>
		<div id="tablewrapper">
		<table id="listTable" cellpadding="0" cellspacing="0">
			<thead>
				<tr>
					<th class="thead">&nbsp;</th>
					<th class="thead"><fmt:message key="solicitud.idsolicitud.title"/></th>
					<th class="thead"><fmt:message key="solicitud.fechasolicitud.title"/></th>
					<th class="thead"><fmt:message key="solicitud.fondo.title"/></th>
					<th class="thead"><fmt:message key="solicitud.ncbancaria.title"/></th>
					<th class="thead"><fmt:message key="solicitud.unidadorg.title"/></th>
					<th class="thead"><fmt:message key="solicitud.importe.title"/></th>
					<th class="thead"><fmt:message key="solicitud.autorizador.title"/></th>
					<th class="thead"><fmt:message key="solicitud.elaborador.title"/></th>
					<th class="thead"><fmt:message key="solicitud.contrato.title"/></th>
					<th class="thead"><fmt:message key="solicitud.rfcproveedor.title"/></th>
					<th class="thead"><fmt:message key="solicitud.cheque.title"/></th>
					<th class="thead"><fmt:message key="solicitud.idtipotramite.title"/></th>
					<th class="thead"><fmt:message key="solicitud.cuentapagar.title"/></th>
					<th class="thead"><fmt:message key="solicitud.ciclo.title"/></th>
					<th class="thead"><fmt:message key="solicitud.folioventanilla.title"/></th>
					<th class="thead"><fmt:message key="solicitud.foliosdr.title"/></th>
					<th class="thead"><fmt:message key="solicitud.ncompromiso.title"/></th>
					<th class="thead"><fmt:message key="solicitud.clavebeneficiario.title"/></th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${solicituds}" var="current" varStatus="i">
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
						<a title="<fmt:message key="navigation.view" />" href="${pageContext.request.contextPath}/selectSolicitud?idSolicitudKey=${current.idSolicitud}&"><img src="images/icons/view.gif" /></a>
						<a title="<fmt:message key="navigation.edit" />" href="${pageContext.request.contextPath}/editSolicitud?idSolicitudKey=${current.idSolicitud}&"><img src="images/icons/edit.gif" /></a>
						<a title="<fmt:message key="navigation.delete" />" href="${pageContext.request.contextPath}/confirmDeleteSolicitud?idSolicitudKey=${current.idSolicitud}&"><img src="images/icons/delete.gif" /></a>
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.idSolicitud}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							<fmt:formatDate dateStyle="short" type="date" value="${current.fechaSolicitud.time}"/>
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.fondo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.NCbancaria}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.unidadOrg}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.importe}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.autorizador}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.elaborador}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.contrato}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.rfcProveedor}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.cheque}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.idTipoTramite}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.cuentaPagar}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.ciclo}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.folioVentanilla}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.folioSdr}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.NCompromiso}
						&nbsp;
					</td>
					<td nowrap="nowrap" class="tabletd">
						
							${current.claveBeneficiario}
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