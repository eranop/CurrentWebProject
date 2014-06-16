package servlets;

import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import services.Response;
import services.report;
import allcode.SubForum;
import allcode.UserConnection;

/**
 * Servlet implementation class EnterSubForumServlet
 */
@WebServlet(description = "user service when he chose sub forum and click enter", urlPatterns = { "/EnterSubForumServlet" })
public class EnterSubForumServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EnterSubForumServlet() {
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

		String subForumName = request.getParameter("SubForums");	//cant be null.
		UserConnection uc = (UserConnection) request.getSession().getAttribute("UserConnection");
		Response res = uc.enterSubforum(subForumName);
		
		if (res.getReport() == report.OK)
		{
			SubForum sf = uc.getSubForum();
			request.getSession().setAttribute("SubForumClass", sf);
			request.setAttribute("SubForumClass", sf);					//saving attributes per REQUEST
			request.setAttribute("subForumName", subForumName);			//means that next click or redirect those attributes will be gone.
			request.getRequestDispatcher("/subforumPage.jsp").forward(request, response);
		}
	
	}

}
