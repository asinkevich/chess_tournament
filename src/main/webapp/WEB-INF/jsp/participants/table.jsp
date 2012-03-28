<table class="newDataForm">
  <thead>
  <th>Name</th>
  <th>Country</th>
  <th>Year</th>
  <th>Title</th>
  <th>Points</th>
  </thead>
  <c:forEach var="participant" items="${participants}">
    <tr>
      <td>${participant.firstName}&nbsp;${participant.lastName}</td>
      <td>${participant.country}</td>
      <td>${participant.birthYear}</td>
      <td>${participant.title}</td>
      <td>${participant.points}</td>
    </tr>
  </c:forEach>
</table>