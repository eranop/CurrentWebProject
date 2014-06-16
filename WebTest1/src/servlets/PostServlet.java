package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.report;
import allcode.UserConnection;

/**
 * Servlet implementation class PostServlet
 */
@WebServlet("/PostServlet")
public class PostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PostServlet() {
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
		String title = request.getParameter("title");
		String message = request.getParameter("message");
		UserConnection uc = (UserConnection) request.getSession().getAttribute("UserConnection");
		report rep = uc.writePost(title, message).getReport();
		String messageRespond = "";
		if (rep == report.OK)
			response.sendRedirect("/WebTest1/subforumPage.jsp");
		else
		{
			if (rep == report.EMPTY_FIELD || rep == report.NULL_ARGUMENTS)
				messageRespond = "One or more fields are empty";
			else if (rep == report.NOT_LOGGED)
				messageRespond = "User must be login in order to write a post";
			else
				messageRespond = "Unknown error has accured. Oops.";
			request.setAttribute("messageRespond", messageRespond);
			request.getRequestDispatcher("/subforumPage.jsp").forward(request, response);
		}
	}
}
