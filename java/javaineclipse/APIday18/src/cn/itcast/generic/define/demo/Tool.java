package cn.itcast.generic.define.demo;

import cn.itcast.bean.Person;
/*
public class Tool {
/*	
	private Object object;
	public Object getObject(){
		return object;
	}
	
	public void setObject(Object object){
		this.object = object;
	}
	
	*/
/*
 * ��jdk1.5��ʹ�÷�������������Ҫ�����������������͡�
 * �����ࡣʲôʱ���ã������еĲ����������������Ͳ�ȷ����ʱ�򣬾�ʹ�÷�������ʾ*/
	
	public class Tool<Q>{
		private Q q;
		
		
	public Q getObject() {
			return q;
		}

		public void setObject(Q object) {
			this.q = object;
		}
		/*
		 * �����Ͷ����ڷ����ϡ�*/
		
	public<W> void show(W str){
		System.out.println("show :"+str);
	}
	public void print(Q str){
		System.out.println("print :"+str);
	}
	/*
	 * ��������̬ʱ�����ܷ������϶���ķ��͡������̬����ʹ�÷��͡�
	 * ֻ�ܽ����Ͷ����ڷ�����
	 * */
	public static <Y> void method(Y obj){
		System.out.println("method:"+obj);
	}
	

	public static void main(String[] args) {

	}

}
