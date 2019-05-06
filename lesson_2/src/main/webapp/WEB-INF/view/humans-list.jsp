<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<head>
    <title>Humans</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/main.css" />
</head>
</head>
<body>
<ul>
    <c:forEach var="human" items="${humans}">
        <li>Human ID: ${human.id}, parent ID: ${human.parentId}</li>
    </c:forEach>
</ul>
</body>
</html>