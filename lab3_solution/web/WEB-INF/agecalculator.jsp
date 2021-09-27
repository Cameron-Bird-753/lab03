
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Age Calculator</title>
    </head>
    <body>
        <h1>Age Calculator</h1>
            <form method="POST">
            <label>Enter your age:</label>
            <input type="text" name="age" value=""></input>
            <br>
            <input type="submit" value="Age next Birthday">
        </form>
             <p>${message}</p>
             <a href="arithmeticcalculator">Arithmetic Calculator</a>
     
    </body>
</html>
