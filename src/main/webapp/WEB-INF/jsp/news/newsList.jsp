<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<h1>News</h1>

<c:forEach var="newsArticle" items="${news}">
  <article>
    <header>
      <h2>${newsArticle.name}</h2>
      <h3><fmt:formatDate value="${newsArticle.date}"/></h3>
    </header>
    <section>
      <p>${newsArticle.text}</p>
    </section>
  </article>
</c:forEach>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>