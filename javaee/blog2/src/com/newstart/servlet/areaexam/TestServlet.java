package com.newstart.servlet.areaexam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * 
 * ����: Test
 * ����: application�����������ԵĲ����ࡣ
 * ������: zhoujuan
 * ʱ��: 2016��2��9�� ����10:17:01
 * @version: V1.0
 */
public class TestServlet extends HttpServlet{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		this.doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//       application
//       String username = (String) this.getServletContext().getAttribute("username");
//       Integer password = (Integer) this.getServletContext().getAttribute("password");
//       PrintWriter out = response.getWriter();
//       out.println("<h1>application��������û�����������:"+username+"====="+password+"</h1>");         

       //session
		 HttpSession session = request.getSession();
		 String username = (String) session.getAttribute("username");
		 Integer password = (Integer) session.getAttribute("password");
		 System.out.println(username+"====="+password);
         PrintWriter out = response.getWriter();
         out.println("<h1>session��������û�����������:"+username+"====="+password+"</h1>");
 
       //request
//       String username = (String) request.getAttribute("username");
//       Integer password = (Integer) request.getAttribute("password");
//       PrintWriter out = response.getWriter();
//       out.println("<h1>request��������û�����������:"+username+"====="+password+"</h1>");         
         
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		super.destroy();
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
	}
	
    
}
