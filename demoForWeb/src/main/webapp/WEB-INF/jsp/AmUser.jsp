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
    <script type="text/javascript">


    </script>
</head>
<body>
<div style="margin:20px 0;"></div>
<table id="dg" title="My Users" class="easyui-datagrid" style="width:550px;height:250px"
       url="get_users.php"
       toolbar="#toolbar"
       rownumbers="true" fitColumns="true" singleSelect="true">
    <thead>
    <tr>
        <th data-options="field:'itemid',width:80">userId</th>
        <th data-options="field:'productid',width:100">userOpenId</th>
        <th data-options="field:'listprice',width:80,align:'right'">userMobile</th>
        <th data-options="field:'unitcost',width:80,align:'right'">userNo</th>
        <th data-options="field:'areaCode',width:80,align:'right'">userName</th>
        <th data-options="field:'areaLevel',width:80,align:'right'">userPhoto</th>
        <th data-options="field:'areaLeaf',width:80,align:'right'">userTypeId</th>
        <th data-options="field:'areaState',width:80,align:'right'">userFocusStateId</th>
        <th data-options="field:'accountId',width:80,align:'right'">accountId</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${users}" var="item" varStatus="vs">
        <tr >
            <td>${item.userId }</td>
            <td>${item.userOpenId }</td>
            <td>${item.userMobile }</td>
            <td>${item.userNo }</td>
            <td>${item.userName }</td>
            <td>${item.userPhoto }</td>
            <td>${item.userTypeId }</td>
            <td>${item.userFocusStateId }</td>
            <td>${item.accountId }</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<div style="margin-left: 13cm">
    <a id="btn" href="/" class="easyui-linkbutton" data-options="iconCls:'icon-back'">back</a>
</div>

</body>
</html>