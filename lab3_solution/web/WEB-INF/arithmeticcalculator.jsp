<%-- 
    Document   : arithmeticcalculator
    Created on : 27-Sep-2021, 3:26:32 PM
    Author     : tweet
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Arithmetic Calculator</title>
    </head>
    <body>
        <h1>Arithmetic Calculator</h1>
            <form method="POST">
            <label>First:</label>
            <input type="text" name="first" value="${firstSelected}"></input>
            <br>
            <label>Second:</label>
            <input type="text" name="second" value="${secondSelected}"></input>
            <br>
            <input type="submit" name="operation" value="+">
            <input type="submit" name="operation" value="-">
            <input type="submit" name="operation" value="*">
            <input type="submit" name="operation" value="%">
        </form>
        <p>${result}</p>
        <a href="age">Age Calculator</a>
    </body>
</html>
