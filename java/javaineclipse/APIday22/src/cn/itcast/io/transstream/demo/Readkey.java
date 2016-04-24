package cn.itcast.io.transstream.demo;

import java.io.IOException;
import java.io.InputStream;

/*
 * ��ȡһ������¼������ݣ�����ӡ�ڿ���̨�ϡ�
 * 
 * ���̱������һ����׼�������豸��
 * ����Java���ԣ��������������豸���ж�Ӧ�Ķ���
 * 
 * */

public class Readkey {

	public static void main(String[] args) throws IOException {

		readKey2();
		// System.out.println((int)'\r');
		// System.out.println((int)'\n');
	}

	public static void readKey2() throws IOException {

		/*
		 * ��ȡ�û�����¼������ݣ� �������ݱ�ɴ�д��ʾ�ڿ���̨�ϡ� ����û��������Over����������¼�롣
		 * 
		 * ˼·�� 1.��Ϊ����¼��ֻ��ȡһ���ֽڣ�Ҫ�ж��Ƿ���Over, 2.�Ǿ���Ҫһ��������StringBuilder��
		 * 3.���û��س�֮ǰ��¼������ݱ���ַ����жϼ��ɡ�
		 */

		// 1.����������
		StringBuilder sb = new StringBuilder();

		// 2.��ȡ���̶�ȡ����
		InputStream in = System.in;

		// 3.���������¼��ȡ�����ֽڣ���ѭ����ȡ��
		int ch = 0;

		while ((ch = in.read()) != -1) {

			// �ڴ洢֮ǰ��Ҫ�ж��Ƿ��ǻ��б�ǣ���Ϊ���б�ǲ��洢��
			if (ch == '\r')
				continue;
			if (ch == '\n') {
				String temp = sb.toString();
				if ("over".equals(temp))
					break;
				System.out.println(temp.toUpperCase());
				sb.delete(0, sb.length());
			}

			else
				// ����ȡ�����ֽڴ洢��StringBuilder�С�
				sb.append((char) ch);
			//System.out.println(ch);
		}
	}

	public static void readKey() throws IOException {

		InputStream in = (InputStream) System.in;

		int ch = in.read();// ��������
		System.out.println(ch);
		int ch1 = in.read();
		System.out.println(ch1);
		int ch2 = in.read();
		System.out.println(ch2);
	}

}
