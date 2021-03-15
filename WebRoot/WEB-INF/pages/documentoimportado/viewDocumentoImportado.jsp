<%@page language="java" isELIgnored="false" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<jsp:directive.include file="/WEB-INF/sitemesh-decorators/include.jsp"/>
<fmt:setBundle basename="bundles.documentoimportado-resources"/>
<html>
<head>
<title>View <fmt:message key="documentoimportado.title"/></title>
</head>
<body>
<div id="contentarea">      
	<div id="lb"><div id="rb"><div id="bb"><div id="blc">
	<div id="brc"><div id="tb"><div id="tlc"><div id="trc">
		<div id="content">
			<h1><fmt:message key="documentoimportado.title"/> Details</h1>
			<div class="navitem"><a class="button" href="${pageContext.request.contextPath}/indexDocumentoImportado"><span><img src="images/icons/back.gif" /><fmt:message key="navigation.back"/></span></a></div>	
			<table cellpadding="0" cellspacing="0" id="viewTable">
				<tbody>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="documentoimportado.iddocumentoimportado.title"/>:
						</td>
						<td>
							${documentoimportado.idDocumentoImportado}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="documentoimportado.nombredoc.title"/>:
						</td>
						<td>
							${documentoimportado.nombredoc}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="documentoimportado.idsolicitud.title"/>:
						</td>
						<td>
							${documentoimportado.idSolicitud}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="documentoimportado.iddocumento.title"/>:
						</td>
						<td>
							${documentoimportado.idDocumento}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="documentoimportado.idusuario.title"/>:
						</td>
						<td>
							${documentoimportado.idUsuario}
						&nbsp;
						</td>
					</tr>
					<tr>
						<td class="label" valign="top">
							<fmt:message key="documentoimportado.pid.title"/>:
						</td>
						<td>
							${documentoimportado.pid}
						&nbsp;
						</td>
					</tr>
				</tbody>
			</table>
			<div class="clear">&nbsp;</div>
		</div>
	</div></div></div></div>
	</div></div></div></div>
</div>
</body>
</html>