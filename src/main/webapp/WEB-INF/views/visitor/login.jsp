<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<form action="/visitor/login.do">
    用户名<input type="text" name="visitorName" required><br/>
    密码<input type="password" name="visitorPassword" required><br/>
    是否记住密码<input type="checkbox" value="on" name="isremember">
    <input type="submit" value="登录">

</form>
</body>
</html>
