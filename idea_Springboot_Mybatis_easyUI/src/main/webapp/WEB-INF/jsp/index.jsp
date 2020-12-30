<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<c:set var="basePath" value="${pageContext.request.contextPath}"></c:set>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="Pragma" content="no-cache">
    <meta http-equiv="Cache-Control" content="no-cache">
    <meta http-equiv="Expires" content="0">
    <meta http-equiv="X-UA-Compatible" content="IE=edge"/>
    <title>Insert title here</title>
    <link rel="stylesheet"  type="text/css" href="${basePath}/js/themes/default/easyui.css">
    <link rel="stylesheet"  type="text/css" href="${basePath}/js/themes/icon.css">
    <link rel="stylesheet"  type="text/css" href="${basePath}/css/demo.css">
    <script type="text/javascript" src="${basePath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${basePath}/js/jquery.easyui.min.js"></script>
</head>
<body>
<div style="margin:20px 0;"></div>

<table id="dg" title="My Users" class="easyui-datagrid" style="width:550px;height:250px"
       url="get_users.php"
       toolbar="#toolbar"
       rownumbers="true" fitColumns="true" singleSelect="true">
    <thead>
    <tr>
        <th data-options="field:'itemid',width:80">区域id</th>
        <th data-options="field:'productid',width:100">上级区域id</th>
        <th data-options="field:'listprice',width:80,align:'right'">区域名称</th>
        <th data-options="field:'unitcost',width:80,align:'right'">区域编号</th>
    </tr>
    </thead>
    <tbody>
    <tr>
        <td>${user.id }</td>
        <td>${user.userName }</td>
        <td>${user.passWord }</td>
        <td>${user.realName }</td>
    </tr>
    </tbody>
</table>
</body>
</html>