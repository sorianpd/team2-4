<%-- 
    Document   : vehicle_info
    Created on : Nov 16, 2016, 7:15:12 PM
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
            <s:form action="createAccount">
                <h3>Vehicle Information: </h3>
                <s:textfield name="car_make" label="Car Make"></s:textfield>
                <s:textfield name="car_model" label="Car Model"></s:textfield>
                <s:textfield name="car_color" label="Car Color"></s:textfield>
                <s:textfield name="license_no" label="License Number"></s:textfield>
                <s:submit value="Create Account"></s:submit>
            </s:form>
        </p>
    </body>
</html>
