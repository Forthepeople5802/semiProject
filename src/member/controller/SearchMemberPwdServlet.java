package member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;

/**
 * Servlet implementation class SearchMemberPwdServlet
 */
@WebServlet("/searchPwd")
public class SearchMemberPwdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public SearchMemberPwdServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");

		String userId = request.getParameter("userId");
		String userName = request.getParameter("userName");
		String email = request.getParameter("email");

		String userPwd = new MemberService().searchPwd(userId, userName, email);

		if (userPwd != null) {
			// 아이디 찾음 , 이메일주소로 아이디 보내줘야함
			// 메일 보내고 로그인 페이지로 이동
			RequestDispatcher view = request.getRequestDispatcher("sendmail");
			request.setAttribute("email", email);
			request.setAttribute("userPwd", userPwd);
			view.forward(request, response);
		} else {
			//아이디 못찾음, 다시 아이디 찾기 페이지로 이동
			response.sendRedirect("/food/views/login/pwd_Find.jsp");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
