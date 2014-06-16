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
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
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
		UserConnection uc = (UserConnection) request.getSession().getAttribute("UserConnection");
		String username = request.getParameter("name");
		String password = request.getParameter("pass");
		report rep = uc.login(username, password);
		String message = "";
		
		if (rep == report.OK)
			message = "Login succsesfuly";
		else if (rep == report.ALREADY_MEMBER_EXIST)
			message = "You are already logged in!";
		else if (rep == report.NO_SUCH_USER_NAME || rep == report.INVALID_PASSWORD)
			message = "Wrong username or password, Please try again";
		else 
			message = "Unknown error has accured, Oops!";
		
		request.setAttribute("messageRespond", message);					//saving attributes per REQUEST
		request.getRequestDispatcher("/login.jsp").forward(request, response);
	}

}
