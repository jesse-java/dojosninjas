<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<body>

<form:form method="POST" action="/dojos/create" modelAttribute="dojo">
    <fieldset>
        <legend>Create a Dojo</legend>
        <form:label path="name">Name:
            <form:errors path="name"/>
            <form:input path="name"/>
        </form:label>
        <input type="submit" value="Create">
    </fieldset>
</form:form>
</body>


</html>