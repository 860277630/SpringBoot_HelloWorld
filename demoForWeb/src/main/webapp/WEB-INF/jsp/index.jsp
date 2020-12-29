<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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

<p>Click the buttons below to perform actions.</p>
<div style="margin:20px 0;">
    <a href="/getAmArea" class="easyui-linkbutton" onclick="$('#am_area')">am_area</a>
    <a href="/getAmOrg" class="easyui-linkbutton" onclick="$('#am_org')">am_org</a>
    <a href="/getAmUser" class="easyui-linkbutton" onclick="$('#am_org')">am_user</a>
    <a href="/getAmUserOrg" class="easyui-linkbutton" onclick="$('#am_org')">am_user_org</a>
</div>
</body>
</html>