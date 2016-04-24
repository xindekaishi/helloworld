package cn.itcast.generic.advance.demo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import cn.itcast.bean.Person;
import cn.itcast.bean.Student;
import cn.itcast.bean.Worker;

public class GenericAdvanceDemo {

	public static void main(String[] args) {
		ArrayList<Worker> a1 = new ArrayList<Worker>();
		
		a1.add(new Worker ("abc",30));
		a1.add(new Worker("hehe",34));
		
		ArrayList<Student> a12 = new ArrayList<Student>();
	    a12.add(new Student ("abc",30));
		a12.add(new Student ("hehe",34));
		
		printCollection(a1);
	    printCollection(a12);

	}

	/**
	 * @param a1
	 */
	/*
	 * ��������ӡ�����е�Ԫ�ء�
	 * 
	 * ���Զ����ͽ����޶���
	 * ��extends E:����E���ͻ���E�������Ͷ������ޣ�
	 * 
	 * ��extends E:����E���ͻ���E�ĸ����͡����ޣ�*/
	private static void printCollection(Collection<? extends Person> a1) {
		Iterator<?> it = a1.iterator();
		while(it.hasNext()){
			System.out.println(it.next().toString());
		}
	}

}
