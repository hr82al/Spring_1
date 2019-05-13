<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>Human</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
</head>
<body>

<form:form action="processForm" modelAttribute="human">
    Id: <form:input path="id" />
    <br>
    Parent ID: <form:input path="parentId" />
    <br>
    <input type="submit" value="Submit" />
</form:form>
</body>
</html>
