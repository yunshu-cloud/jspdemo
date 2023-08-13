<%--
  Created by IntelliJ IDEA.
  User: wangzhixiong
  Date: 2023/8/13
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:if test="true">
        Hello World
    </c:if>
    <c:choose>
        <c:when test="${1==1}">
            Hello When
        </c:when>
        <c:otherwise>
            Hello Otherwise
        </c:otherwise>
    </c:choose>
    <hr/>
    <c:forEach begin="0" end="9" step="2" varStatus="status">
        For Each...${status.count}
    </c:forEach>

</body>
</html>
