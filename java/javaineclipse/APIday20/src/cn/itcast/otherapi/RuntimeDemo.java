package cn.itcast.otherapi;

import java.io.IOException;

public class RuntimeDemo {

	public static void main(String[] args) throws IOException, InterruptedException {
      
		/*
		 * Runtime:û�й��췽��ժҪ��˵�����಻���Դ�������
		 * �ַ��ֻ��зǾ�̬�ķ�����˵������Ӧ���ṩ��̬�ķ��ظ������ķ�����
		 * ����ֻ��һ����˵��Runtime��ʹ���˵������ģʽ��
		 * 
		 * 
		 * */
		Runtime r = Runtime.getRuntime();
		//execute: ִ�С�xxx.exe
		
		//r.exec("notepad.exe");
		Process p = r.exec("notepad");
		Thread.sleep(5000);
		p.destroy();
		
		
		
	}

}
