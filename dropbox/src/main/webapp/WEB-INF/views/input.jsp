<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: 12249
  Date: 2019/5/28
  Time: 15:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form:form action="${pageContext.request.contextPath}/user/opt" modelAttribute="user">
    <fieldset>
        <legend>用户登录</legend>
        <p>
           <span style=" color: brown ;"> ${sessionScope.logUser}</span>
        </p>
        <p>
            <label>用户名：</label>
            <form:input path="username"/>
        </p>
        <p>
            <label>密码：</label>
            <form:password path="password"/>
        </p>
        <%--<p>
            <label>角色</label>
         <form:select path="role">
                <option />请选择角色
                <form:options items="${role}" />
         </form:select>
        </p>--%>
        <p>
            <label>是否同意此协议</label>
            <input type="checkbox" value="y" name="protocol" >
        </p>
        <p>
            <span  style="font-weight: bold;"/>
            <input  type="reset" value="重置">
            <input  type="submit" value="添加">
        </p>
    </fieldset>
</form:form>


</body>
</html>
