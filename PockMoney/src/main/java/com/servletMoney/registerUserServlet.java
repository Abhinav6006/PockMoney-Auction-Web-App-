package com.servletMoney;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.User;
import com.service.AuctionItemsService;

/**
 * Servlet implementation class registerUserServlet
 */
@WebServlet("/registerUserServlet")
public class registerUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public registerUserServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		AuctionItemsService ats=new AuctionItemsService();
		User userObj=new User();
		String name=request.getParameter("name");
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		userObj.setName(name);
     	userObj.setUserName(username);
     	userObj.setUserPass(password);
     	userObj.setStatus("Pending");
		ats.userEntry(userObj);
//		out.println("Your Request has been send successfully to Admin");
//		RequestDispatcher rd=request.getRequestDispatcher("/index.jsp");
//		rd.include(request, response); 
//		response.sendRedirect("index.jsp");
		out.println("<a href='index.jsp'>Back To Home</a> ");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
