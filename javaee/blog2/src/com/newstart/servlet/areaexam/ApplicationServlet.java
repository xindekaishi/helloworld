package com.newstart.servlet.areaexam;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * ����: ApplicationServlet
 * ����: application����������ԡ�
 * ������: zhoujuan
 * ʱ��: 2016��2��9�� ����9:52:48
 * @version: V1.0
 */
public class ApplicationServlet extends HttpServlet{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
         this.doPost(request,response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
            //��ȡ�����Ķ��󣬺�web����ͬ�����������е�servlet�����Թ���������(���ܵ���ֵ�Ḳ��);
		ServletContext application = this.getServletContext();
		application.setAttribute("username","����");
		application.setAttribute("password",222222);
        PrintWriter out = response.getWriter();
        out.println("<h1>application��ֵ�ɹ���</h1>");		
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
