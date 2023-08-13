<%--
  Created by IntelliJ IDEA.
  User: wangzhixiong
  Date: 2023/8/13
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <%
      String header = (String)request.getAttribute("jsp_header");
  %>
  <font color="blue"><%= header%></font>
</body>
</html>
