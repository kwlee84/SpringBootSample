<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0043)http://getbootstrap.com/examples/dashboard/ -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>교육과정 목록</title>

<!-- Bootstrap core CSS -->
<link href="/style/css/bootstrap.min.css" rel="stylesheet">
<!-- Custom styles for this template -->
<link href="/style/css/dashboard.css" rel="stylesheet">

</head>

<body>
	<nav class="navbar navbar-inverse navbar-fixed-top">
		<div class="container-fluid">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target="#navbar" aria-expanded="false"
					aria-controls="navbar">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">교육과정 목록</a>
			</div>
			<div id="navbar" class="navbar-collapse collapse">
				<ul class="nav navbar-nav navbar-right">
					<
					<!-- li><a href="#">Dashboard</a></li> -->
					<li><a href="#">Settings</a></li>
					<!-- <li><a href="#">Profile</a></li>
							<li><a href="#">Help</a></li> -->
				</ul>
				<!-- <form class="navbar-form navbar-right">
							<input type="text" class="form-control" placeholder="Search...">
						</form> -->
			</div>
		</div>
	</nav>

	<div class="container-fluid">
		<div class="row">
			<div class="col-sm-3 col-md-2 sidebar">
				<ul class="nav nav-sidebar">
					<li class="active"><a
						href="/temp">교육과정 목록<span
							class="sr-only">(current)</span></a></li>
				</ul>
			</div>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h1 class="page-header">교육과정 목록</h1>
				<div class="table-responsive">
					<table class="table table-striped">
						<thead>
							<tr>
								<th>번호</th>
								<th>과정명</th>
								<th>교육시간</th>
								<th>시작일</th>
								<th>종료일</th>
								<th>과정종류</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${courses}" var="course">
								<tr>
									<td>${course.usid}</td>
									<td><a href = "/temp/edit/${course.usid}">${course.title}</a></td>
									<td>${course.eduTime}</td>
									<td>${course.startDay}</td>
									<td>${course.endDay}</td>
									<td>${course.institueName}</td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
				<button type="button" id=courseNew class="btn btn-primary">신청</button>
			</div>
		</div>
	</div>

	<!-- Bootstrap core JavaScript
================================================== -->
<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
	<script src="/style/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		
		$(document).ready(function() {
		});
	
		$("#courseNew").click(function() {
			location.replace("temp/new");
		});
	</script>
</body>
</html>