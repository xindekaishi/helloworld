package cn.itcast.string.demo;

public class StringConstructorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      
		
		 stringConstructorDemo2();
	}

	private static void stringConstructorDemo2() {
		char[] arr = {'w','a','p','q','x'};
		String s = new String(arr,1,3);
		System.out.println("s="+s);
	}

	public static void stringConstructorDemo() {
		String s = new String();
		
		byte[] arr = {65,66,67,68};
		String s1 = new String(arr);
		System.out.println("s1="+s1);
		
	}

	
}
