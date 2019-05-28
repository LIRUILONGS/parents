<%--
  Created by IntelliJ IDEA.
  User: 12249
  Date: 2019/5/28
  Time: 22:07
  To change this template use File | Settings | File Templates.
--%>

<%@ page import="java.util.ArrayList" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<html>
<head>
    <script type="text/javascript" src="js/html5.js"></script>
    <script type="text/javascript" src="js/respond.min.js"></script>
    <script type="text/javascript" src="js/PIE_IE678.js"></script>
    <![endif]-->
    <link type="text/css" rel="stylesheet" href="css/H-ui.css"/>
    <link type="text/css" rel="stylesheet" href="css/H-ui.admin.css"/>
    <link type="text/css" rel="stylesheet" href="font/font-awesome.min.css"/>
    <!--[if IE 7]>
    <link href="font/font-awesome-ie7.min.css" rel="stylesheet" type="text/css" />
    <![endif]-->
    <title>用户管理</title>

</head>
<body>
<nav class="Hui-breadcrumb"><i class="icon-home"></i> 首页 <span class="c-gray en">&gt;</span> 用户管理 <a class="btn btn-success radius r mr-20" style="line-height:1.6em;margin-top:3px" href="javascript:location.replace(location.href='infoListServlet');" title="刷新" ><i class="icon-refresh"></i></a></nav>
<div class="pd-20">
    <div class="text-c">
        <form action="findUserInfoServlet" method="post">
            <h3><font color="red" > ${requestScope.message}</font></h3>
            <input type="text" class="input-text" style="width:250px" placeholder="输入用户名称"" id="" name="userName">
            <button  type="submit" class="btn btn-success" id="" name=""><i class="icon-search" ></i> 搜用户</button>

        </form></div>
    <form action="listDeleteuserServlet" method="post">
        <div class="cl pd-5 bg-1 bk-gray mt-20"> <span class="l"><button type="submit" href="javascript:;" onClick="datadel('')" class="btn btn-danger radius"><i class="icon-trash"></i> 批量删除</button> <a href="javascript:;" onClick="user_add('550','','添加用户','user-add.jsp')" class="btn btn-primary radius"><i class="icon-plus"></i> 添加用户</a></span>
            <span class="r" >
                <c:if test="${pages.goPage!=1}"><a href="infoListServlet?pageStr=${pages.goPage-1}"> <span class="label label-success">上一页</span></a></c:if>
                |
                <c:if test="${pages.goPage!=pages.page}"><a href="infoListServlet?pageStr=${pages.goPage+1}"><span class="label label-success">下一页</span></a></c:if>
            </span>
            <span class="r">共有数据：<strong>${fn:length(userList)}</strong> 条</span> </div>
        <table class="table table-border table-bordered table-hover table-bg table-sort">
            <thead>
            <tr class="text-c">
                <th width="25"><input type="checkbox" name="" value=""></th>
                <th width="30">序号</th>
                <th width="100">用户名</th>
                <th width="100">姓名</th>
                <th width="100">类型</th>
                <th width="50">状态</th>
                <th width="50">最近登陆时间</th>
                <th width="100">操作</th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${requestScope.userList}" var="user" varStatus="vs">
                <tr class="text-c">
                    <td><input type="checkbox" value="${user.id}" name="delete"></td>
                    <td>${vs.index+1}</td>
                    <td>${user.username}</td>
                    <td>${user.name}</td>
                    <td>${user.type==1?"教师":"学生"}</td>
                    <td class="user-status">
                        <c:choose>
                        <c:when test="${user.status==1}" >
                        <span class="label label-success">正常</span></td>
                    </c:when>
                    <c:otherwise>
                        <span class="label">锁定</span></td>
                    </c:otherwise>
                    </c:choose>
                    <td>${user.lastLogin==null?"未登陆过！":user.lastLogin}</td>
                    <td class="f-14 user-manage">
                        <a style="text-decoration:none" href="javascript:;" title="查看" onclick="user_show('10001','400','500','用户：${user.username}','showUserInfoServlet?id=${user.id}&')"><i class="icon-eye-open"></i></a>
                        <a title="修改" href="javascript:;" onClick="user_edit('4','550','300','用户：${user.username}——信息修改','updateUserInfoServlet?id=${user.id}&')" class="ml-5" style="text-decoration:none"><i class="icon-edit"></i></a>
                        <a title="删除" href="javascript:;" onClick="user_del(this,'userDeleteServlet?id=${user.id}')" class="ml-5" style="text-decoration:none"><i class="icon-trash"></i></a>
                        <a style="text-decoration:none" class="ml-5" onClick="user_password_edit('10001','370','400','修改密码','user-password-edit.jsp?id=${user.id}')" href="javascript:;" title="重置密码"><i class="icon-key"></i></a>

                    </td>
                </tr></c:forEach>

            </tbody>
        </table>
    </form>
    <div id="pageNav" class="pageNav"></div>

</div>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="layer/layer.min.js"></script>
<script type="text/javascript" src="js/pagenav.cn.js"></script>
<script type="text/javascript" src="js/H-ui.js"></script>
<script type="text/javascript" src="plugin/My97DatePicker/WdatePicker.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/H-ui.admin.js"></script>
</body>
</html>
