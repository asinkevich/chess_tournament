<%@ include file="/WEB-INF/jsp/includes.jsp" %>
<%@ include file="/WEB-INF/jsp/header.jsp" %>
<%@ include file="/WEB-INF/jsp/menu.jsp" %>

<h2>New&nbsp;News:</h2>
<table class="newDataForm">
    <tr>
        <td>
            Name:
            <br/>
            <input size="30" maxlength="300" required="required" />
        </td>
    </tr>
    <tr>
        <td>
            Date:
            <br/>
            <input id="datepicker" size="30" maxlength="80" required="required" type="date" />
        </td>
    </tr>
    <tr>
        <td>
            Text:
            <br/>
            <textarea size="300" maxlength="800" required="required"></textarea>
            <script>$(document).ready(function() {
                $("#datepicker").datepicker();
            });
            </script>
        </td>
    </tr>

</table>

<%@ include file="/WEB-INF/jsp/footer.jsp" %>