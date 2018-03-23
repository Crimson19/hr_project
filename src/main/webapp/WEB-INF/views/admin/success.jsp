<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + request.getContextPath() + "/";%>
<html>
<head>
    <title>管理员</title>
    <base href="<%= basePath%>">
    <link href="/styles/bootstrap.min.css" rel="stylesheet">
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <script src="/scripts/bootstrap.min.js"></script>
    <script src="/scripts/jquery-3.3.1.min.js"></script>
    <link href="/styles/font-awesome.css" rel="stylesheet">
    <script src="http://cdn.static.runoob.com/libs/jquery/1.10.2/jquery.min.js"></script>
    <script type="text/javascript" src="/scripts/google-maps.js"></script>
    <script>
        $(document).ready(function(){
            $(".vertical-nav").verticalnav({speed: 400,align: "left"});});
    </script>
</head>
<body>
<div class="left-container">
    <div style="text-align:center;clear:both;">
        <script src="/gg_bd_ad_720x90.js" type="text/javascript"></script>
    </div>
    <div class="kePublic">
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
                <li><i class="icon-cogs"></i>&nbsp;&nbsp;面试
                    <span class="submenu-icon"></span>
                    <ul>
                        <li><a href="">新面试</a></li>
                        <li><a href="">面试管理</a></li>
                    </ul>
                </li>
                <li><i class="icon-cogs"></i>&nbsp;&nbsp;培训
                    <span class="submenu-icon"></span>
                    <ul>
                        <li><a href="">新培训</a></li>
                        <li><a href="">培训管理</a></li>
                    </ul>
                </li>
                <li><i class="icon-cogs"></i>&nbsp;&nbsp;员工
                    <span class="submenu-icon"></span>
                    <ul>
                        <li><a href="">员工管理</a></li>
                        <li><a href="">员工考核</a></li>
                    </ul>
                </li>
                <li><i class="icon-cogs"></i>&nbsp;&nbsp;公司
                    <span class="submenu-icon"></span>
                    <ul>
                        <li><a href="/company/index.view">公司信息</a></li>
                        <li>
                            <a href="">部门<span class="submenu-icon"></span></a><ul>
                            <li><a href="/company/addDept.view">新部门</a></li>
                            <li>
                                <a href="/company/manageDept.view">部门管理 <span class="submenu-icon"></span></a>
                            </li>
                            <li>
                                <a href="">职位<span class="submenu-icon"></span></a>
                                <ul>
                                    <li><a href="/company/addJob.view">新职位</a></li>
                                    <li>
                                        <a href="/company/managerJob.view">职位管理 <span class="submenu-icon"></span></a>
                                    </li>
                                </ul>
                            </li>
                        </ul>
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
