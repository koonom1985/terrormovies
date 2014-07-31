<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Terror movies</title>
</head>
<body>
    Mr &nbsp;<sec:authentication property="principal.lastname"/>
    <br/><br/>
    <c:forEach items="${movies}" var="movie">
        <sec:authorize access="hasRole('ROLE_USER')" var="isUser">
            ${movie.name}<br/>
        </sec:authorize>
        <sec:authorize access="hasRole('ROLE_VIP')" var="isVip">
            ${movie.budget}<br/>
        </sec:authorize>
    </c:forEach>
    <c:if test="${isVip}">
        <br/>You are a very appreciated VIP user
    </c:if>
</body>
</html>