<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Immigrant material</title>
</head>
<body>
    <br/><br/>
    <div align="left">
    <c:forEach items="${products}" var="product">
        <div style="padding: 5px;">
        <a href="#">${product.name}</a>&nbsp;
        <a href="#">Buy</a><br/>
        </div>
    </c:forEach>
    </div>
</body>
</html>