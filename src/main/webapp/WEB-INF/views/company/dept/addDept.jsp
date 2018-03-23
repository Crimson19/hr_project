<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>增加部门</title>
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
</head>
<body>
<h3>${info}</h3>
<div class="container">
    <div class="row">
        <div class="col-md-8">
            <form action="/company/addDept.do" class="form-horizontal" method="post">
                <div class="form-group">
                    <label class="control-label col-sm-2" >部门名称：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="deptName" required>
                    </div>
                </div>
                <div class="form-group">
                    <label class="control-label col-sm-2">部门信息：</label>
                    <div class="col-sm-4">
                        <input class="form-control" type="text" name="deptInfo" required>
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-3">
                        <input class="btn-primary" type="submit" value="确定">
                        <input class="btn-primary" type="reset" value="重置">
                    </div>
                </div>
            </form>
            <a href="/admin/adminSuccess.do">返回</a>
        </div>
    </div>
</div>
</body>
</html>