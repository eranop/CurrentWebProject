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

/**
 * Servlet implementation class GetUserConnectionServlet
 */
@WebServlet(description = "giving a connection UserConnection", urlPatterns = { "/GetUCServlet" })
public class GetUserConnectionServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetUserConnectionServlet() {
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
		String option = request.getParameter("subject");
		
		if (option.equals("enter"))
		{
			UserConnection uc = sm.openNewConnection();									//creating new connection.
			request.getSession().setAttribute("UserConnection", uc);					//Setting this connection in the user session.
			response.sendRedirect("/WebTest1/home.jsp");
		}
		else
			response.sendRedirect("http://www.google.com");
	}

}
