package cn.itcast.net.tcptest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TransClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      /*
       * 思路：
       * 客户端：
       * 1.需要先有socket端点。
       * 2.客户端的数据源：键盘。
       * 3.客户端的目的：socket。
       * 4.接收服务端的数据，源socket。
       * 5.将数据显示在控制台：目的：控制台。
       * 6.在这些流中操作的数据都是文本数据。
       * 
       * 转换客户端：
       * 1.创建socket客户端对象。
       * 2.获取键盘录入。
       * 3.将录入的信息发送给socket输出流。
       * 
       * */
		//1.创建socket客户端对象。
		Socket s = new Socket("127.0.0.1",10001);
				
	    //2.获取键盘录入。
	    BufferedReader bufr = new BufferedReader( new InputStreamReader(System.in));
		
		//3.socket输出流。
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//4.socket输入流，读取服务端返回的大写数据
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		
		while((line=bufr.readLine())!=null){
			
			if("over".equals(line))
				break;
			out.println(line);
			
			//读取服务端返回的一行大写数。
			String upperStr = bufIn.readLine();
			System.out.println(upperStr);
		}
		
		s.close();
	}

}
