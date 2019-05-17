<%--
  Created by IntelliJ IDEA.
  User: zmjiangi
  Date: 2019-5-17
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>User Info Page</title>
</head>
<body>
Welcome:${sessionScope.username}<br/><br/>
Welcome:Number of users online: ${applicationScope.loginCount}<br/><br/>
<a href="logout.action">Log out</a>
</body>
</html>
