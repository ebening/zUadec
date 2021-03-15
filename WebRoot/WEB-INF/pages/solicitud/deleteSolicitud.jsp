<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.solicitud-resources"/>
<html>
<head>
<title>View <fmt:message key="solicitud.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="solicitud.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexSolicitud"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>
		
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.idsolicitud.title"/>:
						</td>
						<td>
							${solicitud.idSolicitud}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.fechasolicitud.title"/>:
						</td>
						<td>
							<fmt:formatDate dateStyle="short" type="date" value="${solicitud.fechaSolicitud.time}"/>
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.fondo.title"/>:
						</td>
						<td>
							${solicitud.fondo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.ncbancaria.title"/>:
						</td>
						<td>
							${solicitud.NCbancaria}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.unidadorg.title"/>:
						</td>
						<td>
							${solicitud.unidadOrg}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.importe.title"/>:
						</td>
						<td>
							${solicitud.importe}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.autorizador.title"/>:
						</td>
						<td>
							${solicitud.autorizador}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.elaborador.title"/>:
						</td>
						<td>
							${solicitud.elaborador}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.contrato.title"/>:
						</td>
						<td>
							${solicitud.contrato}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.rfcproveedor.title"/>:
						</td>
						<td>
							${solicitud.rfcProveedor}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.cheque.title"/>:
						</td>
						<td>
							${solicitud.cheque}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.idtipotramite.title"/>:
						</td>
						<td>
							${solicitud.idTipoTramite}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.cuentapagar.title"/>:
						</td>
						<td>
							${solicitud.cuentaPagar}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.ciclo.title"/>:
						</td>
						<td>
							${solicitud.ciclo}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.folioventanilla.title"/>:
						</td>
						<td>
							${solicitud.folioVentanilla}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.foliosdr.title"/>:
						</td>
						<td>
							${solicitud.folioSdr}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.ncompromiso.title"/>:
						</td>
						<td>
							${solicitud.NCompromiso}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="solicitud.clavebeneficiario.title"/>:
						</td>
						<td>
							${solicitud.claveBeneficiario}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/deleteSolicitud?idSolicitudKey=${solicitud.idSolicitud}&"><span><img src="images/icons/delete.gif" /><fmt:message key="navigation.delete"/></span></a></div>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>