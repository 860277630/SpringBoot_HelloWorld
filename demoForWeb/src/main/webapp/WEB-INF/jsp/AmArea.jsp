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
    <style type="text/css">
        .tb{
            position: relative;
            border: 1px solid #95B8E7;
            background-color: #cccccc;
            vertical-align: middle;
            display: inline-block;
            overflow: hidden;
            white-space: nowrap;
            outline: none;
            margin: 0;
            padding: 0;
            width:300px;
            height: 22px;
            -moz-border-radius: 5px 5px 5px 5px;
            -webkit-border-radius: 5px 5px 5px 5px;
            border-radius: 5px 5px 5px 5px;
            font-size: 12px;
        }
    </style>
    <script type="text/javascript" src="${basePath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${basePath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript">
        //初始化数据
        $(function(){
            //年份初始化
            $('#feeDate').combobox({
                url:'getYears',
                valueField:'yearId',
                textField:'yearName'
            });

            //月日初始化
            $('#feeMonDay').combobox({
                url:'getMonDays',
                valueField:'MDId',
                textField:'MDName'
            });
            $('#eee').textbox('textbox').css('background-color','#ff00ff');

        });
    </script>
</head>
<body>
<div style="margin:20px 0;"></div>
支持联想查询：<input  title="年份" style="width: 75px;" type="text" name="feeDate" id="feeDate" value=""/>
支持联想查询：<input  title="月日" style="width: 85px;" type="text" name="feeMonDay" id="feeMonDay" value=""/>

<input  data-options = "width:'20%',readonly:true" class="easyui-textbox" name="eee" id="eee" value="dsdsdsdssdsd"/>

<input  class= "tb" id="tb" type="text" readonly="readonly"  value="d4s56ad46a5">

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
        <th data-options="field:'areaCode',width:80,align:'right'">区域等级</th>
        <th data-options="field:'areaLevel',width:80,align:'right'">区域排序</th>
        <th data-options="field:'areaLeaf',width:80,align:'right'">叶子区域</th>
        <th data-options="field:'areaState',width:80,align:'right'">区域状态</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${users}" var="item" varStatus="vs">
        <tr >
            <td>${item.areaId }</td>
            <td>${item.areaParentId }</td>
            <td>${item.areaName }</td>
            <td>${item.areaCode }</td>
            <td>${item.areaLevel }</td>
            <td>${item.areaSeq }</td>
            <td>${item.areaLeaf }</td>
            <td>${item.areaState }</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<div style="margin-left: 13cm">
    <a id="btn" href="/" class="easyui-linkbutton" data-options="iconCls:'icon-back'">back</a>
</div>
</body>
</html>