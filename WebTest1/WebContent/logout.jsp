<%@ page language="java" contentType="text/html; charset=windows-1255"
	pageEncoding="windows-1255"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/styles.css" />
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" >
<title>Forum logout</title>
<link rel="stylesheet" href="styles.css" type="text/css" >
<!--[if lt IE 9]>
<script src="http://html5shiv.googlecode.com/svn/trunk/html5.js"></script>
<![endif]-->
<!--
budding, a free CSS web template by ZyPOP (zypopwebtemplates.com/)

Download: http://zypopwebtemplates.com/

License: Creative Commons Attribution
//-->
<meta name="viewport" content="width=device-width, minimum-scale=1.0, maximum-scale=1.0" >
</head>
<body>
<div id="container">
  
    <header>
	<div class="width">
    		<h1><a href="/">Logout<span></span></a></h1>
       	</div>
    </header>

    <nav>
	<div class="width">
    		<ul>
        		<li class=""><a href="home.jsp">Home</a></li>
        		<li class=""><a href="forumPage.jsp">Forum</a></li>
        	    <li class=""><a href="information.jsp">Information</a></li>	
         	   	<li class=""><a href="registration.jsp">Registration</a></li>
         	   	<li class=""><a href="login.jsp">Login</a></li>
         	   	<li class="start selected"><a href="logout.jsp">Logout</a></li>
        	</ul>
	</div>
    </nav>

    <div id="body" class="width">

		

		<section id="content">

	    <article>
	
	            <fieldset>
	                <legend>Forum Logout</legend>
	                <form action="home.jsp">
	                	
	                	<table>
	                		<tr>
	                			<td style="width: 375px">
			                    <p><label for="name">Are you sure you want to log out?</label>		                
								<p><input name="send" style="margin-left: 150px;" class="formbutton" value="Yes" type="submit" ></p>
	                			</td>		
	                		</tr>
	                	</table>
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