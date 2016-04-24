package cn.itcast.net.ie_server;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyBrowser {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		Socket s = new Socket("127.0.0.1",9090);
		
		//ģ�����������tomcat����˷��ͷ���HTTPЭ���������Ϣ��
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		out.println("GET / HTTP/1.1/myweb/1.html");
		out.println("Accept: */*");
		out.println("Host:127.0.0.1:9090");
		out.println("Connection: Keep-Alive");
		
		InputStream in = s.getInputStream();
		
		byte[] buf = new byte[1024];
		int len = in.read(buf);
		
		String str = new String(buf,0,len);
		System.out.println(str);
		
		s.close();

	}

}
