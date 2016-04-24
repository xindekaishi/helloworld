package com.example.xml; 
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.xmlpull.v1.XmlPullParser;

import android.util.Xml;

public class PersonService {
	
	public List<Person> loadPersons(InputStream in) throws Exception {
		XmlPullParser parser = Xml.newPullParser();//��ȡ������
		parser.setInput(in,"UTF-8");               //����������
		
		ArrayList<Person> persons = new ArrayList<Person>();
		Person p = null;
		
		//�����ֵΪ��һ���¼���ֻҪ�����ĵ�������ѭ����ÿ��ѭ���������һ���¼�
		for(int type = parser.getEventType();type !=XmlPullParser.END_DOCUMENT;type = parser.next()){ 
			if(type == XmlPullParser.START_TAG){	//��������˱�ǩ��ʼ�¼�
			if(parser.getName().equals("person")){   //�����ǩ��Ϊperson
				      p = new Person();                   //��������
				      String id = parser.getAttributeValue(0); //��ȡ��һ�����Ե�����ֵ
				      p.setId(Integer.parseInt(id));        //תΪint������id
				      persons.add(p);                        //װ�뼯��
				}else if (parser.getName().equals("name")){  //�����ǩ��Ϊname
					String name = parser.nextText();          //������һ���ı�
					 p.setNameString(name);                  //����name
				}else if (parser.getName().equals("age")) {   //�����ǩ��Ϊ��age"
					String age = parser.nextText();          //��ȡ��һ���ı�
					p.setAge(Integer.parseInt(age));          //����age
					
				}
			}
		}
		return persons;    
	}

}
