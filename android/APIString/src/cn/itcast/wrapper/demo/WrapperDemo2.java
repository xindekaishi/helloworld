package cn.itcast.wrapper.demo;

public class WrapperDemo2 {

	public static void main(String[] args) {

		/*
		 * int num = 4; num = num + 5; Integer i = 4; �Զ�װ�����д�� i = i + 6 ; �Զ�����
		 * System.out.println(i);
		 */
		Integer a = new Integer(128);
		Integer b = new Integer(128);

		System.out.println(a == b);
		System.out.println(a.equals(b));

		Integer x = 129;// jdk1.5�Ժ��Զ�װ�䣬���װ�����һ���ֽڣ���ô�����ݻᱻ���������¿��ٿռ䡣
		Integer y = 129;
		System.out.println(x == y);
		System.out.println(x.equals(y));
	}

}
