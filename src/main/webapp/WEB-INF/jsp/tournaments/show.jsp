<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<h2>Tournament information</h2>

<h3>Participants:</h3>
<table class="newDataForm">
  <thead>
  <th>Name</th>
  <th>Country</th>
  <th>Year</th>
  <th>Title</th>
  <th>Score</th>
  </thead>
  <c:forEach var="player" items="${tournament.participants}">
    <tr>
      <td>${player.participant.firstName}&nbsp;${player.participant.lastName}</td>
      <td>${player.participant.country}</td>
      <td>${player.participant.birthYear}</td>
      <td>${player.participant.title}</td>
      <td>${player.score}</td>
    </tr>
  </c:forEach>
</table>

<h3>Tours:</h3>
<c:forEach var="tour" items="${tournament.tours}">
  <spring:url value="/tournaments/{tournamentId}/{tourId}" var="tourUrl">
    <spring:param name="tournamentId" value="${tournament.id}"/>
    <spring:param name="tourId" value="${tour.id}"/>
  </spring:url>
  <a href="${fn:escapeXml(tourUrl)}"><h4>Tour&nbsp;${tour.index}</h4></a>
</c:forEach>


<%@ include file="/WEB-INF/jsp/footer.jsp" %>