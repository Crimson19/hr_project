<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
</head>
<body>
<form action="/visitor/reg.do">
    用户名<input type="text" name="visitorName" required><br/>
    密码<input type="password" name="visitorPassword" required><br/>
    邮箱<input type="email" name="visitorEmail"><br/>
    手机号<input type="text" name="visitorPhone">
    <input type="submit" value="注册">

</form>

</body>
</html>
