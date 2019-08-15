<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<div class="header">

    <div class="locale">
        <form>
            <select id="language" title="<fmt:message key="header.locale.title" />" name="language"
                    class="locale-select" onchange="submit()">
                <option value="en_US" ${language == 'en_US' ? 'selected' : ''} >US</option>
                <option value="ru_RU" ${language == 'ru_RU' ? 'selected' : ''} >RU</option>
            </select>
        </form>
    </div>

    <div class="logo" title="<fmt:message key="header.logo.title"/>">

        <a href="/main">
            <img class="img-logo" src="../../../assests/index/img/logo.png" style="height:8vh" alt="Logo TRD">
        </a>
    </div>

    <div class="login" title="<fmt:message key="header.login.title"/>">

        <c:if test="${sessionScope.role==null}">
            <a href="/login" class="login-form">
                <button class="but"><fmt:message key="header.login.button"/></button>
            </a>
        </c:if>

        <c:if test="${sessionScope.role!=null}">
            <a href="/logout" class="login-form">
                <button class="but"><fmt:message key="header.logout.button"/></button>
            </a>
        </c:if>

    </div>
</div>

