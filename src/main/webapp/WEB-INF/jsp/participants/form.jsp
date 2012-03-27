<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<c:choose>
  <c:when test="${participant.new}"><c:set var="method" value="post"/></c:when>
  <c:otherwise><c:set var="method" value="put"/></c:otherwise>
</c:choose>

<h2><c:if test="${participant.new}">New&nbsp;</c:if>Participant:</h2>
<form:form modelAttribute="participant" method="${method}">
  <table class="newDataForm">
    <tr>
      <th>
        First Name: <form:errors path="firstName" cssClass="errors"/>
        <br/>
        <form:input path="firstName" size="30" maxlength="80"/>
      </th>
    </tr>
    <tr>
      <th>
        Last Name: <form:errors path="lastName" cssClass="errors"/>
        <br/>
        <form:input path="lastName" size="30" maxlength="80"/>
      </th>
    </tr>
    <tr>
      <th>
        Year: <form:errors path="birthYear" cssClass="errors"/>
        <br/>
        <form:input path="birthYear" type="number" min="1900" max="2012" step="1" value="1990"/>
      </th>
    </tr>
    <tr>
      <th>
        Country: <form:errors path="country" cssClass="errors"/>
        <br/>
        <form:select path="country">
          <form:option value="hui" label="-Please Select-"/>
          <form:options items="${countries}"/>
        </form:select>
      </th>
    </tr>
    <tr>
      <th>
        Title: <form:errors path="title" cssClass="errors"/>
        <br/>
        <form:input path="title" size="30" maxlength="80"/>
      </th>
    </tr>
    <tr>
      <th>
        Points: <form:errors path="points" cssClass="errors"/>
        <br/>
        <form:input path="points" type="number" min="0" step="1" value="0"/>
      </th>
    </tr>
    <tr>
      <th>
        Gender: <form:errors path="gender" cssClass="errors"/>
        <br/>
        <form:select path="gender">
          <form:option value="" label="-Please Select-"/>
          <form:options items="${genders}"/>
        </form:select>
      </th>
    </tr>
    <tr>
      <td>
        <c:choose>
          <c:when test="${participant.new}">
            <p class="submit"><input type="submit" value="Add Participant"/></p>
          </c:when>
          <c:otherwise>
            <p class="submit"><input type="submit" value="Update Participant"/></p>
          </c:otherwise>
        </c:choose>
      </td>
    </tr>
  </table>
</form:form>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>