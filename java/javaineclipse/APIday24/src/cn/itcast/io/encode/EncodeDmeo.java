package cn.itcast.io.encode;

import java.io.IOException;

public class EncodeDmeo {

	public static void main(String[] args) throws IOException {
		
		/*
		 * �ַ���--->�ֽ����飺���롣
		 * �ַ�����---->�ַ��������롣
		 * �������ˣ��ⲻ������
		 * �������ˣ�����ˣ��п����оȡ�
		 * 
		 * */
		
		String str = "���";
		
		//���룻
		byte[] buf = str.getBytes("gbk");
		
		printBytes(buf);
		String s1 = new String(buf,"iso8859-1");
		
//		System.out.println("s1="+s1);
         
		byte[] buf2 = s1.getBytes("iso8859-1");//��ȡԴ�ֽڡ�
		String s2 = new String(buf2,"GBK");
		
		System.out.println("s2="+s2);
	}

	private static void printBytes(byte[] buf) {
		for(byte b:buf){
			System.out.print(b+", " );
		}
	}

}
