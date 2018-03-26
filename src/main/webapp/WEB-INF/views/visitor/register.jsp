<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";%>
<html>
<head>
    <title>注册页面</title>
    <base href="<%= basePath%>">
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form action="/visitor/reg.do" class="form-horizontal">
                <div class="form-group">
                    <label class="control-label col-sm-2" >用户名：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="visitorName" required>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">密码：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="password" name="visitorPassword" required>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">性别：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="visitorGender">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">年龄：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="visitorAge">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">手机号：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="visitorPhone">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">邮箱：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="email" name="visitorEmail">
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">照片：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="file" name="visitorPhoto">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-3">
                        <input class="btn-primary" type="submit" value="确定">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>
