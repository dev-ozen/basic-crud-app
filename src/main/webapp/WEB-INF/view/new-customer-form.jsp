<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: Hasika
  Date: 5/29/2023
  Time: 7:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form:form action="new-customer" modelAttribute="customer" method="post">
    <div class="form-group">
        <label for="name">Customer Name</label>
        <form:input path="name" id="name"/>
    </div>
    <div class="form-group">
        <label for="name">Customer Salary</label>
        <form:input path="salary" id="salary"/>
    </div>
    <div>
        <button type="submit" class="btn btn-primary">Save Customer</button>
    </div>
</form:form>

</body>
</html>
