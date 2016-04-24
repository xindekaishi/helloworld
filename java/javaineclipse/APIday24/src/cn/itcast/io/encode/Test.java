package cn.itcast.io.encode;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Test {

	public static void main(String[] args) throws IOException {

		String str = "ab���cdлл";
//		str = "ab�w�wcd�w�w";
//		int len = str.getBytes("gbk").length;
//		
//		for(int x= 0;x<len;x++){
//			System.out.println("��ȡ"+(x+1)+"���ֽڽ���ǣ�"+cutStringByByte(str,x+1));
//		}
		
		int len = str.getBytes("utf-8").length;
		
		for(int x= 0;x<len;x++){
			System.out.println("��ȡ"+(x+1)+"���ֽڽ���ǣ�"+cutStringByU8Byte(str,x+1));
		}
//		str = "�w";
//		byte[] buf = str.getBytes();
//		for(byte b:buf){
//			System.out.println(b);
//		}
	}
	/*
	 * ��java�У��ַ�����abcd"���ַ���"ab���"�ĳ�����һ���������ĸ��ַ���
	 * ����Ӧ���ֽ�����ͬ��һ������ռ�����ֽڡ�
	 * ����һ�����������������ֽ�����ȡ�ִ���
	 * �磺����"ab���"�����ȡ�����ֽڣ���ô�Ӵ�����ab��"��"�ֵİ����
	 * ��ô�����Ҫ���������ȡ�ĸ��ֽھ���"ab��"��ȡ����ֽڻ���"ab��"��
	 * 
	 * */
	
	
	public static String cutStringByU8Byte(String str, int len) throws IOException {
		
		
		byte[] buf = str.getBytes("utf-8");
		
		int count = 0 ;
		for(int x=len-1;x>=0;x--){
			if(buf[x]<0)
				count++;
			else
				break;
		}
		if(count%3==0)
			return new String(buf,0,len,"utf-8");
		else if(count%3==1)
			return new String(buf,0,len-1,"utf-8");
		else
			return new String(buf,0,len-2,"utf-8");
	}

		


	public static String cutStringByByte(String str,int len)throws IOException{
		
		byte[] buf = str.getBytes("gbk");
		
		int count = 0 ;
		for(int x=len-1;x>=0;x--){
			if(buf[x]<0)
				count++;
			else
				break;
		}
		if(count%2==0)
			return new String(buf,0,len,"gbk");
		else
			return new String(buf,0,len-1,"gbk");
		
	}

}
