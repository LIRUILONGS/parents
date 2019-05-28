<%--
  Created by IntelliJ IDEA.
  User: 12249
  Date: 2019/5/27
  Time: 23:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" isELIgnored="false" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/user/add" modelAttribute="user">
    <fieldset>
        <legend>用户注册</legend>
        <table>
            <p>
                <span style=" color: brown ;"> ${sessionScope.message}</span>
            </p>

        <p><tr>
            <label>用户名：</label>
            <form:input path="username"/>
        </tr>
        </p>
        <p>
            <label>请输入您的密码：</label>
            <form:password path="password" id="password"/>
        </p>
        <p>
            <label>请在次输入您的密码：</label>
            <input type="password" name="passwords">
        </p>
        <p>
            <label>是否同意此协议</label>
            <input type="checkbox" value="y" name="protocol" >
        </p>
        <p>
            <span  style="font-weight: bold;"/>
            <input  type="reset" value="重置">
            <input  type="submit" value="添加">
        </p>
        </table>
    </fieldset>
</form:form>


</body>
</html>
