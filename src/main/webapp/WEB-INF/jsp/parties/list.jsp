<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<h2>All parties</h2>

<c:forEach var="party" items="${parties}">
  ${party}
</c:forEach>

<a href='<spring:url value="/parties/new" htmlEscape="true"/>'>Add Party</a>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>