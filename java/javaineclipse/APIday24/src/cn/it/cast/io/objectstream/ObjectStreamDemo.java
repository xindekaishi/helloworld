package cn.it.cast.io.objectstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import cn.itcast.io.bean.Person;

public class ObjectStreamDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
	//	writeObj();
		readObj();

	}

	public static void readObj() throws IOException, IOException, ClassNotFoundException {
		
	ObjectInputStream ois =  new ObjectInputStream(new FileInputStream("obj.object"));
	//����ķ����л���
	Person p = (Person)ois.readObject();
	
	System.out.println(p.getName()+":"+p.getAge());
	
	ois.close();
	
	
	
	}

	public static void writeObj() throws IOException, IOException {
        
	   ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));
	   //��������л��������л��Ķ������ʵ��Serializable�ӿڡ�
	   oos.writeObject(new Person("Сǿ",30));
	   
	   oos.close();
	}

}
