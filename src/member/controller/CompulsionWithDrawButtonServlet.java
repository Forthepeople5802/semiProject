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
 * Servlet implementation class CompulsionWithDrawButtonServlet
 */
@WebServlet("/comwithbtn")
public class CompulsionWithDrawButtonServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CompulsionWithDrawButtonServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8"); 
		String bsId =request.getParameter("bsid");
		
		int result = new MemberService().compulsionWithDraw(bsId);
		
		RequestDispatcher view =null;
		if(result >0) {
			response.sendRedirect("blist?page=1");
			
			
		}else {
			view = request.getRequestDispatcher("views/adminMy/admin_my.jsp");
			request.setAttribute("noSearchArpproval", "검색결과없음");
			request.setAttribute("tab","tab-2");
			view.forward(request, response);
			
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
