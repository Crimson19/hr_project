<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员登录页面</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form action="/admin/login.do" class="form-horizontal">
                <div class="form-group">
                    <label class="control-label col-sm-2">用户名：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="adminName" required>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">密码：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="password" name="adminPassword" required>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-4 col-sm-offset-2">
                        <input type="checkbox" value="on" name="isremember">
                        <label class="control-label">记住密码</label>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2">
                        <input class="btn-primary" type="submit" value="确定">
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
</body>
</html>