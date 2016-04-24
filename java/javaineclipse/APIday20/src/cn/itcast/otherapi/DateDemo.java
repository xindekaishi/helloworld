package cn.itcast.otherapi;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) throws ParseException {
		
		methodDemo_3();
	}
	/*
	 * �����ڸ�ʽ���ַ���-->���ڶ���
	 * ʹ�õ���DateFormat���е�*/
	

	public static void methodDemo_3() throws ParseException {
		String str_date  = "2012-4-19";
		
		DateFormat dateFormat = DateFormat.getDateInstance();
		
	    Date date = dateFormat.parse(str_date);
	  
	    System.out.println(date);
	}

	/*
	 * �����ڽ��и�ʽ����
	 * 
	 * */

	public static void methodDemo_2() {
		
		Date date = new Date();
		
		//��ȡ���ڸ�ʽ���󡣾߱���Ĭ�ϵķ��FULL LONG��ָ�����
		DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.SHORT);
		dateFormat = DateFormat.getDateTimeInstance();
	//������Զ������ν���أ�
		dateFormat = new SimpleDateFormat("yyyy\\MM\\dd");
		
		String str_date = dateFormat.format(date);
		
		System.out.println(str_date);
				
	}



	
	
	
	
	
	/*
	 * ���ڶ���ͺ���ֵ֮���ת����
	 * 
	 * ����ֵ--->���ڶ���
	 * 1.ͨ��Date����Ĺ��췽��new Date(timeMillis);
	 * 2.������ͨ��setTimes���á�
	 * ��Ϊ����ͨ��Date����ķ����Ը������еĸ����ֶΣ������յȣ����в�����
	 *
	 * 
	 * ���ڶ���--->����ֵ��
	 * 2.getTime������
	 * ��Ϊ����ͨ���������ֵ�������㡣*/




	/**
	 * 
	 */
	private static void methodDemo_1() {
		long time = System.currentTimeMillis();
		System.out.println(time);//1429779576257

        Date date = new Date();//����ǰ���ں�ʱ���װ��Date����
        System.out.println(date);
        
        Date date2 = new Date( 14297);//��ָ���ĺ���ֵ��װ��Date����
        System.out.println(date2);
	}

}
