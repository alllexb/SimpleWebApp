<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="sec"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="locate"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">

    <link rel="stylesheet" href='<c:url value="/css/main.css"/>' />

    <%--<script src="<c:url value="/js/main.js" />" />--%>

    <title>WEB SIMPLE SHOP</title>
</head>
<body>
    <%--<div class="" style=" height: 100px; background-color: #abb231"></div>--%>
    <div id="logout_poz">
        <form action="<c:url value="/logout.htm" />" method="POST">
            <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            <input class="logout_sub" type="submit" name="logout" value="Logout"/>
        </form>
    </div>
    <div>
    <table id="mainTable">
        <tr class="header">
            <td>
                <p><a href="/shop/user/login.html" class="head"><h1>Web Simple Shop</h1></a></p>
            </td>
        </tr>
    </table>
    </div>

    <jsp:doBody/>
</body>
</html>
