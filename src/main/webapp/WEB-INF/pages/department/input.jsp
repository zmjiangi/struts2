<%--
  Created by IntelliJ IDEA.
  User: zmjiangi
  Date: 2019-5-24
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>Input Page</title>
</head>
<body>
<s:form action="api-department-test" method="POST">
    <s:textfield name="name" label="DepartName"></s:textfield>
    <s:textfield name="manager.name" label="ManagerName"></s:textfield>
    <s:textfield name="manager.birth" label="ManagerBirth"></s:textfield>

    <s:textfield name="employees[0].firstName" label="employeeFirstName1"></s:textfield>
    <s:textfield name="employees[0].lastName" label="employeeLastName1"></s:textfield>
    <s:textfield name="employees[1].firstName" label="employeeFirstName2"></s:textfield>
    <s:textfield name="employees[1].lastName" label="employeeLastName2"></s:textfield>
    <s:submit></s:submit>
</s:form>
</body>
</html>
