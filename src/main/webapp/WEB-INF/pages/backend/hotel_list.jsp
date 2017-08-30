<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/23
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
    <meta name="renderer" content="webkit">
    <title></title>
    <link rel="stylesheet" href="../css/pintuer.css">
    <link rel="stylesheet" href="../css/admin.css">
    <script src="../js/jquery.js"></script>
    <script src="../js/pintuer.js"></script>
    <script>
        //换页
        function findByCondiiton(currentPage){
            $("#currentPage").val(currentPage);
            $("#hotelForm").submit();
        }
    </script>
</head>
<body>
<form method="get" action="/hotel/findByPage" id="hotelForm">
    <div class="panel admin-panel">
        <div class="panel-head"><strong class="icon-reorder"> 内容列表</strong> <a href="" style="float:right; display:none;">添加字段</a></div>
        <div class="padding border-bottom">
                <input type="hidden" name="currentPage" id="currentPage" value="${hotelPage.currentPage}"/>
            <ul class="list-group">
                <li class="list-group-item">
                设施服务：&nbsp;&nbsp;
                    <c:forEach items="${listHotelsService}" var="lhss">
                    <input type="checkbox" value="${lhss.hse_id}"
                            <c:forEach items="${hotelPage.hotelsServices}" var="hphse">
                                <c:if test="${lhss.hse_id==hphse}">
                                    checked
                                </c:if>
                            </c:forEach>
                           name="hotelsServices"/>${lhss.hse_name}
                    </c:forEach>
                </li>
                <li class="list-group-item">
                酒店种类：&nbsp;&nbsp;
                        <c:forEach items="${listHotelCategory}" var="lhca">
                            <input type="radio" value="${lhca.hca_id}"
                                    <c:if test="${lhca.hca_id==hotelPage.hotelCategory}">
                                        checked
                                    </c:if>
                                   name="hotelCategory"/>${lhca.hca_name}
                        </c:forEach>
                </li>
                <li class="list-group-item">
                游客评分：&nbsp;&nbsp;
                    <input type="radio" value="5"
                            <c:if test="${hotelPage.hotScore==5}">
                                checked
                            </c:if>
                           name="hotScore"/>5
                    <input type="radio" value="4"
                            <c:if test="${hotelPage.hotScore==4}">
                                checked
                            </c:if>
                           name="hotScore"/>4+
                    <input type="radio" value="3"
                            <c:if test="${hotelPage.hotScore==3}">
                                checked
                            </c:if>
                           name="hotScore"/>3+
                    <input type="radio" value="2"
                            <c:if test="${hotelPage.hotScore==2}">
                                checked
                            </c:if>
                           name="hotScore"/>2+
                </li>
                <li class="list-group-item">
                酒店星级：&nbsp;&nbsp;
                    <input type="checkbox" value="5"
                            <c:forEach items="${hotelPage.hotStars}" var="hphs">
                                <c:if test="${hphs==5}">
                                    checked
                                </c:if>
                            </c:forEach>
                           name="hotStars"/>5星
                    <input type="checkbox" value="4"
                            <c:forEach items="${hotelPage.hotStars}" var="hphs">
                                <c:if test="${hphs==4}">
                                    checked
                                </c:if>
                            </c:forEach>
                           name="hotStars"/>4星
                    <input type="checkbox" value="3"
                            <c:forEach items="${hotelPage.hotStars}" var="hphs">
                                <c:if test="${hphs==3}">
                                    checked
                                </c:if>
                            </c:forEach>
                           name="hotStars"/>3星
                    <input type="checkbox" value="2"
                            <c:forEach items="${hotelPage.hotStars}" var="hphs">
                                <c:if test="${hphs==2}">
                                    checked
                                </c:if>
                            </c:forEach>
                           name="hotStars"/>2星
                </li>
                <li class="list-group-item">
                酒店风格：&nbsp;&nbsp;
                        <c:forEach items="${listHotelStyle}" var="lhst">
                            <input type="checkbox" value="${lhst.hst_id}"
                                    <c:forEach items="${hotelPage.hotelStyles}" var="hphst">
                                        <c:if test="${lhst.hst_id==hphst}">
                                            checked
                                        </c:if>
                                    </c:forEach>
                                   name="hotelStyles"/>${lhst.hst_name}
                        </c:forEach>
                 </li> <li class="list-group-item">
                酒店品牌：&nbsp;&nbsp;
                        <c:forEach items="${listHotelBrand}" var="lhbr">
                            <input type="checkbox" value="${lhbr.hbr_id}"
                                    <c:forEach items="${hotelPage.hotelBrands}" var="hphbr">
                                        <c:if test="${lhbr.hbr_id==hphbr}">
                                            checked
                                        </c:if>
                                    </c:forEach>
                                   name="hotelBrands"/>${lhbr.hbr_name}
                        </c:forEach>
                </li>
                <li class="list-group-item">
                    <input type="text" placeholder="请输入酒店所在城市" name="cityName" value="${hotelPage.cityName}" class="input" style="width:250px; line-height:17px;display:inline-block" />
                    <input type="text" placeholder="请输入酒店名字" name="hotelName" value="${hotelPage.hotelName}" class="input" style="width:250px; line-height:17px;display:inline-block" />
                    <button type="submit" class="button border-main icon-search"  > 搜索</button>
                    <a class="button border-main icon-plus-square-o" href="/hotel/toAdd"> 添加内容</a>
                </li>
            </ul>
        </div>
        <table class="table table-hover text-center">
            <tr>
                <th  style="text-align:left; padding-left:20px;">ID</th>
                <th  style="text-align:left; padding-left:20px;">城市ID</th>
                <th  style="text-align:left; padding-left:20px;">种类ID</th>
                <th  style="text-align:left; padding-left:20px;">风格ID</th>
                <th  style="text-align:left; padding-left:20px;">品牌ID</th>
                <th width="20%">酒店名</th>
                <th>酒店均价</th>
                <th>酒店评分</th>
                <th width="310">操作</th>
            </tr>
            <volist name="list" id="vo">
                <c:forEach items="${hotelList}" var="hl">
                <tr>
                    <td>${hl.hot_id}</td>
                    <td>${hl.cit_id}</td>
                    <td>${hl.hca_id}</td>
                    <td>${hl.hst_id}</td>
                    <td>${hl.hbr_id}</td>
                    <td>${hl.hot_name}</td>
                    <td>${hl.hot_avgprice}</td>
                    <td>${hl.hot_score}</td>
                    <td><div class="button-group"> <a class="button border-main" href="/hotel/toUpdate?hotelId=${hl.hot_id}"><span class="icon-edit"></span> 修改</a> <a class="button border-red" href="/hotel/delete?hotelId=${hl.hot_id}"><span class="icon-trash-o"></span> 删除</a> </div></td>                </tr>
                </c:forEach>
                <tr>
                    <td colspan="8">
                        <div class="pagelist">
                            <a href="javascript:;" onclick="findByCondiiton(1)" >首页</a>
                            <a href="javascript:;" onclick="findByCondiiton(${hotelPage.prePage})" >上一页</a>
                            <c:forEach begin="1" end="${hotelPage.maxPage}" var="pageNum">
                                <c:choose>
                                    <c:when test="${pageNum==hotelPage.currentPage}">
                                        <span class="current">${pageNum}</span>
                                    </c:when>
                                    <c:otherwise>
                                        <a href="javascript:;" onclick="findByCondiiton(${pageNum})">${pageNum}</a>
                                    </c:otherwise>
                                </c:choose>
                            </c:forEach>
                            <a href="javascript:;" onclick="findByCondiiton(${hotelPage.nextPage})" >下一页</a>
                            <c:choose>
                                <c:when test="${hotelPage.maxPage==0}">
                                    <a href="javascript:;" onclick="findByCondiiton(1)" >末页</a>
                                </c:when>
                                <c:otherwise>
                                    <a href="javascript:;" onclick="findByCondiiton(${hotelPage.maxPage})" >末页</a>
                                </c:otherwise>
                            </c:choose>
                        </div>
                    </td>
                </tr>
            </volist>
        </table>
    </div>
</form>
<script type="text/javascript">

    //搜索
    function changesearch(){
    }

    //单个删除
    function del(id,mid,iscid){
        if(confirm("您确定要删除吗?")){

        }
    }

    //全选
    $("#checkall").click(function(){
        $("input[name='id[]']").each(function(){
            if (this.checked) {
                this.checked = false;
            }
            else {
                this.checked = true;
            }
        });
    })

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

</script>
</body>
</html>