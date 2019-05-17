<%--
  Created by IntelliJ IDEA.
  User: zmjiangi
  Date: 2019-5-17
  Time: 14:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page isELIgnored="false" %>
<%@taglib prefix="s" uri="/struts-tags" %>
<html>
<head>
    <title>Details Page</title>
</head>
<body>
<s:debug></s:debug><br/><br/>
name--:<s:property value="[0].name"/><br/><br/>
desc--<s:property value="[1].desc"/><br/><br/>
price--<s:property value="[0].price"/><br/><br/>
price--<s:property value="price"/><br/><br/>

name:${name}<br/><br/>
desc:${desc}<br/><br/>
price:${price}
</body>
</html>
