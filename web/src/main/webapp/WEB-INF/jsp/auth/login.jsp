<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="language" value="${not empty param.language ?
          param.language : not empty language  ? language :
                        pageContext.request.locale}" scope="session" />
<fmt:setLocale value="${language}"/>
<fmt:setBundle basename="locale"/>

<%--<head>--%>
    <meta charset="utf-8">
    <link rel="stylesheet" href="assests/auth/login/style.css">
    <link href="https://fonts.googleapis.com/css?family=Raleway" rel="stylesheet">
    <%--<title>Login</title>--%>
<%--</head>--%>

<div>
        <form class="login-form" action="login" method="POST">

            <input type="text" name="username" placeholder="username"/>
            <input type="password" name="user_password" placeholder="password"/>
            <input type="submit" value="login">
            <p class="message">Not registered? <a href="registration">Create an account</a></p>

        </form>

    <c:if test="${not empty message}">
        <h1>${message}</h1>
    </c:if>

</div>

