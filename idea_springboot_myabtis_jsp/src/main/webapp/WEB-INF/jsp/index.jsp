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
    <link rel="stylesheet"  type="text/css" href="${basePath}/css/demo.css">
    <script type="text/javascript" src="${basePath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${basePath}/js/jquery.js"></script>
</head>
<body>
<button onclick="test01()">SEND A GET REQUEST</button>
<button onclick="test02()">SEND A POST REQUEST</button>
<table  style = "border:2px solid #000000">
    <tr><td>ID:</td><td>${user.id}</td></tr>
    <tr><td>userName:</td><td >${user.userName}</td></tr>
    <tr><td>passWord:</td><td >${user.passWord}</td></tr>
    <tr><td>realName:</td><td >${user.realName}</td></tr>
</table>
</body>

<script type="text/javascript">
    function  test01(){
        alert("触发点击事件1");
        $.ajax({
            url:"/GetUserById/1",//要请求的服务器url
            async:true,//是否是异步请求
            cache:false,//是否缓存结果
            type:"GET",//请求方式
            dataType:"text",//服务器返回什么类型数据 text xml javascript json(javascript对象)
            success:function(result){//函数会在服务器执行成功后执行，result就是服务器返回结果
                console.log(result);
                alert(result);
            },
            error:function(jqXHR, textStatus, errorThrown) {

            }
        });
    }
    function  test02(){
        alert("触发点击事件2");
        $.ajax({
            url:"/PostUserById",//要请求的服务器url
            data:{id:1},//第一个name对应的是后端request.getParameter("name")的name、第二个name对应的是此js中的var name = $("#name").val();的name
            async:true,//是否是异步请求
            cache:false,//是否缓存结果
            type:"POST",//请求方式
            dataType:"text",//服务器返回什么类型数据 text xml javascript json(javascript对象)
            success:function(result){//函数会在服务器执行成功后执行，result就是服务器返回结果
                console.log(result);
                alert(result);
            },
            error:function(jqXHR, textStatus, errorThrown) {

            }
        });
    }
</script>
</html>