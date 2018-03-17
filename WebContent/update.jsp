<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<!-- META TAGS -->
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>东软学术论坛</title>

<link rel="shortcut icon" href="images/favicon.png" />

<!-- Style Sheet-->
<link rel="stylesheet" href="style.css" />
<link rel='stylesheet' css-css'  href='css/bootstrap5152.css?ver=1.0'
	type='text/css' media='all' />
<link rel='stylesheet' id='responsive-css-css'
	href='css/responsive5152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='pretty-photo-css-css'
	href='js/prettyphoto/prettyPhotoaeb9.css?ver=3.1.4' type='text/css'
	media='all' />
<link rel='stylesheet' id='main-css-css' href='css/main5152.css?ver=1.0'
	type='text/css' media='all' />
<link rel='stylesheet' id='custom-css-css'
	href='css/custom5152.html?ver=1.0' type='text/css' media='all' />

</head>

<body>

	<!-- Start of Header -->
	<div class="header-wrapper">
		<header>
		<div class="container">


			<div class="logo-container">
				<!-- Website Logo -->
				<a href="#" title="东软学术论坛"> <img src="images/logo.png"
					alt="Knowledge Base Theme">
				</a> <span class="tag-line">欢迎您</span>
			</div>


			<!-- Start of Main Navigation -->
			<nav class="main-nav">
			<div class="menu-top-menu-container">
				<ul id="menu-top-menu" class="clearfix">
					<li class="current-menu-item"><a href="show">首页</a></li>
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
					<li><a href="#"></a></li>
					
					<c:choose>
						<c:when test="${user==null}">
							<li><a href="loginn.jsp">登陆</a></li>
							<li><a href="Resgister.jsp">注册</a></li>
						</c:when>
						<c:otherwise> 
							<li><a href="showUserMain?uid=${user.uid}">用户：${user.uname}</a></li>
							<li><a href="getUserinfo">查看个人信息</a></li>
							<li><a href="loginn.jsp">exit</a></li>
						</c:otherwise>
					</c:choose>
				</ul>
			</div>
			</nav>
			<!-- End of Main Navigation -->

		</div>
		</header>
	</div>
	<!-- End of Header -->

	<!-- Start of Search Wrapper -->
	<div class="search-area-wrapper">
		<div class="search-area container">
			<h3 class="search-header">Have a Question?</h3>
			<p class="search-tag-line">如果你有任何问题，可以在下面询问，或者输入你要找的东西。</p>

			<form id="search-form" class="search-form clearfix" method="get" action="search" autocomplete="off">
                                        <input class="search-term required" type="text" id="s" name="searchKeyword" placeholder="请输入关键词" title="* 请输入查找内容!" />
                                        <input class="search-btn" type="submit" value="Search" />
                                        <div id="search-error-container"></div>
                                </form>
		</div>
	</div>

	<!-- Start of Page Container -->
	<div class="page-container">
		<div class="container">
			<div class="row">

				<!-- start of page content -->
				<div class="span8 page-content">


					<h1 class="post-title">
						<a href="#">编辑个人信息</a>
						
					</h1>
					<hr>
					<form action="UpdateUserinfo"  method="post" >
					<input type ="hidden" name = "id" value="${userinfo.uid }"/>
					<img src="">
						<h3>
					姓名 : <input type="text" name="username" id="" value="${userinfo.uname }">
						
					
					</h3>
					
						<h3>
						
						<c:choose>
						<c:when test="${userinfo.sex=='M'}">
							性别 :  <input type="radio" id="male" name="sex" value="M" checked="checked" />男<input type="radio" id="female" name="sex" value="F" />女
						</c:when>
						<c:otherwise> 
							性别 :  <input type="radio" id="male" name="sex" value="M" />男<input type="radio" id="female" name="sex" value="F" checked="checked"/>女
						</c:otherwise>
					</c:choose>
					
					</h3>
						<h3>
					地址 : <input type="text" name="address" id="" value="${userinfo.address }">
						
					
					</h3>

						<h3>
					邮箱 : <input type="text" name="email" id="" value="${userinfo.email }">
						
					
					</h3>
						<h3>
					生日 : <input type="text" name="birthday" id="" value="${userinfo.birthday }">
						
					
					</h3>
					<button type="submit">确定</button>
					<button type="reset">重置</button>
</form>
				</div>
				<!-- end of page content -->



				<!-- end of sidebar -->
			</div>
		</div>
	</div>
	<!-- End of Page Container -->





</body>
</html>