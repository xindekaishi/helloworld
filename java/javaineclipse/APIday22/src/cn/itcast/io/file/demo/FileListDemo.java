package cn.itcast.io.file.demo;

import java.io.File;

import cn.itcast.io.filter.FilterByHidden;
import cn.itcast.io.filter.FilterByJava;
import cn.itcast.io.filter.SuffixFilter;

public class FileListDemo {

	public static void main(String[] args) {
		
		listDemo_2();

	}

	public static void listDemo_3() {
		

		File dir = new File("c:\\");
		
		File[] files = dir.listFiles(new FilterByHidden());
		System.out.println(files.length);
		
		for(File file : files){
			 
			
			 System.out.println(file);
		}
	}

	public static void listDemo_2() {
		
		File dir = new File("d:\\first");
		
		String[] names = dir.list(new SuffixFilter(".txt"));
		
		for(String name : names){
			 System.out.println(name);
		}
	}

	public static void listDemo() {

	  File file = new File("d:\\first");
	  
	  /*
	   * ��ȡ��ǰĿ¼�µ��ļ����ļ��е����ƣ����������ļ���
	   * ����list������File�����з�װ�ı�����Ŀ¼��
	   * ����ᷢ��NullPointerException
	   * ������ʵ�ϵͳĿ¼Ҳ�ᷢ����ָ���쳣��
	   * 
	   * ���Ŀ¼���ڵ���û�����ݣ��᷵��һ�����飬���ǳ���Ϊ0.
	   * 
	   * */
	  String[] names = file.list();
	  System.out.println(names.length);
	  
	  for(String name : names){
		  System.out.println(name);
	  }
	}

}
