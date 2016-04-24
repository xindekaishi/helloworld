package cn.itcast.io.filewrite;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriteDemo {

	private static final String LINE_SPARATOR = System.getProperty("line.separator");

	public static void main(String[] args) throws IOException {

		//����һ���������ļ���д���ַ����ݵ��ַ����������
		/*
		 * ��Ȼ����һ���ļ���д���������ݣ���ô�ڴ�������ʱ���ͱ�����ȷ���ļ������ڴ洢���ݵ�Ŀ�ĵأ���
		 * 
		 * ����ļ������ڣ�����Զ�������
		 * ������ļ����ڣ���ᱻ���ǡ�
		 * 
		 * ������캯������true������ʵ�ֶ��ļ�������д��
		 */
		FileWriter fw = new FileWriter("demo.txt",true);
		
		/*
		 * ����Writer�����е�writer��String��������д�����ݡ�
		 * 
		 * ��ʵ����д�뵽��ʱ�洢�������С�
		 * 
		 * */
		//fw.write("abcde"+LINE_SPARATOR+"hahaha");
		fw.write("xixi");
		/*
		 * ����ˢ�£�������ֱ��д��Ŀ�ĵ��С�
		 * */
		
		fw.flush();
		
		/*
		 * �ر������ر���Դ���ڹر�ǰ���ȵ���flushˢ�»����е����ݵ�Ŀ�ĵء�
		 */
		fw.close();
		//fw.write("haha");//java.io.IOException:Stream closed.
		
		 
	}

}
