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
        function alertMessage() {
            $.messager.alert("alert消息提示框", "alert消息提示内容", "info", function() {
                //在窗口关闭的时候触发该回调函数。
            });
        }

        function confirmMessage() {

            $.messager.confirm("confirm消息提示框", "confirm消息提示内容", function(res) {
                if (res) {
                    $.messager.alert("提示", "用户选择了是", "info");
                } else {
                    $.messager.alert("提示", "用户选择了否", "info");
                }
            });
        }

        function promptMessage() {
            $.messager.prompt("prompt消息提示框", "请输入姓名", function(res) {
                if (res) {
                    $.messager.alert("提示", "您的姓名是" + res, "info");
                }

            })
        }

        function progressMessage() {

            $.messager.progress({
                title : "progress Title",
                msg : "进度条内容",
                text : "进度条上的内容",
                interval : 1000        //每次进度更新的间隔时间为1000毫秒

            });

        }
    </script>
</head>

<body>
<div style="margin:20px 0;"></div>



<pre>

    <input type="button" value="调用alert消息提示框" onclick="alertMessage();">

    <input type="button" value="调用confirm消息提示框" onclick="confirmMessage();">

    <input type="button" value="调用prompt消息提示框" onclick="promptMessage();">

    <input type="button" value="调用progress消息提示框"
           onclick="progressMessage();">
</pre>


<div class="easyui-resizable" data-options="minWidth:50,minHeight:50" style="width:200px;height:150px;border:1px solid #ccc;">
<table id="dg" title="My Users" class="easyui-datagrid" style="width:550px;height:250px"
       url="get_users.php"
       toolbar="#toolbar"
       rownumbers="true" fitColumns="true" singleSelect="true">
    <thead>
    <tr>
        <th data-options="field:'itemid',width:80">orgId</th>
        <th data-options="field:'productid',width:100">orgParentId</th>
        <th data-options="field:'listprice',width:80,align:'right'">orgCode</th>
        <th data-options="field:'unitcost',width:80,align:'right'">orgName</th>
        <th data-options="field:'areaCode',width:80,align:'right'">orgTypeId</th>
        <th data-options="field:'areaLevel',width:80,align:'right'">orgStateId</th>
        <th data-options="field:'areaLeaf',width:80,align:'right'">areaId</th>
        <th data-options="field:'areaState',width:80,align:'right'">orgAddress</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${users}" var="item" varStatus="vs">
        <tr >
            <td>${item.orgId }</td>
            <td>${item.orgParentId }</td>
            <td>${item.orgCode }</td>
            <td>${item.orgName }</td>
            <td>${item.orgTypeId }</td>
            <td>${item.orgStateId }</td>
            <td>${item.areaId }</td>
            <td>${item.orgAddress }</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
<div style="margin-left: 13cm">
    <a id="btn" href="/" class="easyui-linkbutton" data-options="iconCls:'icon-back'">back</a>
</div>




</body>
</html>