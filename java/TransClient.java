
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class TransClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
      /*
       * ˼·��
       * �ͻ��ˣ�
       * 1.��Ҫ����socket�˵㡣
       * 2.�ͻ��˵�����Դ�����̡�
       * 3.�ͻ��˵�Ŀ�ģ�socket��
       * 4.���շ���˵����ݣ�Դsocket��
       * 5.��������ʾ�ڿ���̨��Ŀ�ģ�����̨��
       * 6.����Щ���в��������ݶ����ı����ݡ�
       * 
       * ת���ͻ��ˣ�
       * 1.����socket�ͻ��˶���
       * 2.��ȡ����¼�롣
       * 3.��¼�����Ϣ���͸�socket�������
       * 
       * */
		//1.����socket�ͻ��˶���
		Socket s = new Socket("127.0.0.1",10001);
				
	    //2.��ȡ����¼�롣
	    BufferedReader bufr = new BufferedReader( new InputStreamReader(System.in));
		
		//3.socket�������
		PrintWriter out = new PrintWriter(s.getOutputStream(),true);
		
		//4.socket����������ȡ����˷��صĴ�д����
		BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
		
		String line = null;
		
		while((line=bufr.readLine())!=null){
			
			if("over".equals(line))
				break;
			out.println(line);
			
			//��ȡ����˷��ص�һ�д�д����
			String upperStr = bufIn.readLine();
			System.out.println(upperStr);
		}
                s.close();
	}

}
