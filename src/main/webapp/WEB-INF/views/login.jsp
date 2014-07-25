<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Terror movies</title>
</head>
<body>
<% if (request.getParameter("error") != null ){
        out.println("ERROR LOGIN");
    }
%>
    <form action="/j_spring_security_check" method="post">
        Username<input type="text" name="user_param"/><br/>
        Password<input type="text" name="pass_param"/><br/>
        <input type="submit"/>
        (remember me <input type="checkbox" name="_spring_security_remember_me" value="yes"/>)
    </form>
</body>
</html>