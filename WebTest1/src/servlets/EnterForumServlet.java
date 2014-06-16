package servlets;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import allcode.SiteManager;
import allcode.UserConnection;
import allcode.Forum;
import services.report;

/**
 * Servlet implementation class EnterForumServlet
 */
@WebServlet(description = "servlet that dispaches a connection request into a forum page", urlPatterns = { "/EnterForumServlet" })
public class EnterForumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterForumServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext = request.getServletContext();
		SiteManager sm = (SiteManager)servletContext.getAttribute("SiteManager");	//getting global var sm
		
		String forumName = request.getParameter("Forums");	//cant be null.
		UserConnection uc = (UserConnection) request.getSession().getAttribute("UserConnection");
		report rep = uc.enterForum(forumName);
		
		if (rep == report.OK)
		{
			Forum f = sm.getFM().getForum(forumName);
			request.getSession().setAttribute("ForumClass", f);
			request.setAttribute("ForumClass", f);					//saving attributes per REQUEST
			request.setAttribute("forumname", forumName);			//means that next click or redirect those attributes will be gone.
			request.getRequestDispatcher("/forumPage.jsp").forward(request, response);
		}
	
	}

}
