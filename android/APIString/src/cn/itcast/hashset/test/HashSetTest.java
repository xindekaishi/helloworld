package cn.itcast.hashset.test;

import java.util.HashSet;
import java.util.Iterator;

import cn.itcast.bean.Person;

public class HashSetTest {

	public static void main(String[] args) {
         
		HashSet hs = new HashSet();
		/*
		 * HashSet�������ݽṹ�ǹ�ϣ�����Դ洢Ԫ�ص�ʱ��
		 * ʹ�õ�Ԫ�ص�hashCode������ȷ��λ�ã����λ����ͬ����ͨ��Ԫ�ص�equals��ȷ���Ƿ���ͬ��*/
		hs.add(new Person("list4",24));
		hs.add(new Person("list7",27));
		hs.add(new Person("list1",21));
		hs.add(new Person("list9",29));
		hs.add(new Person("list7",27));
		
		Iterator it = hs.iterator();
		
		while(it.hasNext()){
			Person p = (Person)it.next();
			System.out.println(p.getName()+"......."+p.getAge());
		}
		
		
		
		
	}

}
