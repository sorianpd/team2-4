<%-- 
    Document   : createAccount
    Created on : Nov 16, 2016, 6:34:22 PM
    Author     : bittnemk
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Create Account</title>
    </head>
    <body>
        <p style="text-align:center">
            <h1>Sign up to RAS!</h1>
            <hr>
            <s:form action="continue">
                <h3>Account Information: </h3>
                <s:textfield name="user_id" label="Username"></s:textfield>
                <s:password name="password" label="Password"></s:password>
                <s:password name="reenter_password" label="Re-enter Password"></s:password>
                <s:textfield name="name" label="Name"></s:textfield>
                <s:textfield name="email" label="Email"></s:textfield>
                <s:submit value="Continue"></s:submit>
            </s:form>
        </p>
    </body>
</html>
