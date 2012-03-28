<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<h2>Participants</h2>

<h3>Girls:</h3>
<c:set var="participants" value="${girls}"/>
<%@ include file="/WEB-INF/jsp/participants/table.jsp" %>

<h3>Boys:</h3>
<c:set var="participants" value="${boys}"/>
<%@ include file="/WEB-INF/jsp/participants/table.jsp" %>

<a href='<spring:url value="/participants/new" htmlEscape="true"/>'>Add Participant</a>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>