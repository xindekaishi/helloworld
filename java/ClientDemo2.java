

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientDemo2 {
	public static void main(String[] args) throws IOException, IOException {
		/*
	  	 * Tcp����,�ͻ��˽����Ĺ��̡�
		 * 1.����Tcp�ͻ���socket����ʹ�õ���Socket����
		 *      ����ö���һ��������ȷĿ�ĵء�Ҫ���ӵ�������
		 * 2.������ӽ����ɹ���˵�����ݴ���ͨ���Ѿ�������
		 *      ��ͬ������socket�����ǵײ㽨���õġ���Ȼ������˵������������룬���������
		 *      ��Ҫ���������������󣬿�����Socket����ȡ��
		 *      ����ͨ��getOutputStream��������getInputStream��������ȡ�����ֽ�����
		 * 3.ʹ���������������д����
		 * 4.�ر���Դ��
		 * 
		 *      */
		//�����ͻ���socket����
		Socket socket = new Socket("127.0.0.1",1433);
		
		//��ȡsocket���е��������
		OutputStream out = socket.getOutputStream();
		
		//ʹ���������ָ��������д��ȥ��
		out.write("tcp��ʾ�����������ˣ�".getBytes());
		
		//��ȡ����˷��ص����ݣ�ʹ��socket��ȡ����
		InputStream in = socket.getInputStream();
		byte[] buf = new byte[1024];
		
		int len = in.read(buf);
		
		String text = new String(buf,0,len);
		
		System.out.println(text);
		
		//�ر���Դ��
		socket.close();
		
	}

}
