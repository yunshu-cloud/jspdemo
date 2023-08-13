<%--
  Created by IntelliJ IDEA.
  User: wangzhixiong
  Date: 2023/8/13
  Time: 12:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <table border="1" align="center">
    <tr>
      <th>Map_Key</th>
      <th>用户ID</th>
      <th>用户姓名</th>
    </tr>
    <c:forEach items="${map}" var="u">
      <tr>
        <td>${u.key}</td>
        <td>${u.value.userid}</td>
        <td>${u.value.username}</td>
      </tr>
    </c:forEach>

  </table>
</body>
</html>
