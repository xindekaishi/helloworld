package cn.itcast.wrapper.demo;

public class WrapperDemo {

	public static void main(String[] args) {
		/*
		 * �����������Ͷ����װ�ࡣ Ϊ�˷������������������ֵ�������װ�ɶ���
		 */
		// System.out.println(Integer.toBinaryString(8));
		// System.out.println();

		/*
		 * ʮ����-->�������ơ�
		 */
		// System.out.println(Integer.toBinaryString(60));
		// System.out.println(Integer.toOctalString(60));
		// System.out.println(Integer.toHexString(60));
		Integer a = new Integer("89");
		Integer b = new Integer(89);

		System.out.println(a == b);

		System.out.println(a.equals(b));

		System.out.println(a.compareTo(b));

	}

}
