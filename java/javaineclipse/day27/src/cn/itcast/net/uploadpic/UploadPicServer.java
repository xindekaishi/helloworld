package cn.itcast.net.uploadpic;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class UploadPicServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//����tcp��socket����ˡ�
		ServerSocket ss = new ServerSocket(10008);
		
		
		while(true){
			
			//��ȡ�ͻ��ˡ�
			Socket s = ss.accept();	
			
			new Thread(new UploadTask(s)).start();
			
		}
		
		
		
		
//		ss.close();
	}

}
