<%--
  Created by IntelliJ IDEA.
  User: hannahchun
  Date: 2022/12/08
  Time: 4:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>${title}</h1>
<img src="img/cat.png" width="300" />
<c:forEach var="name" items="${classlist}"
           varStatus="status">
    <p>${status.count} : ${name}</p>
</c:forEach>
</body>
</html>
