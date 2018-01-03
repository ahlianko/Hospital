<%--
  Created by IntelliJ IDEA.
  User: andre
  Date: 02.01.2018
  Time: 23:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="import" href="resources/includes.html"></link>
<html>
<head>
    <title>Registration</title><!-- Latest compiled and minified CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

    <!-- Optional theme -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css" integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">

    <!-- Latest compiled and minified JavaScript -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>
</head>
<body>



        <div align="center" >
        <h1>Registration form</h1><br>
            <form class="form-inline" method="post" action="">
                <div class="form-group">
                    <label for="username">User name:</label>
                    <input type="text" id="username" required placeholder="username" name="username"><br>
                </div>
                <div class="form-group">
                    <label for="password">Password:</label>
                    <input type="password" id ="password" required placeholder="password" name="password"><br>
                </div>
                <div class="form-group">
                    <label for="firstName">Firstname:</label>
                    <input type="text" id="firstName" required placeholder="firstName" name="firstName"><br>
                </div>
                <div class="form-group">
                    <label for="lastName">Lastname:</label>
                    <input type="text" id="lastName" required placeholder="lastName" name="lastName"><br>
                </div>
                    <input class="btn btn-info" type="submit" value="Register">
            </form>
            <c:if test="${sessionScope.success eq 1}">
                <div class="alert alert-success">
                    <strong>Registration successfull!</strong> Now you can log in with your login and password.
                </div>
            </c:if>
        </div>
        <div align="center">
        <button class="btn btn-info">
            <a href="/index.jsp">Go back</a>
        </button>
        </div>

</div>
</body>
</html>
