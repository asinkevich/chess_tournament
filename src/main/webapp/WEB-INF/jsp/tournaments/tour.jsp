<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<h2>Tour&nbsp;${tour.index}</h2>

<h3>Parties:</h3>

<c:forEach var="party" items="${tour.parties}">
  <h4>${party.firstPlayer.participant.lastName}&nbsp;-&nbsp;${party.secondPlayer.participant.lastName}&nbsp;${party.firstPlayerScore}:${party.secondPlayerScore}</h4>
</c:forEach>



<%@ include file="/WEB-INF/jsp/footer.jsp" %>