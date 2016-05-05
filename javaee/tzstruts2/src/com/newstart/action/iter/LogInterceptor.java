package com.newstart.action.iter;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;

/**
 * ����һ���������Ĳ��裺
 * 1������һ��LoginInterceptor �̳�AbstractInterceptor
 * 2:��struts-login.xml�����ú�ע�����ǵ�������
 * 3������������
 * ע��㣺�Զ����������һ��Ҫ�ں������Ĭ�ϵ�������ջ��������Ҫstruts2�ṩ��һϵ�������������ǻ�����Ǵ����ļ��ϴ�������ע�룬���ʻ������صȵȣ�
 * ����: LogInterceptor
 * ����: ��¼���أ��̳�AbstractInterceptor:�������еĽ���action����֮ǰ��һ��������
 * ������: zhoujuan
 * ʱ��: 2016��4��10�� ����11:17:23
 * @version: V1.0
 */
public class LogInterceptor extends AbstractInterceptor{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String intercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("��־��������������");
		return invocation.invoke();//���ִ�гɹ����Ϳ��Է��У�ȥִ�����Ƕ�Ӧ��Action���������(����Action����)
	}
  
}
