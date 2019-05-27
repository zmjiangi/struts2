<%--
  Created by IntelliJ IDEA.
  User: zmjiangi
  Date: 2019-5-24
  Time: 15:16
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
<s:debug></s:debug><br/>
<%--<s:form action="api-conversion-save">
    <s:textfield name="age" label="Age"></s:textfield>
    <s:submit></s:submit>
</s:form>--%>

<s:form action="api-conversion-save" theme="simple">
    Age: <s:textfield name="age" label="Age"></s:textfield>
    ${fieldErrors.age[0] }
    <br/>

    Birth:<s:textfield name="birth" label="Birth"></s:textfield>
    ${fieldErrors.birth[0] }
    <br/>

    <s:submit></s:submit>
</s:form>
</body>
</html>
