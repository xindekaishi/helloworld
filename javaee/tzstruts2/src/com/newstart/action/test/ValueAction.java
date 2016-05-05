package com.newstart.action.test;

import java.util.Map;

import javafx.application.Application;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.apache.struts2.interceptor.ServletRequestAware;
import org.apache.struts2.interceptor.ServletResponseAware;
import org.apache.struts2.interceptor.SessionAware;
import org.apache.struts2.util.ServletContextAware;

import com.opensymphony.xwork2.ActionContext;

/**
 * 
 * ����: ValueAction
 * ����: ��ȡservlet-----HttpServletRequest,HttpServletResponse,ServletContext����
 * ������: zhoujuan
 * ʱ��: 2016��4��9�� ����9:49:10
 * @version: V1.0
 */
public class ValueAction implements ServletRequestAware,ServletResponseAware,ServletContextAware,SessionAware{
   
	private HttpServletRequest request;
	private HttpServletResponse response;
	private ServletContext application;
	private Map<String,Object> session;
	//ֵע��ķ�ʽ��ȡ����ֵ
	private String username;

	public String value(){
		System.out.println("��������");
		//ֵע��ķ�ʽ��ȡ����ֵ
		System.out.println("="+username);
		//ͨ����̳�ServletRequestAware�ӿڳ�ʼ��HttpServletRequest��ȡ����ֵ
		System.out.println("==="+request.getParameter("username"));
		//ͨ��Struts2�ṩ��ServletActionContext����������ȡ����ֵ��
		System.out.println("====="+ServletActionContext.getRequest().getParameter("username"));
		//ActionContext.getContext().put(HTTP_REQUEST, request);
		HttpServletRequest r = (HttpServletRequest)ActionContext.getContext().get("com.opensymphony.xwork2.dispatcher.HttpServletRequest");
		System.out.println("======="+r.getParameter("username"));
		return "value";
	}
	
	@Override
	public void setServletResponse(HttpServletResponse response) {
		// TODO Auto-generated method stub
		this.response = response;
	}
    
	public String save(){
		//request������
		request.setAttribute("username", "��ͬѧ");
		ServletActionContext.getRequest().setAttribute("username","abcdefg");
		//session������
		request.getSession().setAttribute("username", "С����ͬѧ");
		ServletActionContext.getRequest().getSession().setAttribute("username", "С����ͬѧ123456");
		session.put("username", "С����ͬѧ789");
		ServletActionContext.getContext().getSession().put("username", "����С����");
		//application������,����ĸ���ǰ��ġ�
		application.setAttribute("username", "keke��ʦ");
		ServletActionContext.getServletContext().setAttribute("username", "kekexx��ʦ");
		ServletActionContext.getContext().getApplication().put("username", "keke��ʦyyy");
		return "save";
	}
	
	public String update(){
		System.out.println("��ֵ̬��ע��username====="+username);
		return "update";
	}
	
	public String search(){
		return "search";
	}
	@Override
	public void setServletRequest(HttpServletRequest request) {
		// TODO Auto-generated method stub
		this.request = request;
	}	
	
	public HttpServletRequest getRequest() {
		return request;
	}

	public void setRequest(HttpServletRequest request) {
		this.request = request;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Override
	public void setServletContext(ServletContext application) {
		// TODO Auto-generated method stub
		this.application = application;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		// TODO Auto-generated method stub
		this.session = session;
	}
	

}
