package com.newstart.login;

import org.apache.struts2.ServletActionContext;

/**
 * 
 * ����: LoginAction.extends ActionSupport
 * ����: ��¼�����Action.
 * ������: zhoujuan
 * ʱ��: 2016��3��27�� ����1:06:06
 * @version: V1.0
 */
public class LoginAction {
	
	private String username;
	private String password;
	
	//�����ڷ���execute()һ��Action���Ĭ�Ϸ�����
	//����Ҫȥ�̳�ActionSupport
	//������:xxxxxxxAction
	public String execute(){
		return "success";
	}
    
	//������Դ
	public String save(){
		System.out.println(username+"======"+password);		
		ServletActionContext.getRequest().getSession().setAttribute("username", username);
		ServletActionContext.getRequest().getSession().setAttribute("password", password);
		return "success";
	}
	
	public String delete(){
		username = "keke";
		password = "123456";//valuestatus===ֵջ ===request.setAttribute("username","keke");request.setAttribute("password","123456");
		System.out.println("ɾ���������ˣ�");
		return "success";
	}
	
	public String update(){
//		username = "keke";
//		password = "456789";		
		System.out.println("������Դ���������");
		return "redirect";
	}
	
	public String list(){
		username = "keke_list";
		password = "list_456789";		
		System.out.println("list���������");
		return "chain";
	}
	
	
	//�������Ե�getter/setter
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
  
}
