package com.example.file;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import android.os.Environment;

public class FileService {

	public void saveToSDCard(String name, String content) throws IOException {
		File file = new File(Environment.getExternalStorageDirectory(),name);//��ȡsd������Ŀ¼���������а汾��
		FileOutputStream fos = new FileOutputStream(file);  //�����������ָ��Sd������Ŀ¼
		fos.write(content.getBytes());   //д���ļ�����
		fos.close();
	}

	public void saveToRom(String name, String content) {
	}

	

}
