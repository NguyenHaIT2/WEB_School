<!--web-->
<%@page import="java.util.ArrayList"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp" %>
<%@page import="com.laptrinhjavaweb.model.*"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Trang chủ</title>
</head>

<body>
  <div class="row">

    <div class="col-lg-3">

      <h1 class="my-4">Quản lý trường học KidsOnline</h1>
      <div class="list-group">
        <%--
          	List<NewsModel> news = new ArrayList<NewsModel>();
          	news = (ArrayList) request.getAttribute("news");
          	List<CategoryModel> categories = new ArrayList<CategoryModel>();
          	categories = (ArrayList)request.getAttribute("categories");
          	for(CategoryModel category: categories){
//           	for(NewsModel category: news){
          
        <a href="#" class="list-group-item"><%=category.getName() %></a>
        <!-- <a href="#" class="list-group-item">Category 2</a>
          <a href="#" class="list-group-item">Category 3</a> -->
        <%} %>--%>
      </div>

    </div>
    <!-- /.col-lg-3 -->

    <div class="col-lg-9">

      <div class="row">

        <div class="col-lg-4 col-md-6 mb-4" style = "width : 80%;">
          <div class="card h-100" style = "width : 80vw; display: block;">
            <a href="#" style = "width : 80%;"><img src="<c:url value='/template/admin/img/diemdanh.png'/>" alt="Diem danh"></a>
            <div class="card-body" style = "width : 80vw; display: block;">
              <h4 class="card-title">
                <a href="#">Điểm danh</a>
              </h4>
              <p class="card-text">Điểm danh cho học sinh
              </p>
            </div>
            <div class="card-footer">
              <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
            </div>
          </div>
        </div>
        
        
        
        <div class="col-lg-4 col-md-6 mb-4" style = "width : 80%;">
          <div class="card h-100" style = "width : 80vw; display: block;">
            <a href=<c:url value='/views/web/hoatdong/hoatdong.jsp'/> style = "width : 80%;"><img src="<c:url value='/template/admin/img/hoatdongtrongngay.png'/>" alt="Diem danh"></a>
            <div class="card-body" style = "width : 80vw; display: block;">
              <h4 class="card-title">
                <a href=<c:url value='/views/web/hoatdong/hoatdong.jsp'/>>Hoạt động</a>
              </h4>
              <p class="card-text">Cập nhật hoạt động trong ngày
              </p>
            </div>
            <div class="card-footer">
              <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
            </div>
          </div>
        </div>
        
        
        
		<div class="col-lg-4 col-md-6 mb-4" style = "width : 80%;">
          <div class="card h-100" style = "width : 80vw; display: block;">
            <a href=<c:url value='/views/web/noidunghoctap/list.jsp'/> style = "width : 80%;>"><img src="<c:url value='/template/admin/img/hoctap.png'/>" alt="Diem danh"></a>
            <div class="card-body" style = "width : 80vw; display: block;">
              <h4 class="card-title">
                <a href=<c:url value='/views/web/noidunghoctap/list.jsp'/>>Nội dung học tập</a>
              </h4>
              <p class="card-text">Lịch học tập
              </p>
            </div>
            <div class="card-footer">
              <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
            </div>
          </div>
        </div>
      </div>
      
      
      <div class="col-lg-4 col-md-6 mb-4" style = "width : 80%;">
          <div class="card h-100" style = "width : 80vw; display: block;">
            <a href="#" style = "width : 80%;"><img src="<c:url value='/template/admin/img/hinhanh.png'/>" alt="Diem danh"></a>
            <div class="card-body" style = "width : 80vw; display: block;">
              <h4 class="card-title">
                <a href="#">Hình ảnh</a>
              </h4>
              <p class="card-text">Cập nhật hình ảnh
              </p>
            </div>
            <div class="card-footer">
              <small class="text-muted">&#9733; &#9733; &#9733; &#9733; &#9734;</small>
            </div>
          </div>
        </div>
      </div>
      
      <!-- /.row -->

    </div>
    <!-- /.col-lg-9 -->

  </div>
</body>

</html>