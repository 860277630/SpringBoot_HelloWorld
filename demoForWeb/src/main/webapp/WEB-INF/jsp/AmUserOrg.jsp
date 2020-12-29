<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
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
    <link rel="stylesheet" type="text/css" href="${basePath}/js/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/js/themes/icon.css">
    <link rel="stylesheet" type="text/css" href="${basePath}/css/demo.css">
    <style type="text/css">
    </style>
    <script type="text/javascript" src="${basePath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${basePath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript">
        var tTD; //用来存储当前更改宽度的Table Cell,避免快速移动鼠标的问题
        var table = document.getElementById("tb_1");
        for (j = 0; j < table.rows[0].cells.length; j++) {


            table.rows[0].cells[j].onmousedown = function () {
//记录单元格
                tTD = this;
                if (event.offsetX > tTD.offsetWidth - 10) {
                    tTD.mouseDown = true;
                    tTD.oldX = event.x;
                    tTD.oldY = event.y;
                    tTD.oldWidth = tTD.offsetWidth;
                    tTD.oldHeight = tTD.offsetHeight;
                }
//记录Table宽度
//table = tTD; while (table.tagName != ‘TABLE') table = table.parentElement;
//tTD.tableWidth = table.offsetWidth;
            };


            table.rows[0].cells[j].onmouseup = function () {
//结束宽度调整
                if (tTD == undefined) tTD = this;
                tTD.mouseDown = false;
                tTD.style.cursor = 'default';
            };
            table.rows[0].cells[j].onmousemove = function () {
//更改鼠标样式
                if (event.offsetX > this.offsetWidth - 10)
                    this.style.cursor = 'col-resize';
                else
                    this.style.cursor = 'default';
//取出暂存的Table Cell
                if (tTD == undefined) tTD = this;
//调整宽度
                if (tTD.mouseDown != null && tTD.mouseDown == true) {
                    tTD.style.cursor = 'default';
                    if (tTD.oldWidth + (event.x - tTD.oldX) > 0)
                        tTD.width = tTD.oldWidth + (event.x - tTD.oldX);
                    if (tTD.oldHeight + (event.y - tTD.oldY) > 0)
                        tTD.height = tTD.oldHeight + (event.y - tTD.oldY);
//调整列宽
                    tTD.style.width = tTD.width;
                    tTD.style.Height = tTD.height;
                    tTD.style.cursor = 'col-resize';
//调整该列中的每个Cell
                    table = tTD;
                    while (table.tagName != 'TABLE') table = table.parentElement;
                    for (j = 0; j < table.rows.length; j++) {
                        table.rows[j].cells[tTD.cellIndex].width = tTD.width;
                        table.rows[j].cells[tTD.cellIndex].height = tTD.height;
                    }
//调整整个表
//                   table.width = tTD.tableWidth + (tTD.offsetWidth – tTD.oldWidth);
//                   table.style.width = table.width;
                }
            };
        }
    </script>
</head>
<body>
<div style="margin:20px 0;"></div>

<div style="margin:20px 0;">
    <a href="/outPut" class="easyui-linkbutton" onclick="$('#am_area')">导出</a>
</div>
<div class="easyui-layout" style="width:700px;height:400px;">
    <div data-options="region:'north',split:true" style="height:50px;border: 0px"></div>
    <div data-options="region:'south',split:true" style="height:50px;border: 0px"></div>
    <div data-options="region:'east',split:true" style="width:100px;border: 0px"></div>
    <div data-options="region:'west',split:true" style="width:100px;border: 0px"></div>
    <div data-options="region:'center'" style="width:60px;height:30px;border: 5px">
    <table id="dg" title="My Users" class="easyui-datagrid" style="width:100%;height:100%"
       toolbar="#toolbar"
       rownumbers="true" fitColumns="true" singleSelect="true">
    <thead>
    <tr>
        <th data-options="field:'itemid',width:80">userStateId</th>
        <th data-options="field:'productid',width:100">userInsuredId</th>
        <th data-options="field:'listprice',width:80,align:'right'">userCreateTime</th>
    </tr>
    </thead>

    <tbody>
    <c:forEach items="${users}" var="item" varStatus="vs">
        <tr>
            <td>${item.userStateId }</td>
            <td>${item.userInsuredId }</td>
            <td>${item.userCreateTime }</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</div>
</div>
<div style="margin-left: 13cm">
    <a id="btn" href="/" class="easyui-linkbutton" data-options="iconCls:'icon-back'">back</a>
</div>

<div id="rr" class="easyui-draggable  easyui-resizable" style="width:1000px;height:200px;border:5px solid red;">
    <table id="tb_1" cellspacing="0" cellpadding="2" width="100%" height="100%"  border="1">
        <tbody>
        <tr align="center" bgcolor="#dcdcdc">
            <td style="width:100px;">用户编号</td>
            <td>试用时间</td>
            <td>转正时间</td>
            <td>性别</td>
            <td>姓名拼音</td>
            <td>生日时间</td>
            <td>民族</td>
            <td>身高</td>
        </tr>
        <tr>
            <td>2000001</td>
            <td>1997-3-13</td>
            <td>1997-3-13</td>
            <td>1</td>
            <td>WZJ</td>
            <td>1965-3-13</td>
            <td>汉</td>
            <td>171</td>
        </tr>
        <tr>
            <td>2000045</td>
            <td>2001-2-15</td>
            <td>2001-3-15</td>
            <td>0</td>
            <td>WY</td>
            <td>1978-8-5</td>
            <td>汉</td>
            <td>162</td>
        </tr>
        <tr>
            <td>2000046</td>
            <td>2001-2-23</td>
            <td>2001-3-23</td>
            <td>0</td>
            <td>LQ</td>
            <td>2001-2-23</td>
            <td>汉</td>
            <td>171</td>
        </tr>
        </tbody>
    </table>
</div>
</body>
</html>