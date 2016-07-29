<%@ page language="java" contentType="text/html;charset=UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- saved from url=(0043)http://getbootstrap.com/examples/dashboard/ -->
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
<meta name="description" content="">
<meta name="author" content="">

<title>교육과정 수정</title>

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
			<a class="navbar-brand" href="#">교육과정 수정</a>
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
					<li><a
						href="/temp">교육과정 목록 <span
							class="sr-only">(current)</span></a></li>
				</ul>
			</div>

			<div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-2 main">
				<h1 class="page-header">교육과정 수정</h1>
				<div class="col-md-5">
					<form action="/temp/modify/${course.usid}" method="post" modelAttribute="courseForm">
						<div class="form-group">
							<label for="title">과정명(Title)</label> <input type="text"
								class="form-control" id="title" name="title" placeholder="Title" value="${course.title}">
						</div>
						<div class="form-group">
							<label for="startDay">교육시간(Edu Time)</label> <input type="number"
								class="form-control" id="eduTime" name="eduTime"
								placeholder="Edu Time" value="${course.eduTime}">
						</div>
						<div class="form-group">
							<label for="startDay">시작일(Start Date)</label> <input type="date"
								class="form-control" id="startDay" name="startDay"
								placeholder="Start Date" value="${course.startDay}">
						</div>
						<div class="form-group">
							<label for="endDay">종료일(End Date)</label> <input type="date"
								class="form-control" id="endDay" name="endDay"
								placeholder="End Date" value="${course.endDay}">
						</div>
						<div class="form-group">
							<label for="institueName">과정종류(Institue Name)</label> <input
								type="text" class="form-control" id="institueName"
								name="institueName" placeholder="Institue Name" value="${course.institueName}">
						</div>
						<button type="submit" class="btn btn-primary">수정</button>
						<button type="button" class="btn" id="courseDelete">삭제</button>
					</form>
				</div>
			</div>
		</div>
	</div>
	
	<form action="/temp/remove/${course.usid}" method="post" id="courseDeleteForm">
	</form>

	<!-- Bootstrap core JavaScript
================================================== -->
	<!-- Placed at the end of the document so the pages load faster -->
	<script src="https://code.jquery.com/jquery-3.1.0.min.js"></script>
	<script src="/style/js/bootstrap.min.js"></script>
	<script type="text/javascript">
		$(document).ready(function() {
		});
		
		$("#courseDelete").click(function() {
			$("#courseDeleteForm").submit();
		});
	</script>

</body>
</html>