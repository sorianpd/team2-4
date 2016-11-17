<%-- 
    Document   : login
    Created on : Nov 16, 2016, 10:18:56 AM
    Author     : sorianpd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registration</title>
    </head>
    <body>
        <p style="text-align:center">
            <h1>Login: </h1>
            <hr>
            <s:form action="login">
                <s:textfield name="user_id" label="Username"></s:textfield>
                <s:password name="password" label="Password"></s:password>
                <s:submit value="Login"></s:submit>
            </s:form>
        </p>
    </body>
</html>
