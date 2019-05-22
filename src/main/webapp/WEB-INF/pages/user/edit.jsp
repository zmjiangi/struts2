<%--
  Created by IntelliJ IDEA.
  User: zmjiangi
  Date: 2019-5-21
  Time: 20:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Edit Page</title>
</head>
<body>
<s:debug></s:debug><br/>
<s:form action="api-user-update.action" method="POST">
    <s:textfield name="id" label="id"></s:textfield><br/><br/>
    <s:textfield name="firstName" label="firstName"></s:textfield><br/><br/>
    <s:textfield name="lastName" label="lastName"></s:textfield><br/><br/>
    <s:submit></s:submit>
</s:form>
</body>
</html>
