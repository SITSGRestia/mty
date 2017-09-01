<%--
  Created by IntelliJ IDEA.
  User: luoliwen
  Date: 2017/8/23
  Time: 下午12:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
%>
<html>
<head>
    <title>创建用户</title>
    <link href="<%=path%>/css/bootstrap.min.css" rel="stylesheet"
          type="text/css">
</head>
<body>
<div class="panel panel-info">
    <div class="panel-heading">
        <h3 class="panel-title">注册用户</h3>
    </div>
    <div class="panel-body">
        <form class="form-horizontal" method="post" role="form" action="/createUser">
            <div class="form-group">
                <label for="firstname" class="col-sm-2 control-label">账号：</label>
                <div class="col-sm-6">
                    <input type="text" class="form-control" name="username" id="firstname" placeholder="请输入账号">
                </div>
            </div>
            <div class="form-group">
                <label for="lastname" class="col-sm-2 control-label">密码：</label>
                <div class="col-sm-6">
                    <input type="password" class="form-control" name="password" id="lastname" placeholder="请输入密码">
                </div>
            </div>

            <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                    <button type="submit" class="btn btn-default">注册</button>
                </div>
            </div>
        </form>
    </div>
</div>
</body>
</html>
