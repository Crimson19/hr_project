<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";%>
<html>
<head>
    <title>首页</title>
    <base href="<%= basePath%>">
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<h3>${info}</h3>
<a  class="btn  btn-primary" href="/visitor/reg.view">注册</a>
<a  class="btn  btn-primary" href="/visitor/login.view">游客登录</a>
<a  class="btn  btn-primary" href="/empolyee/login.view">员工登录</a>
</body>
</html>
