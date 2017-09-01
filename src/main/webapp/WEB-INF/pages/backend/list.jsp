<%@ page contentType="text/html; charset=UTF-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="../css/pintuer.css">
<link rel="stylesheet" href="../css/admin.css">
<script src="../js/jquery.js"></script>
<script src="../js/pintuer.js"></script>
<script type="text/javascript" src="../js/jquery-3.0.0.js"></script>
<script type="text/javascript">

      //搜索
      function changesearch(restaurantPage){
          windows.location.href="restaurant/findByPage.do ? restaurantPage = "+restaurantPage;
      }

      //单个删除
      function del(res_id){
          if(confirm("您确定要删除吗?")){
              window.location.href = "/restaurant/deleteRestaurant.do?res_id="+res_id ;
          }
      }

      //批量删除
      function DelSelect(){
          var Checkbox=false;
          $("input[name='id[]']").each(function(){
              if (this.checked==true) {
                  Checkbox=true;
              }
          });
          if (Checkbox){
              var t=confirm("您确认要删除选中的内容吗？");
              if (t==false) return false;
              $("#listform").submit();
          }
          else{
              alert("请选择您要删除的内容!");
              return false;
          }
      }

      //批量排序
      function sorts(){
          var Checkbox=false;
          $("input[name='id[]']").each(function(){
              if (this.checked==true) {
                  Checkbox=true;
              }
          });
          if (Checkbox){

              $("#listform").submit();
          }
          else{
              alert("请选择要操作的内容!");
              return false;
          }
      }


      //批量首页显示
      function changeishome(o){
          var Checkbox=false;
          $("input[name='id[]']").each(function(){
              if (this.checked==true) {
                  Checkbox=true;
              }
          });
          if (Checkbox){

              $("#listform").submit();
          }
          else{
              alert("请选择要操作的内容!");

              return false;
          }
      }

      //批量推荐
      function changeisvouch(o){
          var Checkbox=false;
          $("input[name='id[]']").each(function(){
              if (this.checked==true) {
                  Checkbox=true;
              }
          });
          if (Checkbox){


              $("#listform").submit();
          }
          else{
              alert("请选择要操作的内容!");

              return false;
          }
      }

      //批量置顶
      function changeistop(o){
          var Checkbox=false;
          $("input[name='id[]']").each(function(){
              if (this.checked==true) {
                  Checkbox=true;
              }
          });
          if (Checkbox){

              $("#listform").submit();
          }
          else{
              alert("请选择要操作的内容!");

              return false;
          }
      }


      //批量移动
      function changecate(o){
          var Checkbox=false;
          $("input[name='id[]']").each(function(){
              if (this.checked==true) {
                  Checkbox=true;
              }
          });
          if (Checkbox){

              $("#listform").submit();
          }
          else{
              alert("请选择要操作的内容!");

              return false;
          }
      }

      //批量复制
      function changecopy(o){
          var Checkbox=false;
          $("input[name='id[]']").each(function(){
              if (this.checked==true) {
                  Checkbox=true;
              }
          });
          if (Checkbox){
              var i = 0;
              $("input[name='id[]']").each(function(){
                  if (this.checked==true) {
                      i++;
                  }
              });
              if(i>1){
                  alert("只能选择一条信息!");
                  $(o).find("option:first").prop("selected","selected");
              }else{

                  $("#listform").submit();
              }
          }
          else{
              alert("请选择要复制的内容!");
              $(o).find("option:first").prop("selected","selected");
              return false;
          }
      }

      //换页
      function findByCondition(currentPage){
          var cur = $("#currentPage");
          cur.val(currentPage);
          $("#listform").submit();
      }

      function findByCondition1(currentPage){
          $("#listform").submit();
      }

  </script>
</head>
<body>
<form method="post" action="/restaurant/findByPage.do" id="listform">
  <!-- 利用隐藏表单域记录
       当前页      currentPage
   -->
  <input type="hidden" name="currentPage" id="currentPage" value="${restaurantPage.currentPage}">
  <div class="panel admin-panel">
    <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
    <div class="padding border-bottom">
      <ul class="search" style="padding-left:10px;">
        <li> <a class="button border-main icon-plus-square-o" href="/restaurant/toAdd.do"> 添加内容</a> </li>
        <li>搜索：</li>
        <li>首页
          <select name="s_ishome" class="input" onchange="changesearch()" style="width:60px; line-height:17px; display:inline-block">
            <option value="">选择</option>
            <option value="1">是</option>
            <option value="0">否</option>
          </select>
          &nbsp;&nbsp;
          推荐
          <select name="s_isvouch" class="input" onchange="changesearch()"  style="width:60px; line-height:17px;display:inline-block">
            <option value="">选择</option>
            <option value="1">是</option>
            <option value="0">否</option>
          </select>
          &nbsp;&nbsp;
          置顶
          <select name="s_istop" class="input" onchange="changesearch()"  style="width:60px; line-height:17px;display:inline-block">
            <option value="">选择</option>
            <option value="1">是</option>
            <option value="0">否</option>
          </select>
        </li>
        <if condition="$iscid eq 1">
          <li>
            <select name="cid" class="input" style="width:200px; line-height:17px;" onchange="changesearch()">
              <option value="">请选择分类</option>
              <option value="">产品分类</option>
              <option value="">产品分类</option>
              <option value="">产品分类</option>
              <option value="">产品分类</option>
            </select>
          </li>
        </if>
        <li>
          <input type="text" placeholder="请输入搜索关键字" name="res_ename" class="input" style="width:250px; line-height:17px;display:inline-block" value="${restaurantPage.res_ename}"/>
          <a class="button border-main icon-search" onclick="findByCondition1()" > 搜索</a></li>
      </ul>
    </div>
    <table class="table table-hover text-center">
      <tr>
        <th width="100" style="text-align:left; padding-left:20px;">ID</th>
        <th width="10%">名称</th>
        <th>均价</th>
        <th>排名</th>
        <th>地址</th>
        <th>评论数</th>
        <th width="10%">营业时间</th>
        <th width="310">操作</th>
      </tr>
      <volist name="list" id="vo">
        <c:forEach items="${restaurantList}" var="rl">
        <tr>
          <td style="text-align:left; padding-left:20px;"><input type="checkbox" name="id[]" value="" />
                  ${rl.res_id}</td>
          <td>${rl.res_ename}</td>
          <td width="10%">￥${rl.res_avgprice}</td>
          <td>${rl.res_rank}</td>
          <td><font color="#00CC99">${rl.res_address}</font></td>
          <td>${rl.res_reviewcount}</td>
          <td>${rl.res_opentime}</td>
          <td><div class="button-group"> <a class="button border-main" href="/restaurant/toUpdateRestarant.do?res_id=${rl.res_id}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="javascript:void(0)" onclick="return del(${rl.res_id})"><span class="icon-trash-o"></span> 删除</a> </div></td>
        </tr>
          </c:forEach>


      <tr>
        <td style="text-align:left; padding:19px 0;padding-left:20px;"><input type="checkbox" id="checkall"/>
          全选 </td>
        <td colspan="7" style="text-align:left;padding-left:20px;"><a href="javascript:void(0)" class="button border-red icon-trash-o" style="padding:5px 15px;" onclick="DelSelect()"> 删除</a> <a href="javascript:void(0)" style="padding:5px 15px; margin:0 10px;" class="button border-blue icon-edit" onclick="sorts()"> 排序</a> 操作：
          <select name="ishome" style="padding:5px 15px; border:1px solid #ddd;" onchange="changeishome(this)">
            <option value="">首页</option>
            <option value="1">是</option>
            <option value="0">否</option>
          </select>
          <select name="isvouch" style="padding:5px 15px; border:1px solid #ddd;" onchange="changeisvouch(this)">
            <option value="">推荐</option>
            <option value="1">是</option>
            <option value="0">否</option>
          </select>
          <select name="istop" style="padding:5px 15px; border:1px solid #ddd;" onchange="changeistop(this)">
            <option value="">置顶</option>
            <option value="1">是</option>
            <option value="0">否</option>
          </select>
          &nbsp;&nbsp;&nbsp;
          
          移动到：
          <select name="movecid" style="padding:5px 15px; border:1px solid #ddd;" onchange="changecate(this)">
            <option value="">请选择分类</option>
            <option value="">产品分类</option>
            <option value="">产品分类</option>
            <option value="">产品分类</option>
            <option value="">产品分类</option>
          </select>
          <select name="copynum" style="padding:5px 15px; border:1px solid #ddd;" onchange="changecopy(this)">
            <option value="">请选择复制</option>
            <option value="5">复制5条</option>
            <option value="10">复制10条</option>
            <option value="15">复制15条</option>
            <option value="20">复制20条</option>
          </select></td>
      </tr>
      <tr>
        <!--分页-->
        <td colspan="8">
          <div class="pagelist">
            <a onclick="findByCondition(${restaurantPage.prePage})">上一页</a>
            <c:forEach begin="1" end="${restaurantPage.maxPage}" var="pageNum">
                <c:choose>
                  <c:when test="${restaurantPage.currentPage==pageNum}">
                    <span class="current">${pageNum}</span>
                  </c:when>
                  <c:otherwise>
                    <a onclick="findByCondition(${pageNum})" >${pageNum}</a>
                  </c:otherwise>
                </c:choose>
            </c:forEach>
            <a onclick="findByCondition(${restaurantPage.nextPage})">下一页</a>

            <c:choose>
              <c:when test="${restaurantPage.maxPage!=0}">
                <a onclick="findByCondition(${restaurantPage.maxPage})">尾页</a>
              </c:when>
              <c:otherwise>
                <a onclick="findByCondition(1)">末页</a>
              </c:otherwise>
            </c:choose>
          </div>
        </td>
      </tr>
      </volist>
    </table>
  </div>
</form>



</body>
</html>