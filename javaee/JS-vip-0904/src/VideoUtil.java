import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

import javax.lang.model.element.Element;
import javax.lang.model.util.Elements;


public class VideoUtil {
	
	/**
	 * ͨ���ſ����Ƶ����Ҳ��URL��ַ��ҳ��ı��뼯����ȡԴ����
	 * @author er
	 * @param url �������������ӵ�ַ
	 * @param encoding ���뼯
	 * @return string ��ҳ��Դ����
	 * 
	 * */
	public static String getHtmlResourceByURL(String url,String encoding){
		
		String message = null;
		URL urlObj = null;
		URLConnection uc = null;
		
		//�洢Դ����� ����
		StringBuffer strs = new  StringBuffer();
		
		try{
		//������������
		 urlObj = new URL(url);
		//����������
		 uc = urlObj.openConnection();
		//�����ļ���д����
		InputStreamReader isr = new InputStreamReader(uc.getInputStream(),encoding);
		//�ļ��Ļ���д����
		BufferedReader buffer = new BufferedReader(isr);
		
		String temp = null;
		while((temp = buffer.readLine())!=null){
			strs.append(temp);
			
		}
	}catch(MalformedURLException e){
	     e.printStackTrace();
	     message = "������������ʧ�ܣ���������ңԶ�ľ������û��������������";
	
	}catch(IOException e){
		
		 e.printStackTrace();
		 message = "������������쳣����ʧ�ܣ�";
	}
		return null;
	}
	
	/**
	 * �����ſ���ҳ��Դ���룬��ȡ��Ƶ��Ϣ
	 * @author jojo
	 * @param html Դ����
	 * @return HashMap<String,String>����
	 * 
	 * */
	public static HashMap<String,String>getVideo(String html){
		HashMap
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ͨ���ſ����Ƶ��վ����Ƶ����ҳ��URL��ַ��ҳ��ı��뼯����ȡԴ��
		String url = "";
		String encoding = "utf-8";
		String html = getHtmlResourceByURL(url,encoding);
		
		//���ݻ�ȡ����Դ�����������Ҫ����Ϣ
		Document document = Jsoup.parse(html);
        //�����ſ���Ƶ��Դ����
		Element element = document.getElementById("panel_share");
		//��ȡ��ҳԴ�����еľ����Ԫ��class='item';
		Elements elements = element.getElementsByClass("item");
		
		int i= 1;
		for(Element ele : elements){
			Element e =ele.getElementById("link"+i);
			i++;
			if(e!= null){
				
				System.out.println(e.)
			}
			
		}
	}

}
