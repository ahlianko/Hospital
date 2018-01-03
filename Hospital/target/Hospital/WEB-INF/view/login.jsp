<%--
  Author: Pavel Ravvich.
  Date: 14.10.17.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="import" href="resources/includes.html"></link>
<html>
<head>
    <title>Login</title>
    <!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>



        <h1 align="center">Вход в систему</h1><br>
        <div align="center">
        <form class="form-inline" method="post" action="">
            <div class="form-group">
            <label for="username">User name:</label>
            <input type="username" id="username" class="form-control" required placeholder="username" name="username">
            </div>
            <div class="form-group">
            <label for="password">Password:</label>
            <input type="password" id="password" class="form-control" required placeholder="password" name="password">
            </div>
            <input class="btn btn-primary" type="submit" value="Войти">
        </form>
        </div>
        <div align="center">
        <a class="btn btn-info" href="/registration">Sign in</a>
        <a class="btn btn-info" href="/index.jsp">Main page</a>
        </div>
</body>
</html>
