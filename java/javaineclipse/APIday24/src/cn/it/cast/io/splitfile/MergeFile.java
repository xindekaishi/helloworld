package cn.it.cast.io.splitfile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Properties;

public class MergeFile {

	public static void main(String[] args) throws IOException {
		File dir = new File("d:\\partfiles");
		
		mergeFile_2(dir);

	}
	
	public static void mergeFile_2(File dir) throws IOException {
		
		/*
		 * ��ȡָ��Ŀ¼�µ������ļ�����
		 */
		
		File[] files = dir.listFiles(new SuffixFilter(".properties"));
		
		if(files.length!=1)
			throw new RuntimeException(dir+",��Ŀ¼��û��properties��չ�����ļ����߲�Ψһ");
		//��¼�����ļ�����
		File confile = files[0];
		
		//��ȡ���ļ��е���Ϣ================================================================
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(confile);
		
		prop.load(fis);
		
		String filename = prop.getProperty("filename");
		
		int count =Integer.parseInt( prop.getProperty("partcount"));
		
		
		//��ȡ��Ŀ¼�µ�������Ƭ�ļ�====================================================================
		File[] partFiles = dir.listFiles(new SuffixFilter(".part"));
		
		if(partFiles.length!=(count-1)){
			throw new RuntimeException("��Ƭ�ļ�������Ҫ�󣬸������ԣ�Ӧ��"+count+"��");
			
		}
		//����Ƭ�ļ���������������洢�������С�
		ArrayList<FileInputStream> a1 = new ArrayList<FileInputStream>();
		for (int x = 0; x < partFiles.length; x++) {
			a1.add(new FileInputStream(partFiles[x]));
		}
		
		//��������ϲ���һ����������
		Enumeration<FileInputStream> en = Collections.enumeration(a1);
		SequenceInputStream sis = new SequenceInputStream(en);

		FileOutputStream fos = new FileOutputStream(new File(dir, "2.jpg"));

		byte[] buf = new byte[1024];

		int len = 0;
		while ((len = sis.read(buf)) != -1) {
			fos.write(buf, 0, len);
		}

		fos.close();
		sis.close();

	}

	public static void mergeFile(File dir) throws IOException{
		
		ArrayList<FileInputStream> a1 = new ArrayList<FileInputStream>();
		
		for(int x=1; x<=2;x++){
			a1.add(new FileInputStream(new File(dir,x+".part")));
		}
        Enumeration<FileInputStream> en = Collections.enumeration(a1);		
		SequenceInputStream sis = new SequenceInputStream(en);
		
		FileOutputStream fos = new FileOutputStream(new File(dir,"2.jpg")); 
		
		
		byte[] buf = new byte[1024];
		
		int len = 0 ;
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		
		fos.close();
		sis.close();
		
	}

}
