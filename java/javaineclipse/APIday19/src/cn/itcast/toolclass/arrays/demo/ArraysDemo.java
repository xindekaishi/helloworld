package cn.itcast.toolclass.arrays.demo;

import java.util.Arrays;
import java.util.List;

public class ArraysDemo {

	public static void main(String[] args) {
           /*
            * Arrays:���Ͽ�ܹ����ࡣ����ķ������Ǿ�̬�ġ�
            * 
            * */
		
	//	int[] arr = { 3,1,5,6,3,6};
		
	//	System.out.println(Arrays.toString(arr));
		
		demo_2();
	}

	public static void demo_2() {
		
		/*
		 * ��������е�Ԫ���Ƕ�����ôת�ɼ���ʱ��ֱ�ӽ������е�Ԫ����Ϊ�����е�Ԫ�ؽ��м��ϴ洢��
		 * 
		 * ��������е�Ԫ���ǻ���������ֵ����ô�Ὣ��������Ϊ�����е�Ԫ�ؽ��д洢��
		 * 
		 * */
		
		int[] arr = {31,11,51,61};
		
		List list = Arrays.asList(arr);
		
		System.out.println(list);
	}

	/**
	 * 
	 */
	private static void demo_1() {
		/*
		 * �ص㣺List asList(���飩������ת�ɼ��ϡ�
		 * 
		 * �ô�:��ʵ�����ü��ϵķ������������е�Ԫ�ء�
		 * ע�⣺����ĳ����ǹ̶��ģ����Զ��ڼ��ϵ���ɾ�����ǲ�����ʹ�õġ�
		 * ����ᷢ��UnsuportedOperationexction
		 * 
		 * */
		
		String[] arr = {"abc","haha","xixi"};
		
	//	boolean b = myContains(arr,"xixi");
	//	System.out.println(b);
		
		List<String> list = Arrays.asList(arr);
		//boolean b = list.contains("xixi");
		//System.out.println("b="+b);
		//list.add("hiahia");
	}
	
	public static boolean myContains(String[] arr,String key){
		for(int i = 0; i< arr.length;i++){
			if(arr[i].equals(key))
				return true;
		}
		return false;
		}
	}
/*	
	//toString�ľ���ʵ�֡�
	public  static String myToString(int[] a){
	 if (a == null)
         return "null";
     int iMax = a.length - 1;
     if (iMax == -1)
         return "[]";

     StringBuilder b = new StringBuilder();
     b.append('[');
     for (int i = 0; ; i++) {
         b.append(a[i]);
         if (i == iMax)
             return b.append(']').toString();
         b.append(", ");
     }
	}
*/

