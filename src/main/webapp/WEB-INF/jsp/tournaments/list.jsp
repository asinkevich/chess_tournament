<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<h2>All tournaments:</h2>

<c:forEach var="tournament" items="${tournaments}">
  <spring:url value="/tournaments/{tournamentId}" var="tournamentUrl">
    <spring:param name="tournamentId" value="${tournament.id}"/>
  </spring:url>
  <a href="${fn:escapeXml(tournamentUrl)}"><h3>${tournament.name}</h3></a>
</c:forEach>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>