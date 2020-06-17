<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: tab65
  Date: 17.06.2020
  Time: 10:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Title</title>

    <c:if test="${locale == 'en'}">
        <h3>CARS</h3>
    </c:if>
    <c:if test="${locale == 'ru'}">
        <h3>МАШИНЫ</h3>
    </c:if>

    <table>
        <tr>
            <th>MODEL</th>
            <th>Number</th>
            <th>VIN</th>
        </tr>

        <c:forEach var="car" items="${cars}">
            <tr>
                <td>${car.model}</td>
                <td>${car.number}</td>
                <td>${car.vin}</td>

            </tr>

        </c:forEach>
    </table>
</head>
<body>

</body>
</html>
