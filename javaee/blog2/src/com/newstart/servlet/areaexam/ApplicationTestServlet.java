package com.newstart.servlet.areaexam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * 类名: Test
 * 描述: application的作用域特性的测试类。
 * 创建人: zhoujuan
 * 时间: 2016年2月9日 下午10:17:01
 * @version: V1.0
 */
public class ApplicationTestServlet extends HttpServlet{

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
	       // application
	       String username = (String) this.getServletContext().getAttribute("username");
	       Integer password = (Integer) this.getServletContext().getAttribute("password");
	       PrintWriter out = response.getWriter();
	       out.println("<h1>application作用域的用户名和密码是:"+username+"====="+password+"</h1>");         
        
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
