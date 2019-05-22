<%--
  Created by IntelliJ IDEA.
  User: zmjiangi
  Date: 2019-5-21
  Time: 9:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <title>List Page</title>
</head>
<body>
<s:debug></s:debug><br/>

<%--<form action="save">
    <input name="firstName" type="text"/><br/><br/>
    <input name="lastName" type="text"/><br/><br/>
    <input value="submit" type="submit"/><br/><br/>
</form>--%>

<s:form action="save">
    <s:textfield name="firstName" label="FirstName"></s:textfield>
    <s:textfield name="lastName" label="LastName"></s:textfield>

    <s:submit></s:submit>
</s:form>

<table border="1" cellpadding="1" cellspacing="1">
    <tr>
        <td>Id</td>
        <td>FirstName</td>
        <td>LastName</td>
        <td></td>
    </tr>
    <s:iterator value="#request.list" var="employee" >
        <tr>
            <td>${id}</td>
            <td>${firstName}</td>
            <td>${lastName}</td>
            <td>
                <a href="edit?id=${employee.id}">Edit</a>&nbsp;
                <a href="delete?id=${employee.id}">Delete</a>
            </td>
        </tr>
    </s:iterator>
</table>
</body>
</html>
