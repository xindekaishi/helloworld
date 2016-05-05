package com.tz.video;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

/**
 * Java����������Ƶ�ϴ���� 
 * @author arry
 * @version v1.0
 * 
 */
public class VideoUtil {

	
	/**
	 * ͨ���ſ����Ƶ��վ����Ƶ����ҳ��url��ַ��ҳ��ı��뼯����ȡԴ����
	 * @author arry
	 * @param url ������Ƶ�����ӵ�ַ
	 * @param encoding ���뼯
	 * @return String ��ҳ��Դ����
	 * 
	 */
	public static String getHtmlResourceByURL(String url,String encoding){

		String message = null;
		URL urlObj = null;
		URLConnection uc = null;
		InputStreamReader isr = null;
		BufferedReader buffer = null;
		
		// �洢Դ���������
		StringBuffer strs = new StringBuffer();
		
		try {
			// ������������
			urlObj = new URL(url);
			// ����������
			uc = urlObj.openConnection();
			// �����ļ���д����
			isr = new InputStreamReader(uc.getInputStream(), encoding);
			// �ļ��Ļ���д����
			buffer = new BufferedReader(isr);
			
			String temp = null;
			while((temp = buffer.readLine()) != null){
				strs.append(temp+"\n");
			}
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
			message = "������������ʧ�ܣ���������ңԶ�������û���� ����������";
		} catch (IOException e) {
			e.printStackTrace();
			message = "������������쳣����ʧ�� ��";
		} finally{
			if(isr != null){
				try {
					isr.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
		message = strs.toString();
		
		return message;
	}
	
	/**
	 * �����ſ���ҳ��Դ���룬��ȡ��Ƶ��Ϣ
	 * @author arry
	 * @param html Դ����
	 * @return HashMap<String,String> ����
	 * 
	 */
	public static HashMap<String,String> getVideo(String html){
		
		HashMap<String,String> map = new HashMap<String,String>();
		
		// ���ݻ�ȡ����Դ���� ��������Ҫ����Ϣ
		Document document = Jsoup.parse(html);
		// �����ſ���Ƶ��Դ����
		Element element = document.getElementById("panel_share");
		// ��ȡ��ҳԴ������ �����Ԫ�� class="item"
		Elements elements = element.getElementsByClass("item");
		
		int i = 1;
		for(Element ele : elements){
			Element e = ele.getElementById("link"+i);
			i++;
			if(e != null){
				System.out.println("id = "+i+" -  "+e.val());
				map.put("link"+i, e.val());
			}
		}		
		return map;
	}
	
	
	// Java���
	public static void main(String[] args){
		
		System.out.println("���װ���ͬѧ�� �� ������Ϻã��Ұ����� ��");
		
		// ͨ���ſ����Ƶ��վ����Ƶ����ҳ��url��ַ��ҳ��ı��뼯����ȡԴ����
		
		String url = "http://v.youku.com/v_show/id_XOTEzMTk5NDEy.html?f=23458321&ev=3&from=y1.3-idx-grid-1519-9909.86808-86807.3-2";
		String encoding = "utf-8";
		String html = getHtmlResourceByURL(url, encoding);
		
		// ���ݻ�ȡ����Դ���� ��������Ҫ����Ϣ
		Document document = Jsoup.parse(html);
		// �����ſ���Ƶ��Դ����
		Element element = document.getElementById("panel_share");
		// ��ȡ��ҳԴ������ �����Ԫ�� class="item"
		Elements elements = element.getElementsByClass("item");
		
		int i = 1;
		for(Element ele : elements){
			Element e = ele.getElementById("link"+i);
			i++;
			if(e != null){
				System.out.println("id = "+i+" -  "+e.val());
			}
		}
		
	}
	
	
}
