<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工登陆页面</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form action="/visitor/loginAsEmp.do" class="form-horizontal">
                <div class="form-group">
                    <label class="control-label col-sm-2">用户名：</label>
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