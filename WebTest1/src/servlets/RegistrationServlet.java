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
 * Servlet implementation class RegistrationServlet
 */
@WebServlet("/RegistrationServlet")
public class RegistrationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationServlet() {
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
		// TODO Auto-generated method stub

		UserConnection uc = (UserConnection) request.getSession().getAttribute("UserConnection");
		String userName = request.getParameter("name");
		String password = request.getParameter("pass");
		String email = request.getParameter("email");
		String answer = request.getParameter("answer");
		String question = request.getParameter("question");
		report rep = uc.registerToForum(userName, password, email, question, answer);
		String message = "";
		if (rep == report.OK)
			message = "Succssesfuly registered. Email will be sent";
		else if (rep == report.NULL_FIELD || rep == report.EMPTY_FIELD)
			message = "One or more fields are empty";
		else if (rep == report.ALREADY_MEMBER_EXIST)
			message = "Username is already in use";
		else if (rep == report.ALREADY_EMAIL_EXIST)
			message = "Email is already registered by a different Username";
		else if (rep == report.INVALID_USER_NAME)
			message = "Username must start with a letter and not contains any Tags (Such as !@#$...)";
		else if (rep == report.INVALID_EMAIL_PATTERN)
			message = "Email is invalid";
		else
			message = "Unknown error has accured.. Oops!";

		request.setAttribute("messageRespond", message);					//saving attributes per REQUEST
		request.getRequestDispatcher("/registration.jsp").forward(request, response);
	}

}
