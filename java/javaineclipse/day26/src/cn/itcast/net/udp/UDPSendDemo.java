package cn.itcast.net.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class UDPSendDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("���Ͷ�����������������");
		/*
		 * ����UDP����ķ��Ͷˡ�
		 * ˼·��
		 * 1.����UDP��socket����
		 * 2.��Ҫ���͵����ݷ�װ�����ݰ��С�
		 * 3.ͨ��UDP��socket�������ݰ����ͳ�ȥ��
		 * 4.�ر�socket����
		 * */
		//1.udpsocket����ʹ��DatagramSocket����
		 DatagramSocket ds = new DatagramSocket();
		//2.��Ҫ���͵����ݷ�װ�����ݰ��С�
		String str = "udp������ʾ���������ˣ�";
		           //ʹ��DatagramPacket�����ݷ�װ���ĸö���İ��С�
		byte[] buf = str.getBytes();
		
		DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("127.0.0.1"),10);
				
		
		//3.ͨ��UDP��socket�������ݰ����ͳ�ȥ������send������
		ds.send(dp);
		//�ر���Դ
		ds.close();

	}

}
