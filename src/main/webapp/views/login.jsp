<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/common/taglib.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Đăng nhập</title>

</head>
<body>
	<div class="container">

		<div class="login-form">
			<div class="main-div">
				<c:if test="${not empty message }">
					<div class="alert alert-danger">
						<strong>${message}</strong>
					</div>
				</c:if>
				<form action="<c:url value='/dang-nhap'/>" id="formSubmit"
					method="post">

					<div class="form-group">


						<input type="text" class="form-control" id="inputEmail"
							name="userName" placeholder="Tên đăng nhập">

					</div>

					<div class="form-group">

						<input type="password" class="form-control" id="inputPassword"
							name="password" placeholder="Mật khẩu">

					</div>
					<!-- <div class="forgot">
						<a href="reset.html">Forgot password?</a>
					</div> -->
					<input type="hidden" id="action" value="login" name="action" />
					<button type="submit" class="btn btn-primary">Đăng nhập</button>

				</form>
			</div>
			<!-- <p class="botto-text">Designed by Sunil Rajput</p> -->
		</div>
	</div>
	</div>
</body>
</html>