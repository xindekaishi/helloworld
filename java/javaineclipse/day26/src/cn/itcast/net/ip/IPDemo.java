package cn.itcast.net.ip;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	public static void main(String[] args) throws UnknownHostException {
		// TODO Auto-generated method stub
  //��ȡ���ص�ַip��ַ����
		InetAddress ip = InetAddress.getLocalHost();
		
		System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
	}

}
