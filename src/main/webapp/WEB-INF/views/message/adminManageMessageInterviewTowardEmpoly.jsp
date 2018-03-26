<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";%>
<html>
<head>
    <title>$Title$</title>
    <base href="<%= basePath%>">
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/ajax.js"></script>
    <script>
        function del(trIndex,messageId) {
            $.ajax({
                url:"message/delMessage.do",
                data:messageId,
                success:function (data) {
                    alert(data);
                }
            });
        }function overRead(trIndex,messageId) {
            $.ajax({
                url:"message/readMessage.do",
                data:messageId,
                success:function (data) {
                    alert(data);
                }
            });
        }function employ(messageId,targetId,content) {
            var sal=prompt("请输入工资","2000.00");
            var deptAndJobId = prompt("请输入公司部门id","0");
            $.ajax({
                url:"empolyee/changeVisitorToEmpolyeeByInterviewMessage.do",
                data:{"messageId":messageId,"messageContent":content,"messageTargetId":targetId,"sal":sal,"deptAndJobId":deptAndJobId},
                success:function (info) {
                    alert(info);
                }
            });
        }
    </script>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <table class="table table-bordered">
                <tr>
                    <th>消息详情</th>
                    <th>消息类型</th>
                    <th>时间</th>
                    <th>操作</th>
                </tr>
                <c:forEach items="${messageList}" var="message">
                    <tr>
                        <td><c:out value="${message.messageContent}"></c:out></td>
                        <td><c:out value="${message.messageType}"></c:out></td>
                        <td><c:out value="${message.createTime}"></c:out></td>
                        <td>
                            <button class="btn btn-danger" id="delMessage" onclick="del(this,${message.id})">删除</button>
                            <button class="btn btn-success" id="readMessage" onclick="overRead(this,${message.id})">我知道了</button>
                            <button class="btn btn-link" id="interviewMessage" onclick="employ(${message.id},${message.senderId},${message.noticeContent})">成为同事</button>
                        </td>
                    </tr>
                </c:forEach>
            </table>
            <a href="/admin/adminSuccess.do">返回</a>
        </div>
    </div>
</div>
</body>
</html>