package servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.report;
import allcode.Post;
import allcode.UserConnection;

/**
 * Servlet implementation class EnterPostServlet
 */
@WebServlet(description = "servlet that serve whom ever want to read a post.", urlPatterns = { "/EnterPostServlet" })
public class EnterPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterPostServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int postId = Integer.valueOf(request.getParameter("postId"));	//cant be null.
		UserConnection uc = (UserConnection) request.getSession().getAttribute("UserConnection");
		report rep = uc.enterPost(postId);
		
		if (rep == report.OK)
		{
			Post p = uc.getPost();
			request.getSession().setAttribute("PostClass", p);
			request.setAttribute("PostClass", p);					//saving attributes per REQUEST
			request.getRequestDispatcher("/post.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}
}
