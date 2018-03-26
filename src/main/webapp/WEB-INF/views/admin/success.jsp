<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";%>
<html>
<head>
    <title>管理员</title>
    <base href="<%= basePath%>">
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/jquery-3.0.0.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <link href="/styles/font-awesome.css" rel="stylesheet">
    <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript" src="/scripts/google-maps.js"></script>
    <script>
        $(document).ready(function(){
            $(".vertical-nav").verticalnav({speed: 400,align: "left"});
            $.ajax({
                url:"message/adminGetMessageNumRecruit.view",
                type:"post",
                success:function (data) {
                    $("#messageNumberRecruit").html(data);
                    $("#allMessageNumber").html("新");
                }
            });
            $.ajax({
                url:"message/adminGetMessageNumInterview.view",
                type:"post",
                success:function (data) {
                    $("#messageNumberRecruit").html(data);
                    $("#allMessageNumber").html("新");
                }
            });
        });
    </script>
</head>
<body>
<div class="left-container">
    <div style="text-align:center;clear:both;">
        <script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
    </div>
    <div class="kePublic">
        <!--效果html开始-->
        <div class="content">
            <ul class="vertical-nav dark red">
                <li class="active">欢迎<a href="">${admin.adminName}</a></li>
                <li><i class="icon-cogs"></i>&nbsp;&nbsp;招聘
                    <span class="submenu-icon"></span>
                    <ul>
                        <li><a href="/recruit/addRecruit.view">新招聘</a></li>
                        <li><a href="">招聘管理</a></li>
                    </ul>
                </li>
                <li><i class="icon-cogs"></i>&nbsp;&nbsp;消息
                    <span class="submenu-icon"></span>
                    <span id="allMessageNumber"></span>
                    <ul>
                        <li><a href="/message/adminViewMessageNotRead.Recruit">招聘面试</a><span id="messageNumberRecruit"></span></li>
                        <li><a href="/message/adminViewMessageNotRead.interview">面试入职</a><span id="messageNumberInterview"></span></li>
                        <li><a href="">消息管理</a></li>
                    </ul>
                </li>
                <li><i class="icon-cogs"></i>&nbsp;&nbsp;员工管理
                    <span class="submenu-icon"></span>
                    <ul>
                        <li><a href="">考勤管理</a></li>
                        <li>
                            奖惩<span class="submenu-icon"></span>
                            <ul>
                                <li><a href="/rewardAndPunish/adminNewRewardAndPunish.entrance">新建奖惩</a></li>
                                <li><a href="/deptAndJob/showJob.view">奖罚管理 <span class="submenu-icon"></span></a></li>
                            </ul>
                        </li>
                        <li><a href="">工资管理</a></li>
                    </ul>
                </li>
                <li><i class="icon-cogs"></i>&nbsp;&nbsp;公司
                    <span class="submenu-icon"></span>
                    <ul>
                        <li><a href="/company/index.view">公司信息</a></li>
                        <li>
                            部门<span class="submenu-icon"></span>
                            <ul>
                                <li><a href="/company/addDept.view">新部门</a></li>
                                <li>
                                    <a href="/company/manageDept.view">部门管理 <span class="submenu-icon"></span></a>
                                </li>
                            </ul>
                        </li>
                        <li>
                            职位<span class="submenu-icon"></span>
                            <ul>
                                <a href="/company/addJob.view">新职位</a>
                            </ul>
                            <ul>
                                <a href="/deptAndJob/showJob.view">职位管理 <span class="submenu-icon"></span></a>
                            </ul>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
        <!--效果html结束-->
        <div class="clear"></div>
    </div>
</div>
</body>
</html>
