package cn.itcast.io.transstream.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
//import java.io.UnsupportedEncodingException;

public class TransStreamDemo3 {

	public static void main(String[] args) throws IOException {
		
		writeText_6();
		

	}

	public static void writeText_6() throws IOException, FileNotFoundException {
		InputStreamReader isr = new InputStreamReader(new FileInputStream("u8_1.txt"),"utf-8");
		char[] buf = new char[10];
		int len = isr.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);

		 isr.close();
	}

	public static void writeText_5() throws IOException {
		
		FileReader fr = new FileReader("gbk_1.txt");
		
		char[] buf = new char[10];
		int len = fr.read(buf);
		String str = new String(buf,0,len);
		System.out.println(str);
		
		fr.close();
	}

	public static void writeText_3() throws IOException, FileNotFoundException {
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("u8_1.txt"),"UTF-8");
        
		osw.write("���");
		
		osw.close();
	
	}

	public static void writeText_2() throws IOException {
		
		OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("gdk_2.txt"),"GBK");
		FileWriter fw = new FileWriter("gdk_1.txt");
		
		/*
		 * ���������Ĺ����ǵ�ͬ�ġ�
		 * FileWriter����ʵ����ת����ָ���˱���Ĭ���������֡��������ת������������󣬿��Է�������ı��ļ�
		 *             ��˵�������ļ����ֽ���+����Ĭ�ϵı����
		 *              ���ǰ���Ĭ������������ļ��ı���ࡣ
		 *              
		 * ��������ı��ļ���Ҫ��ȷ����ı��롣FileWriter�Ͳ����ˣ�������ת������
		 * 
		 * */
		
		osw.write("���");
		
		osw.close();
		
	}

	public static void writeText_1() throws IOException {
		
		FileWriter fw = new FileWriter("gbk_1.txt");
		
		fw.write("���");
		
		fw.close();
	}

}

