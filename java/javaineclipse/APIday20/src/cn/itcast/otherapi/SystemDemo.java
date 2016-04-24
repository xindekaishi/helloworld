package cn.itcast.otherapi;

import java.util.Properties;
import java.util.Set;

public class SystemDemo {
	
	private static final String LINE_SEPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) {
		
		/*
		 * System:���еķ��������Զ��Ǿ�̬�ġ�
		 * 
		 * 
		 * ����������
		 * long currentTimeMillis();��ȡ��ǰʱ��ĺ���ֵ ��
		 * 
		 * */
	//	long l1 = 1335664696;
	//	System.out.println(l1/1000/60/60);
		
	//	long l2 = System.currentTimeMillis();
	//	System.out.println(l2 - l1);
	//	System.out.println("hello-"+LINE_SEPARATOR+"world");
		
           demo_1();
           //��ϵͳ����һЩ������Ϣ����Щ��Ϣ����ȫ�֣��������򶼿���ʹ�á�
           System.setProperty("myclasspath", "c:myclass");
	}

	public static void demo_1() {
		//��ȡϵͳ��������Ϣ�����洢����properties�����С�
		/*
		 * properties�����д洢�Ķ���String���͵ļ���ֵ��
		 * ���ʹ�����Լ��Ĵ洢��ȡ���ķ��������Ԫ�صĲ�����
		 * */
		Properties prop = System.getProperties();
		
		Set<String>nameSet = prop.stringPropertyNames();
		
		for(String name : nameSet){
			String value = prop.getProperty(name);
			
			System.out.println(name+"::"+value);
		}
	}

}
