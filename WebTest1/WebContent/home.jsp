<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!doctype html>
<html>
<link type="text/css" rel="stylesheet"
	href="${pageContext.request.contextPath}/styles.css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Forum site</title>
<link rel="stylesheet" href="styles.css" type="text/css">
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<!--
budding, a free CSS web template by ZyPOP (zypopwebtemplates.com/)

Download: http://zypopwebtemplates.com/

License: Creative Commons Attribution
//-->
<meta name="viewport"
	content="width=device-width, minimum-scale=1.0, maximum-scale=1.0">
</head>
<body>
${UserConnection.reset() }
	<div id="container">

		<header>
			<div class="width">
				<h1>
					<a href="#">Welcome to our Forum service<span></span></a>
				</h1>
			</div>
		</header>

		<nav>
			<div class="width">
				<ul>
					<li class="start selected"><a href="home.jsp">Home</a></li>
				</ul>
			</div>
		</nav>

		<div id="body" class="width">



			<section id="content">

				<article>

					&nbsp;<br>&nbsp;<br>
					<fieldset>
						<legend>choose forum to enter</legend>
						<div class="text">
							<form method="post" action="EnterForumServlet" id="carform">
								<table>
									<tr>
										<td style="width: 159px"><select id="forumsNames"
											name="Forums" class=article-info
											style="width: 140px; margin-top: 2">
												<c:forEach items="${SiteManager.getFM().getForums()}"
													var="forum">
													<option value="${forum.get_forumName()}">${forum.get_forumName()}</option>
												</c:forEach>
										</select><br></br></td>
										<td>&nbsp;<input class="formbutton" value="Enter"
											type="submit"
											style="width: 104px; height: 28px; margin-top: 0"><br>


										</td>
									</tr>
								</table>
							</form>
						</div>

					</fieldset>



				</article>
			</section>

			<aside class="sidebar">

				<ul>

					<li class="bg">
						<h4>About us</h4>
						<ul>
							<li class="text">
								<p style="margin: 0;">our company is one of the biggest
									forum website service providers.</p>
							</li>
						</ul>
					</li>



				</ul>

			</aside>
			<div class="clear"></div>
		</div>
		<footer>
			<div class="footer-content width">

				<div class="clear"></div>
			</div>
			<div class="footer-bottom">
				<p>
					&copy; YourSite 2014. <a href="http://zypopwebtemplates.com/">Free
						CSS3 Templates</a> by ZyPOP
				</p>
			</div>
		</footer>
	</div>
</body>
</html>