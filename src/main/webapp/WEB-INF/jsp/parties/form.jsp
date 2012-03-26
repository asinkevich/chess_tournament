<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<c:choose>
  <c:when test="${party.new}"><c:set var="method" value="post"/></c:when>
  <c:otherwise><c:set var="method" value="put"/></c:otherwise>
</c:choose>

<h2><c:if test="${party.new}">New&nbsp;</c:if>Party:</h2>
<form:form modelAttribute="party" method="${method}">
  <table>
    <tr>
      <th>
        <%--First Name: <form:errors path="firstName" cssClass="errors"/>
        <br/>
        <form:input path="firstName" size="30" maxlength="80"/>--%>
      </th>
    </tr>

    <tr>
      <td>
        <c:choose>
          <c:when test="${party.new}">
            <p class="submit"><input type="submit" value="Add Party"/></p>
          </c:when>
          <c:otherwise>
            <p class="submit"><input type="submit" value="Update Party"/></p>
          </c:otherwise>
        </c:choose>
      </td>
    </tr>
  </table>
</form:form>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>