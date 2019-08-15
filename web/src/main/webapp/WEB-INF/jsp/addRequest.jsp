<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--<html>--%>
<c:set var="language" value="${not empty param.language ?
          param.language : not empty language  ? language :
                        pageContext.request.locale}" scope="session" />
<fmt:setLocale value="${language}"/>
<fmt:setBundle basename="locale"/>

    <link rel="stylesheet" type="text/css" href="/assests/request/style.css">
    <link href="https://fonts.googleapis.com/css?family=Comfortaa" rel="stylesheet">
    <title><fmt:message key="addRequest.title"/></title>

<div>
    <form action="addrequest" method="post">

<div class="testt">
    <div class="choose_car">
        <div class="scroll_outside">
            <div class="scroll_inside">

                <c:forEach var="car" items="${cars}" varStatus="status">

                    <label>
                        <input type="radio" id=${car.carId} name="car_id" value="${car.carId}">

                        <div class="choose_box">
                        <span>
                            ${car.model}<br>
                            WHEEL-DRIVE: ${car.wheelDrive}<br>
                            ${car.power} HP<br><br>
                            AVAILABLE: ${car.available}
                        </span>
                        </div>
                    </label>

                </c:forEach>

            </div>
        </div>
    </div>

    <div class="view_car">

        <c:forEach var="car" items="${cars}" varStatus="status">

            <div class="mySlides-car fade" style="">
                <div class="slide-car" style="background-image: url(/assests/request/cars/img${car.carId}.jpg)"></div>
                <div class="text">${car.model}</div>
            </div>

        </c:forEach>

        <a class="prev-car" onclick="plusSlidesCar(-1)">&#10094;</a>
        <a class="next-car" onclick="plusSlidesCar(1)">&#10095;</a>

    </div>

    <div class="view_track">

        <c:forEach var="track" items="${tracks}" varStatus="status">

        <div class="mySlides-track fade" style="">
            <div class="slide-track"
                 style="background-image: url(/assests/request/tracks/ID${track.track_id}/img1.jpg)"></div>
            <div class="text">${track.track_name}</div>
        </div>

        <div class="mySlides-track fade" style="">
            <div class="slide-track"
                 style="background-image: url(/assests/request/tracks/ID${track.track_id}/img2.jpg)"></div>
            <div class="text">${track.track_name}</div>
        </div>

        <div class="mySlides-track fade" style="">
            <div class="slide-track"
                 style="background-image: url(/assests/request/tracks/ID${track.track_id}/img3.jpg)"></div>
            <div class="text">${track.track_name}</div>
        </div>

        <div class="mySlides-track fade" style="">
            <div class="slide-track"
                 style="background-image: url(/assests/request/tracks/ID${track.track_id}/img4.jpg)"></div>
            <div class="text">${track.track_name}</div>
        </div>

    </c:forEach>

    <a class="prev-track" onclick="plusSlidesTrack(-1)">&#10094;</a>
    <a class="next-track" onclick="plusSlidesTrack(1)">&#10095;</a>

</div>

<div class="choose_track">
    <div class="scroll_outside">
        <div class="scroll_inside">

            <c:forEach var="track" items="${tracks}" varStatus="status">

                <label>
                    <input type="radio" id=${track.track_id} name="track_id" value="${track.track_id}">
                    <div class="choose_box">
                        <span>
                        ${track.track_name}<br>
                        ${track.track_length} metres
                        </span>
                    </div>
                </label>

            </c:forEach>

        </div>
    </div>
</div>

<div class="request">

    <div class="contact_request">
    <input class="customize" name="surname" type="text" required="required" placeholder="<fmt:message key="addRequest.contact.surname"/>"><br>
    <input class="customize" name="client_email" type="email" required="required" placeholder="<fmt:message key="addRequest.contact.email"/>"><br>
    <input class="customize" name="phone_number" minlength="9" maxlength="9" type="tel" required="required"
    placeholder="<fmt:message key="addRequest.contact.phone_number"/>"><br>
    <input class="button" name="action" type="submit" value="<fmt:message key="addRequest.contact.button.submit"/>">
    </div>

    <c:if test="${not empty message}">
        <h1>${message}</h1>
    </c:if>



</form>

</div>
<%--</html>--%>
<script
        src="http://code.jquery.com/jquery-3.3.1.min.js"
        integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8="
        crossorigin="anonymous"></script>
<script src="/assests/request/script.js" charset="utf-8"></script>

<%--</body>--%>
<%--</html>--%>
