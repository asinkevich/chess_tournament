<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<h2>News</h2>

<c:forEach var="newsArticle" items="${news}">
  <article>
    <header>
      <h3>${newsArticle.name}</h3>
      <h4><fmt:formatDate value="${newsArticle.date}"/></h4>
    </header>
    <section>
      <p>${newsArticle.text}</p>
    </section>
  </article>
</c:forEach>

<a href='<spring:url value="/news/new" htmlEscape="true"/>'>Add News</a>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>