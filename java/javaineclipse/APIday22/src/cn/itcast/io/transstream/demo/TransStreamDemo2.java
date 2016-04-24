package cn.itcast.io.transstream.demo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TransStreamDemo2 {

	public static void main(String[] args) throws IOException {
		
		/*
		 * 1.���󣺽�����¼�������д�뵽һ���ļ��С�
		 * 
		 * 2.���󣺽�һ���ı��ļ�������ʾ�ڿ���̨�ϡ�*/
	
		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("b.txt")));
		
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String line = null;
		
		while((line=bufr.readLine())!=null){
			if("over".equals(line))
				break;
	//		System.out.println(line.toUpperCase());
//			osw.write(line.toUpperCase()+"\r\n");
//			osw.flush();
			
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
			
		}
        
	}
	 

}
