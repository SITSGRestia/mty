<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
<div class="panel admin-panel">
  <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加餐厅</strong></div>
  <div class="body-content">
    <form method="post" class="form-x" action="/restaurant/addRestaurant.do">
      <input type="hidden" name="restaurantPage" value="${restaurantPage}">
      <div class="form-group">
        <div class="label">
          <label>餐厅名：</label>
        </div>
        <div class="field">
          <input type="text" class="input w50" value="" name="res_ename" data-validate="required:请输入餐厅名" />
          <div class="tips"></div>
        </div>
      </div>
      <div class="form-group">
        <div class="label">
          <label>营业日：</label>
        </div>
        <div class="field">
          <input type="text" id="url1" name="res_openday" class="input tips" style="width:25%; float:left;"  value=""  data-toggle="hover" data-place="right" data-image="" />
        </div>
      </div>

      <div class="form-group">
        <div class="label">
          <label>餐厅排名：</label>
        </div>
        <div class="field">
          <input type="text" id="url11" name="res_rank" class="input tips" style="width:25%; float:left;"  value=""  data-toggle="hover" data-place="right" data-image="" />
        </div>
      </div>

      <div class="form-group">
        <div class="label">
          <label>餐厅地址：</label>
        </div>
        <div class="field">
          <input type="text" id="url12" name="res_address" class="input tips" style="width:25%; float:left;"  value=""  data-toggle="hover" data-place="right" data-image="" />
        </div>
      </div>

      <div class="form-group">
        <div class="label">
          <label>餐厅图片：</label>
        </div>
        <div class="field">
          <input type="text" id="url13" name="res_pic" class="input tips" style="width:25%; float:left;"  value=""  data-toggle="hover" data-place="right" data-image="" />
        </div>
      </div>


      <if condition="$iscid eq 1">
        <div class="form-group">
          <div class="label">
            <label>餐厅类型：</label>
          </div>
          <div class="field">
            <select name="rca_id" class="input w50">
              <option value="">请选择分类</option>
              <c:forEach items="${rcategoryList}" var="rcal">
                <option value="${rcal.rca_id}" name="rca_id">${rcal.rca_name}</option>
              </c:forEach>
            </select>
            <div class="tips"></div>
          </div>
        </div>
      </if>
      <if condition="$iscid eq 1">
        <div class="form-group">
          <div class="label">
            <label>菜系及菜肴：</label>
          </div>
          <div class="field">
            <select name="rfo_id" class="input w50">
              <option value="">请选择分类</option>
              <c:forEach items="${rfoodList}" var="rfol">
                <option value="${rfol.rfo_id}" name="rfo_id">${rfol.rfo_name}</option>
              </c:forEach>
            </select>
            <div class="tips"></div>
          </div>
        </div>
      </if>
        <if condition="$iscid eq 1">
          <div class="form-group">
            <div class="label">
              <label>就餐要求：</label>
            </div>
            <div class="field">
              <select name="rho_id" class="input w50">
                <option value="">请选择分类</option>
                <c:forEach items="${rhobbyList}" var="rhol">
                  <option value="${rhol.rho_id}" name="rho_id">${rhol.rho_name}</option>
                </c:forEach>
              </select>
              <div class="tips"></div>
            </div>
          </div>
        </if>
          <if condition="$iscid eq 1">
            <div class="form-group">
              <div class="label">
                <label>餐时：</label>
              </div>
              <div class="field">
                <select name="rme_id" class="input w50">
                  <option value="">请选择分类</option>
                  <c:forEach items="${rmealtimeList}" var="rmel">
                    <option value="${rmel.rme_id}" name="rme_id">${rmel.rme_name}</option>
                  </c:forEach>
                </select>
                <div class="tips"></div>
              </div>
            </div>
          </if>

      <if condition="$iscid eq 1">
        <div class="form-group">
          <div class="label">
            <label>餐厅价格：</label>
          </div>
          <div class="field">
            <select name="rpr_id" class="input w50">
              <option value="">请选择分类</option>
              <c:forEach items="${rpriceList}" var="rprl">
                <option value="${rprl.rpr_id}" name="rpr_id">${rprl.rpr_name}</option>
              </c:forEach>
            </select>
            <div class="tips"></div>
          </div>
        </div>
      </if>
      <if condition="$iscid eq 1">
        <div class="form-group">
          <div class="label">
            <label>餐厅附近：</label>
          </div>
          <div class="field">
            <select name="rne_id" class="input w50">
              <option value="">请选择分类</option>
              <c:forEach items="${rnearbyList}" var="rnel">
                <option value="${rnel.rne_id}" name="rne_id">${rnel.rne_name}</option>
              </c:forEach>
            </select>
            <div class="tips"></div>
          </div>
        </div>
      </if>
      <if condition="$iscid eq 1">
        <div class="form-group">
          <div class="label">
            <label>餐厅特点：</label>
          </div>
          <div class="field">
            <select name="rfe_id" class="input w50">
              <option value="">请选择分类</option>
              <c:forEach items="${rfeatureList}" var="rfel">
                <option value="${rfel.rfe_id}" name="rfe_id">${rfel.rfe_name}</option>
              </c:forEach>
            </select>
            <div class="tips"></div>
          </div>
        </div>
      </if>
      <if condition="$iscid eq 1">
        <div class="form-group">
          <div class="label">
            <label>就餐氛围：</label>
          </div>
          <div class="field">
            <select name="rat_id" class="input w50">
              <option value="">请选择分类</option>
              <c:forEach items="${ratmosphereList}" var="ratl">
                <option value="${ratl.rat_id}" name="rat_id">${ratl.rat_name}</option>
              </c:forEach>
            </select>
            <div class="tips"></div>
          </div>
        </div>
      </if>


      <div class="form-group">
        <div class="label">
          <label></label>
        </div>
        <div class="field">
          <button class="button bg-main icon-check-square-o" type="submit"> 添加</button>
        </div>
      </div>
    </form>
  </div>
</div>

</body></html>