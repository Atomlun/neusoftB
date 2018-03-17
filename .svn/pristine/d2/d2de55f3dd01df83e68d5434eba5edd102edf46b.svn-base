<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!doctype html>
<!--[if lt IE 7]> <html class="lt-ie9 lt-ie8 lt-ie7" lang="en-US"> <![endif]-->
<!--[if IE 7]>    <html class="lt-ie9 lt-ie8" lang="en-US"> <![endif]-->
<!--[if IE 8]>    <html class="lt-ie9" lang="en-US"> <![endif]-->
<!--[if gt IE 8]><!-->
<html lang="en-US">
<!--<![endif]-->
<head>
<!-- META TAGS -->
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Knowledge Base Theme</title>

<link rel="shortcut icon" href="images/favicon.png" />




<!-- Style Sheet-->
<link rel="stylesheet" href="style.css" />
<link rel='stylesheet' id='bootstrap-css-css'
	href='css/bootstrap5152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='responsive-css-css'
	href='css/responsive5152.css?ver=1.0' type='text/css' media='all' />
<link rel='stylesheet' id='pretty-photo-css-css'
	href='js/prettyphoto/prettyPhotoaeb9.css?ver=3.1.4' type='text/css'
	media='all' />
<link rel='stylesheet' id='main-css-css' href='css/main5152.css?ver=1.0'
	type='text/css' media='all' />
<link rel='stylesheet' id='custom-css-css'
	href='css/custom5152.html?ver=1.0' type='text/css' media='all' />


<!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
<!--[if lt IE 9]>
                <script src="js/html5.js"></script></script>
                <![endif]-->

</head>

<body>

	<!-- Start of Header -->
	<div class="header-wrapper">
		<header>
			<div class="container">


				<div class="logo-container">
					<!-- Website Logo -->
					<a href="index-2.html" title="Knowledge Base Theme"> <img
						src="images/logo.png" alt="Knowledge Base Theme">
					</a> <span class="tag-line">Premium WordPress Theme</span>
				</div>


				<!-- Start of Main Navigation -->
				<nav class="main-nav">
					<div class="menu-top-menu-container">
						<ul id="menu-top-menu" class="clearfix">
							<li><a href="index-2.html">Home</a></li>
							<li><a href="home-categories-description.html">Home 2</a></li>
							<li><a href="home-categories-articles.html">Home 3</a></li>
							<li><a href="articles-list.html">Articles List</a></li>
							<li class="current-menu-item"><a href="faq.html">FAQs</a></li>
							<li><a href="#">Skins</a>
								<ul class="sub-menu">
									<li><a href="blue-skin.html">Blue Skin</a></li>
									<li><a href="green-skin.html">Green Skin</a></li>
									<li><a href="red-skin.html">Red Skin</a></li>
									<li><a href="index-2.html">Default Skin</a></li>
								</ul></li>
							<li><a href="#">More</a>
								<ul class="sub-menu">
									<li><a href="full-width.html">Full Width</a></li>
									<li><a href="elements.html">Elements</a></li>
									<li><a href="page.html">Sample Page</a></li>
								</ul></li>
							<li><a href="contact.html">Contact</a></li>
						</ul>
					</div>
				</nav>
				<!-- End of Main Navigation -->

			</div>
		</header>
	</div>
	<!-- End of Header -->



	<!-- Start of Page Container -->
	<div class="page-container">
		<div class="container">
			<div class="row">

				<!-- start of page content -->
				<div class="span8 page-content">

					<article class=" page type-page hentry clearfix">
						<h1 class="post-title">
							<a href="#">本分区帖子</a>
						</h1>
						<hr>
						<p></p>
					</article>
					<div class="faqs clearfix">
						<form action="PostList" method="post">
							<article class="faq-item">
								<ul>
									<li><c:forEach items="${page}" var="postlist">

											<h3 class="faq-question">
												<a href="#">${postlist.potitle }</a>
											</h3>
										</c:forEach></li>
								</ul>
								总共有${pageUtil.totalRecord }个帖子，共有${pageUtil.totalPage }页 <a
									href="postlist?pageNum=1">首页</a>
								<c:if test="${pageUtil.pageNum != pageUtil.start }">
									<a href="postlist?pageNum=${pageUtil.pageNum -1}">上一页</a>
								</c:if>
								<c:if test="${pageUtil.pageNum == pageUtil.start }">
									<c:forEach begin="${pageUtil.start }" end="${pageUtil.end }"
										step="1" var="num">
										<c:if test="${pageUtil.pageNum == num }">
										${num }</c:if>
										<c:if test="${pageUtil.pageNum != num }">
											<a href="postlist?pageNum=${num }">${num }</a>
										</c:if>
									</c:forEach>
								</c:if>
								<c:if test="${pageUtil.pageNum != pageUtil.end}">
									<a href="postlist?pageNum=${pageUtil.pageNum +1}">下一页</a>
								</c:if>
								<a href="postlist?pageNum=${pageUtil.end }">尾页</a>
							</article>
						</form>


					</div>

				</div>
				<!-- end of page content -->


				<!-- start of sidebar -->
				<aside class="span4 page-sidebar">

					<section class="widget">
						<div class="support-widget">
							<h3 class="title">Support</h3>
							<p class="intro">Need more support? If you did not found an
								answer, contact us for further help.</p>
						</div>
					</section>

				</aside>
				<!-- end of sidebar -->
			</div>
		</div>
	</div>
	<!-- End of Page Container -->

	<!-- Start of Footer -->






	<script
		src="http://twitterjs.googlecode.com/svn/trunk/src/twitter.min.js"
		type="text/javascript"></script>
	<script type="text/javascript">
		getTwitters("twitter_update_list", {
			id : "960development",
			count : 3,
			enableLinks : true,
			ignoreReplies : true,
			clearContents : true,
			template : "%text% <span>%time%</span>"
		});
	</script>

	

	<!-- end of #footer -->

	<!-- Footer Bottom -->
	
	<!-- End of Footer Bottom -->

	<!-- End of Footer -->

	<a href="#top" id="scroll-top"></a>

	<!-- script -->
	<script type='text/javascript' src='js/jquery-1.8.3.min.js'></script>
	<script type='text/javascript' src='js/jquery.easing.1.3.js'></script>
	<script type='text/javascript'
		src='js/prettyphoto/jquery.prettyPhoto.js'></script>
	<script type='text/javascript' src='js/jflickrfeed.js'></script>
	<script type='text/javascript' src='js/jquery.liveSearch.js'></script>
	<script type='text/javascript' src='js/jquery.form.js'></script>
	<script type='text/javascript' src='js/jquery.validate.min.js'></script>
	<script type='text/javascript' src='js/custom.js'></script>

</body>
</html>
