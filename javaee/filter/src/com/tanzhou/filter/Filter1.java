package com.tanzhou.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


/**
 * 
 * ����: Filter1
 * ����: ��һ��������
 * ������: zhoujuan
 * ʱ��: 2016��2��20�� ����10:05:47
 * @version: V1.0
 */
public class Filter1 implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		System.out.println("[filter1]========dofilter");
		chain.doFilter(request, response);//������һ��������
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
	    System.out.println("���ǵ�һ��������============Filter1");
	}

}
