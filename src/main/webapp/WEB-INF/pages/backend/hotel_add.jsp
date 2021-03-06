<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/23
  Time: 20:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
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
</head>
<body>
<div class="panel admin-panel">
    <div class="panel-head" id="add"><strong><span class="icon-pencil-square-o"></span>增加内容</strong></div>
    <div class="body-content">
        <form method="get" class="form-x" action="/hotel/add">
                <div class="form-group">
                    <div class="label">
                        <label>城市：</label>
                    </div>
                    <div class="field">
                        <select name="cit_id" class="input w50">
                            <c:forEach items="${listCity}" var="lc">
                                <option value="${lc.cit_id}">${lc.cit_name}</option>
                            </c:forEach>
                        </select>
                        <div class="tips"></div>
                    </div>
                </div>
                <div class="form-group">
                    <div class="label">
                        <label>设施服务：</label>
                    </div>
                    <div class="field" style="padding-top:8px;">
                        <c:forEach items="${listHotelsService}" var="lhss">
                            <input name="hserviceIds" type="checkbox" value="${lhss.hse_id}"/>${lhss.hse_name}
                        </c:forEach>
                    </div>
                </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店种类：</label>
                </div>
                <div class="field" style="padding-top:8px;">
                    <select name="hca_id" class="input w50">
                        <c:forEach items="${listHotelCategory}" var="lhca">
                            <option value="${lhca.hca_id}">${lhca.hca_name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店风格：</label>
                </div>
                <div class="field" style="padding-top:8px;">
                    <select name="hst_id" class="input w50">
                        <c:forEach items="${listHotelStyle}" var="lhst">
                            <option value="${lhst.hst_id}">${lhst.hst_name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店品牌：</label>
                </div>
                <div class="field" style="padding-top:8px;">
                    <select name="hbr_id" class="input w50">
                        <c:forEach items="${listHotelBrand}" var="lhbr">
                            <option value="${lhbr.hbr_id}">${lhbr.hbr_name}</option>
                        </c:forEach>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="hot_name" value="" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店英文名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="hot_ename" value="" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店均价：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="hot_avgprice" value="" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店评分：</label>
                </div>
                <div class="field">
                    <select name="hot_score" class="input w50">
                        <option value="0">0</option>
                        <option value="0.5">0.5</option>
                        <option value="1">1</option>
                        <option value="1.5">1.5</option>
                        <option value="2">2</option>
                        <option value="2.5">2.5</option>
                        <option value="3">3</option>
                        <option value="3.5">3.5</option>
                        <option value="4">4</option>
                        <option value="4.5">4.5</option>
                        <option value="5">5</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店详情：</label>
                </div>
                <div class="field">
                    <textarea type="text" class="input" name="hot_detail" style="height:80px;"></textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店附近_标题：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="hot_nearbytitle" value="" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店附近_内容：</label>
                </div>
                <div class="field">
                    <textarea type="text" class="input" name="hot_nearbycon" style="height:80px;"></textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店是否有空房：</label>
                </div>
                <div class="field" style="padding-top:8px;">
                    <select name="hot_room" class="input w50">
                        <option value="0">无</option>
                        <option value="1">有</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店星级：</label>
                </div>
                <div class="field">
                    <select name="hot_score" class="input w50">
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店排名：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="hot_rank" value="" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店地址：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="hot_address" value="" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>预订选项：</label>
                </div>
                <div class="field">
                    <textarea type="text" class="input" name="hot_book" style="height:80px;"></textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>房间数：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="hot_roomcount" value="" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店封面图：</label>
                </div>
                <div class="field">
                    <textarea type="text" class="input" name="hot_book" style="height:80px;"></textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>评论数：</label>
                </div>
                <div class="field">
                    <input type="text" class="input" name="hot_reviewcount" value="" />
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店地图：</label>
                </div>
                <div class="field">
                    <textarea type="text" class="input" name="hot_map" style="height:80px;"></textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店预定网址1：</label>
                </div>
                <div class="field">
                    <textarea type="text" class="input" name="hot_url1" style="height:80px;"></textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店预定网址2：</label>
                </div>
                <div class="field">
                    <textarea type="text" class="input" name="hot_url2" style="height:80px;"></textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店预定网址3：</label>
                </div>
                <div class="field">
                    <textarea type="text" class="input" name="hot_url3" style="height:80px;"></textarea>
                </div>
            </div>
            <div class="form-group">
                <div class="label">
                    <label>酒店预定网址4：</label>
                </div>
                <div class="field">
                    <textarea type="text" class="input" name="hot_url4" style="height:80px;"></textarea>
                </div>
            </div>


            <div class="form-group">
                <div class="label">
                    <label></label>
                </div>
                <div class="field">
                    <button class="button bg-main icon-check-square-o" type="submit"> 提交</button>
                </div>
            </div>
        </form>
    </div>
</div>

</body></html>
