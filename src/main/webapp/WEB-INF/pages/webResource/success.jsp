<%--
  Created by IntelliJ IDEA.
  User: zmjiangi
  Date: 2019-5-20
  Time: 8:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Success Page</title>
</head>
<body>
<s:debug></s:debug><br/><br/>
requestKey-:${requestScope.requestKey}-<s:property value="#request.requestKey"></s:property><br/><br/>
sessionKey-:${sessionScope.sessionKey}-<s:property value="#session.sessionKey"></s:property><br/><br/>
applicationKey-:${applicationScope.applicationKey}-<s:property value="#application.applicationKey"></s:property><br/><br/>


</body>
</html>
