package cn.itcast.linkedlist.test;

import java.util.LinkedList;

public class LinkedTest {
	/*
	 * ��ʹ��LinkedList��ģ��һ����ջ���߶������ݽṹ�� ��ջ���Ƚ��ȳ�first In Last Out Filo ���У��Ƚ��ȳ�First
	 * In First Out FIFO
	 * 
	 * ����Ӧ����������һ����������ʹ�����ṩһ������������������ֽṹ��һ�֡�
	 */
	

	public static void main(String[] args) {
       
		DuiLie a = new DuiLie() ;
		a.myAdd("abc1");
		a.myAdd("abc2");
		a.myAdd("abc3");
		a.myAdd("abc4");
		while(!a.isNull()){
			System.out.println(a.myGet());
		}
	}

}
