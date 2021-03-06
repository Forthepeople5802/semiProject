package member.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import member.model.service.MemberService;
import member.model.vo.Business;

/**
 * Servlet implementation class CheckMailServlet
 */
@WebServlet("/checkmail")
public class CheckMailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckMailServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		request.setCharacterEncoding("utf-8");
		
		String userId=request.getParameter("userId");
		String email=request.getParameter("email");
		
		int bsResult = new MemberService().bsCheckMail(userId,email);
		int csResult = new MemberService().csCheckMail(userId,email);

		
		if(bsResult>0) {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append(String.valueOf(bsResult));
		}else if(csResult>0) {
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		out.append(String.valueOf(csResult));	
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
