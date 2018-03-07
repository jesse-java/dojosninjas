<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>

<body>
<h1><c:out value="${dojo.name}"/></h1>

<table>
    <th>First Name</th>
    <th>Last Name</th>
    <th>Age</th>
    <c:forEach items="${dojo.ninjas}" var="ninja">
        <tr>
            <td><c:out value="${ninja.firstName}"/></td>
            <td><c:out value="${ninja.lastName}"/></td>
            <td><c:out value="${ninja.age}"/></td>
        </tr>
    </c:forEach>

</table>

</body>

</html>