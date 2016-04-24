package cn.itcast.net.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerDemo2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		// ����˽��տͻ��˷��͹��������ݣ�����ӡ�ڿ���̨�ϡ�
		/*
		 * ����tcp����˵�˼·��
		 * 1.���������socket����ͨ��ServerSocket����
		 * 2.����˱�������ṩһ���˿ڣ�����ͻ����޷����ӡ�
		 * 3.��ȡ ���ӹ����Ŀͻ��˶���
		 * 4.ͨ���ͻ��˶����ȡsocket����ȡ�ͻ��˷��������ݲ���ӡ�ڿ���̨�ϡ�
		 * 5.�ر���Դ���رտͻ��ˣ��رշ���
		 * 
		 * */
		//1.��������˶���
		ServerSocket ss = new ServerSocket(10002);
		
		//��2.��ȡ���ӹ����Ŀͻ��˶���
         Socket s = ss.accept();//����ʽ��
         
         String ip = s.getInetAddress().getHostAddress();
         
         //3.ͨ��socket�����ȡ��������Ҫ��ȡ�ͻ��˷���������
         InputStream in = s.getInputStream();
         
         byte[] buf = new byte[1024];
         
         int len = in.read(buf);
         String text = new String(buf,0,len);
         System.out.println(ip+":"+text);
         
         
         //ʹ�ÿͻ���socket��������������ͻ��˷�������
         OutputStream out = s.getOutputStream();
         out.write("�յ�".getBytes());
         
         s.close();
         ss.close();
	}

}
