<%-- 
    Document   : review
    Created on : Nov 16, 2016, 6:38:10 PM
    Author     : fowlerne
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Review us!</title>
    </head>
    <body>
        <p style="text-align:center">
            <h1>Submit a review</h1>
            <hr>
            <s:form action="review">
                <s:textfield name="review_text" label="Text of review"></s:textfield>
                <s:submit value="Submit"></s:submit>
            </s:form>
        </p>
        <br />
        <p>We love your feedback</p>
    </body>
</html>
