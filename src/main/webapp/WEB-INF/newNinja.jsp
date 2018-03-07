<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>

<body>
<form:form method="POST" action="/ninjas/create" modelAttribute="ninja">
    <fieldset>
        <legend>Create a Ninja</legend>
        <form:errors path="dojo"/>
        Dojo: <form:select path="dojo">
            <c:forEach items="${dojos}" var ="d">
                <option value="${d.id}">${d.name}</option>
            </c:forEach>
        </form:select>

        <form:label path="firstName">First Name:
            <form:errors path="firstName"/>
            <form:input path="firstName"/>
        </form:label>

        <form:label path="lastName">Last Name:
            <form:errors path="lastName"/>
            <form:input path="lastName"/>
        </form:label>

        <form:label path="age">Age;
            <form:errors path="age"/>
            <form:input path="age"/>
        </form:label>
        <input type="submit" value="Create">
    </fieldset>
</form:form>
</body>
</html>