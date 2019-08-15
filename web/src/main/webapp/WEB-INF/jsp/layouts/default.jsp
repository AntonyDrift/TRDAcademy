<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>
        <tiles:insertAttribute name="title"/>
    </title>
</head>
<header>
    <tiles:insertAttribute name="header"/>
</header>
<body>
    <tiles:insertAttribute name="body"/>
</body>
<footer>
    <tiles:insertAttribute name="footer"/>
</footer>
</html>
