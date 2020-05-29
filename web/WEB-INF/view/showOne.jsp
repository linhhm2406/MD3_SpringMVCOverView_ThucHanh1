<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: LinhHM
  Date: 5/29/2020
  Time: 12:39 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<fieldset>
    <legend>Customer Information</legend>
    <form:form action="/customers/update" method="post">
        <table>
            <tr>
                <th>Id</th>
                <td><input type="hidden" name="id" value="${customer.id}">${customer.id}</td>
            </tr>
            <tr>
                <th>Name</th>
                <td><input type="text" name="name" value="${customer.name}"></td>
            </tr>
            <tr>
                <th>Email</th>
                <td><input type="text" name="email" value="${customer.email}"></td>
            </tr>
            <tr>
                <th>Address</th>
                <td><input type="text" name="address" value="${customer.address}"></td>
            </tr>
            <tr>
                <th><input type="submit" value="Update"></th>
            </tr>
        </table>
    </form:form>
</fieldset>
<a href="/customers">Back To List</a>
</body>
</html>
