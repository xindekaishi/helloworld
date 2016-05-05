package com.newstart.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newstart.util.StringUtil;


/**
 * 
 * ����: RegisterServlet
 * ����: Servlet���������ڽ���
 * ������: zhoujuan
 * ʱ��: 2016��2��6�� ����10:10:48
 * @version: V1.0
 */
public class RegisterServlet extends HttpServlet{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = request.getParameter("username");
		System.out.println(username);
		if(StringUtil.isNotEmpty(username) &&username.equals("keke")){
               //��¼�ɹ�����ת����¼�ɹ�ҳ��success.jsp	
			
			  //�������
			  request.getRequestDispatcher("success.html");
		}else{
			//��¼ʧ�ܣ���������¼ʧ��ҳ��fail.jsp
			
			//�ض���:��һ�������������һ������---�����---fail.jsp
			//response.sendRedirect("fail.jsp");//�ض���ҳ��
			//response.sendRedirect("fail.html");//�ض���̬ҳ��
			response.sendRedirect("forward");//�ض���servlet
		}
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("3:servlet�����ﱻ�ͷ��ˡ���������");
	}

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		 System.out.println("1:servlet��ʼ������ķ�����");
		 String username = this.getServletConfig().getInitParameter("username");
		 String password = this.getServletConfig().getInitParameter("password");
		 System.out.println(username+"====="+password); 
		 
		 String kekestring = this.getServletContext().getInitParameter("keke");
		 System.out.println(kekestring);
	}
	
	//1:servlet��ʵ������α����ص�?
	//�������ص�Servlet�����init()����,���г�ʼ��servlet�����ģ�servletConfig�ĳ�ʼ����
    //2:��δ�������
	//��������ķ������뵽service���������뵽service������Ҳ������������ʽ���뵽doGet/doPost������
	//doGet(HttpServletRequest,HttpServletResponse);
	//3:Servlet��α��ͷ�
	//servlet�ǵ�ʵ�����߳�(ֻ��ʼ��һ�Σ�ÿһ�����󶼻ᴴ��һ���߳�)��
}
