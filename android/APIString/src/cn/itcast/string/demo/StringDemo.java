package cn.itcast.string.demo;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * String����ص㣺
		 * �ַ�������һ������ʼ�� �Ͳ���ı�
		 * */
        String s = "abc";
        String s1 = new String("abc");//�ڶ� �ﴴ��2������һ��newһ���ַ��������ڶ��ڴ��С�
        System.out.println(s==s1);//�Ƚϵ�ַ��
        System.out.println(s.equals(s1));//string���е�equals��дobject���е�equals,������string���Լ����ж��ַ����Ƿ���ȵ����ݡ��Ƚ��ַ����е�����
        // System.out.println("s="+s);//"abc"�洢���ַ����������С�
       // System.out.println("s1="+s1);
	}

}
