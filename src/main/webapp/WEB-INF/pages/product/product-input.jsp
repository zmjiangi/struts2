<%--
  Created by IntelliJ IDEA.
  User: zmjiangi
  Date: 2019-5-17
  Time: 14:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Input JSP</title>
</head>
<body>
<form action="product-query.action" method="post">
    name:<input name="name" type="text"/><br/><br/>
    desc:<input name="desc" type="text"/><br/><br/>
    price:<input name="price" type="text"/><br/><br/>
    <input type="submit" value="submit"/>
</form>
</body>
</html>
