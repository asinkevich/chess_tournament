<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<h1>Participants</h1>

<c:set var="title" value="Girls"/>
<c:set var="participants" value="${girls}"/>
<%@ include file="/WEB-INF/jsp/participants/table.jsp" %>

<c:set var="title" value="Boys"/>
<c:set var="participants" value="${boys}"/>
<%@ include file="/WEB-INF/jsp/participants/table.jsp" %>

<a href='<spring:url value="/participants/new" htmlEscape="true"/>'>Add Participant</a>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>