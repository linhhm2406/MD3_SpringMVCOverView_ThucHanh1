<%--
  Created by IntelliJ IDEA.
  User: LinhHM
  Date: 5/28/2020
  Time: 11:38 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>There are ${list.size()} customer(s) in list.</h2>
<h3>Customer List</h3>
<table>
    <tr>
        <th>Id</th>
        <th>Name</th>
        <th>Email</th>
        <th>Address</th>
    </tr>
    <c:forEach items="${list}" var="customer">
        <tr>
            <td>${customer.getId()}</td>
            <td><a href="/customers/${customer.getId()}">${customer.getName()}</a></td>
            <td>${customer.getEmail()}</td>
            <td>${customer.getAddress()}</td>
        </tr>
    </c:forEach>
</table>

<style>
    table{
        border: 1px solid black;
    }
    th, td  {
        border: dotted 1px black;
    }
</style>
</body>
</html>
