package cn.itcast.net.uploadpic;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class UploadPicClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//1.�����ͻ���socket��
		Socket s = new Socket("127.0.0.1",10008);
		
		//2.��ȡ�ͻ���Ҫ�ϴ���ͼƬ�ļ���
		FileInputStream fis = new FileInputStream("D:\\1.jpg");
		
		//3.��ȡsocket�������������ͼƬ���ݷ��͸�����ˡ�
		OutputStream out = s.getOutputStream();
		
		byte[] buf = new byte[1024];
		
		int len = 0 ;
		
		while((len=fis.read(buf))!=-1){
			out.write(buf,0,len);
		}
		
		//���߷����˵����ߵ����ݷ�����ϡ��÷����ֹͣ��ȡ��
		s.shutdownOutput();
		
		
		//��ȡ����˷��ص����ݡ�
		InputStream in = s.getInputStream();
		byte[] bufIn = new byte[1024];
		
		int lenIn = in.read(buf);
		String text = new String(buf,0,lenIn);
		System.out.println(text);
		
		fis.close();
		s.close();

	}

}
