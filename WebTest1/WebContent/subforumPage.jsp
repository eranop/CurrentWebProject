<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/styles.css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
<title>sub-forum</title>
<link rel="stylesheet" href="styles.css" type="text/css" >
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<!--
budding, a free CSS web template by ZyPOP (zypopwebtemplates.com/)

Download: http://zypopwebtemplates.com/

License: Creative Commons Attribution
//-->
<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" />
</head>
<body>
<div id="container">
  
    <header>
	<div class="width">
    		<h1><a href="/">Welcome to ${SubForumClass.getName()}<span></span></a></h1>
       	</div>
    </header>

    <nav>
	<div class="width">
				<ul>
					<li class=""><a href="home.jsp">Home</a></li>
					<li class=""><a href="forumPage.jsp">Forum</a></li>
					<li class="start selected"><a href="subforumPage.jsp">SubForum</a></li>
					<li class=""><a href="information.jsp">Information</a></li>
					<li class=""><a href="registration.jsp">Registration</a></li>
					<li class=""><a href="login.jsp">Login</a></li>
					<li class=""><a href="logout.jsp">Logout</a></li>
				</ul>
			</div>
    </nav>

    <div id="body" class="width">

		

		<section id="content">

	    <article>
			<p> ${messageRespond } </p>

            <table>
            <tr>
            	<td style="width: 463px"><h4><b>Post Author</b></h4></td>
            	<td style="width: 463px"><h4><b>Post Title</b></h4></td>
            </tr>

			<c:forEach items="${SubForumClass.getRootPostsArrayList()}" var="post">
			<tr>
				<td style="width: 463px"><p>${post.getPublisher()}</p></td>
				<td style="width: 463px"><p><a href = "EnterPostServlet?postId=${post.getIndex()}">${post.getTitle()}</a></p></td>
			</tr>
			</c:forEach>

            <tr>
				<td>
				<a href="#" class="button button-reversed" style="width: 154px">see more</a> <br></td>

            </tr>
            </table>
              
			<br>

            <fieldset>
                <legend>write new post</legend>
                <form action="PostServlet" method="post">
                    <p><label for="title">Title:</label>
                    <input name="title" id="title" value="" type="text" style="width: 296px" ></p>

                    <p><label for="message">Message:</label>
                    <textarea name="message" id="message" style="width: 422px; height: 136px"></textarea></p>
                    <p>
					<input name="post" style="margin-left: 150px;" class="formbutton" value="post" type="submit" >&nbsp;</p>
                </form>
            </fieldset>
            

		
		</article>
	
        </section>
        
        <aside class="sidebar">
	
            <ul>	
                
                <li class="bg">
                    <h4>About us</h4>
                    <ul>
                        <li class="text">
                        	<p style="margin: 0;">our company is one of the 
							biggest forum website service providers. </p>
                        </li>
                    </ul>
                </li>
                
                <li>
                	<h4>login</h4>
                    <ul>
                    	<li class="text">
                            <form method="post" class="searchform" action="LoginServlet" >
                                <p>
                                    user name:</p>
								<p>
                                    <input type="text" size="32" value="" name="s" class="s" /></p>
								<p>
                                    password:</p>
                                <p>
                                    <input type="text" size="32" value="" name="s0" class="s" />
                                </p>
								<p>
                                    &nbsp;</p>
                            </form>
						</li>
					</ul>
		<a href="#" class="button button-reversed">send</a></li>
                
            </ul>
		
        </aside>
    	<div class="clear"></div>
    </div>
    <footer>
        <div class="footer-content width">
            
            <div class="clear"></div>
        </div>
        <div class="footer-bottom">
            <p>&copy; YourSite 2014. <a href="http://zypopwebtemplates.com/">Free CSS3 Templates</a> by ZyPOP</p>
         </div>
    </footer>
</div>
</body>
</html>