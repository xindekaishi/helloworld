package cn.itcast.io.file.demo;

import java.io.File;

public class FileDemo {

	public static void main(String[] args) {
		
		constructorDemo();

	}

	public static void constructorDemo() {
	
	//���Խ�һ���Ѵ��ڵ��ļ�����Ŀ¼��װ��file����
	File f1 = new File("c:\\a.txt");
	
	File f2 = new File("c:\\","a.txt");
	
	File f = new File("c:\\");
	
	File f3 = new File(f,"a.txt");
	
	File f4 = new File ("c:"+System.getProperty("file.separator")+"abc\\a.txt");
    System.out.println(f4);
    
	}

}
