<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<<<<<<< HEAD
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
=======
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
>>>>>>> origin/lijinhui
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title>后台管理中心</title>  
    <link rel="stylesheet" href="../css/pintuer.css">
    <link rel="stylesheet" href="../css/admin.css">
    <script src="../js/jquery.js"></script>
</head>
<body style="background-color:#f2f9fd;">
<div class="header bg-main">
  <div class="logo margin-big-left fadein-top">
    <h1><img src="images/y.jpg" class="radius-circle rotate-hover" height="50" alt="" />后台管理中心</h1>
  </div>
  <div class="head-l"><a class="button button-little bg-green" href="" target="_blank"><span class="icon-home"></span> 前台首页</a> &nbsp;&nbsp;<a href="##" class="button button-little bg-blue"><span class="icon-wrench"></span> 清除缓存</a> &nbsp;&nbsp;<a class="button button-little bg-red" href="login.jsp"><span class="icon-power-off"></span> 退出登录</a> </div>
</div>
<div class="leftnav">
  <div class="leftnav-title"><strong><span class="icon-list"></span>菜单列表</strong></div>
  <h2><span class="icon-pencil-square-o"></span>酒店管理</h2>
  <ul>
<<<<<<< HEAD
<<<<<<< HEAD
    <li><a href="/hotel/findByPage" target="right"><span class="icon-caret-right"></span>分页查询酒店</a></li>
=======
=======
>>>>>>> origin/wanglei
    <li><a href="list.jsp" target="right"><span class="icon-caret-right"></span>查看酒店</a></li>
    <li><a href="add.jsp" target="right"><span class="icon-caret-right"></span>添加酒店</a></li>
    <li><a href="cate.html" target="right"><span class="icon-caret-right"></span>删除酒店</a></li>
      <li><a href="cate.html" target="right"><span class="icon-caret-right"></span>更新酒店</a></li>
>>>>>>> origin/lijinhui
  </ul>
    <h2><span class="icon-pencil-square-o"></span>景点管理</h2>
    <ul>
<<<<<<< HEAD
        <li><a href="list.jsp" target="right"><span class="icon-caret-right"></span>查看景点</a></li>
        <li><a href="add.jsp" target="right"><span class="icon-caret-right"></span>添加景点</a></li>
=======
        <li><a href="/attraction/findByPage.do" target="right"><span class="icon-caret-right"></span>查看景点</a></li>
        <li><a href="/attarction/toAdd.do" target="right"><span class="icon-caret-right"></span>添加景点</a></li>
>>>>>>> origin/wanglei
        <li><a href="cate.html" target="right"><span class="icon-caret-right"></span>删除景点</a></li>
        <li><a href="cate.html" target="right"><span class="icon-caret-right"></span>更新景点</a></li>
    </ul>
    <h2><span class="icon-pencil-square-o"></span>美食管理</h2>
    <ul>
<<<<<<< HEAD
        <li><a href="/restaurant/findByPage.do" target="right"><span class="icon-caret-right"></span>查看美食</a></li>
        <li><a href="/restaurant/toAdd.do" target="right"><span class="icon-caret-right"></span>添加美食</a></li>
=======
        <li><a href="list.jsp" target="right"><span class="icon-caret-right"></span>查看美食</a></li>
        <li><a href="add.jsp" target="right"><span class="icon-caret-right"></span>添加美食</a></li>
        <li><a href="cate.html" target="right"><span class="icon-caret-right"></span>删除美食</a></li>
        <li><a href="cate.html" target="right"><span class="icon-caret-right"></span>更新美食</a></li>
>>>>>>> origin/wanglei
    </ul>

</div>
<script type="text/javascript">
$(function(){
  $(".leftnav h2").click(function(){
	  $(this).next().slideToggle(200);	
	  $(this).toggleClass("on"); 
  })
  $(".leftnav ul li a").click(function(){
	    $("#a_leader_txt").text($(this).text());
  		$(".leftnav ul li a").removeClass("on");
		$(this).addClass("on");
  })
});
</script>
<ul class="bread">
  <li><a href="{:U('Index/info')}" target="right" class="icon-home"> 首页</a></li>
  <li><a href="##" id="a_leader_txt">网站信息</a></li>
  <li><b>当前语言：</b><span style="color:red;">中文</span>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;切换语言：<a href="##">中文</a> &nbsp;&nbsp;<a href="##">英文</a> </li>
</ul>
<div class="admin">
  <iframe scrolling="auto" rameborder="0" src="info.html" name="right" width="100%" height="100%"></iframe>
</div>
</body>
</html>