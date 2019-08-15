<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<c:set var="language" value="${not empty param.language ?
          param.language : not empty language?language :
                        pageContext.request.locale}" scope="session"/>
<fmt:setLocale value="${language}"/>
<fmt:setBundle basename="locale"/>
<%--<!DOCTYPE html >--%>
<%--<html lang="${language}">--%>

<%--<head>--%>
    <meta charset="utf-8">
    <link rel="stylesheet" type="text/css" href="/assests/index/style.css">
    <link href="https://fonts.googleapis.com/css?family=Comfortaa" rel="stylesheet">
    <%--<title><fmt:message key="index.title"/></title>--%>
    <%--<tiles:importAttribute name="title" />--%>
    <%--<title><spring:message code="${title}"/></title>--%>
<%--</head>--%>
<%--<body>--%>


<div class="container">

    <div class="content">
        <div class="select-menu">

            <a href="/addrequest?classCar=circuit&typeTrack=circuit" class="trackdayURL">
                <div class="scroll_down"><p class="par-MAIN"><fmt:message key="index.track"/></p>
                </div>
            </a>
            <a href="/addrequest?classCar=rally&typeTrack=rally" class="rallyURL">
                <div class="scroll_down"><p class="par-MAIN"><fmt:message key="index.rally"/></p>
                </div>
            </a>
            <a href="/addrequest?classCar=drift&typeTrack=drift" class="driftURL">
                <div class="scroll_down"><p class="par-MAIN"><fmt:message key="index.drift"/></p>
                </div>
            </a>
            <div class="fake"></div>

        </div>


    </div>



</div>

<script
        src="http://code.jquery.com/jquery-3.3.1.min.js"
        integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
        crossorigin="anonymous"></script>
<script src="/assests/index/script.js" charset="utf-8"></script>
<%--</body>--%>
<%--</html>--%>
