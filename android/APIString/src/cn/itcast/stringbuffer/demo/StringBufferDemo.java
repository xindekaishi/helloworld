package cn.itcast.stringbuffer.demo;

public class StringBufferDemo {
	


	public static void main(String[] args) {
		/*��Ȼ��һ����������Ӧ�þ߱�ʲô���ܣ�
		1����ӣ�
		  StringBuffer append(data);
		  StringBuffer insert(index,data);
		 2,ɾ����
		  StringBuffer delete(start,end):����ͷ������β��
		  StringBuffer delete(int index):ɾ��ָ��λ�õ�Ԫ�ء�
		 3,���ң�
		  char charAt(index);
		  int indexOf(String);
		  int lastIndexOf(String);
		 4.�޸ģ�
		   StringBuffer replace(start,end,string);
		   void setCharAt
		   
		*/
		bufferMethodDemo_1();
	}
	private static void bufferMethodDemo_1() {
		StringBuffer sb = new StringBuffer("abcde");
		sb.delete(1, 3);
		sb.setLength(10);
		System.out.println(sb);
	}
	public static void bufferMethodDemo() {
		
		StringBuffer sb = new StringBuffer();
	    sb.append(4);
 		sb.append(true);
		sb.insert(1,"haha");
		System.out.println(sb);
	}

}
