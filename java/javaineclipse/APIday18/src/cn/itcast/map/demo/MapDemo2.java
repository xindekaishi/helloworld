package cn.itcast.map.demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo2 {

	public static void main(String[] args) {
		
		Map<Integer,String>map = new HashMap<Integer,String>();
		method_2(map);

	}
    public static void method_2(Map<Integer, String> map) {
    	map.put(8, "wangwu");
    	map.put(2,"zhaoliu");
    	map.put(7,"xiaoqiang");
    	map.put(6, "wangcai");
    	
    	Collection<String> values = map.values();
    	
    	Iterator<String> it2 = values.iterator();
    	while(it2.hasNext()){
    		System.out.println(it2.next());
    	}
 /*    	
    	/*
    	 * ͨ��Mapת��set�Ϳ��Ե�����
    	 * �ҵ���һ��������entrySet��
    	 * �÷������� ��ֵ��ӳ���ϵ��Ϊ����洢����Set�����У������ӳ���ϵ�����;���Map.Entry���ͣ����֤��
    	 * 
    	 * 
    	 * 
    	Set<Map.Entry<Integer, String>>entrySet = map.entrySet();
    	
    	Iterator<Map.Entry<Integer, String>>it = entrySet.iterator();
    	
    	while(it.hasNext()){
    		Map.Entry<Integer, String>me = it.next();
    		Integer key = me.getKey();
    		String value = me.getValue();
    		System.out.println(key+":::::"+value);
    	}
    	
    	
*/    	
    	
    	
    	//ȡ��map�е�����Ԫ�ء�
    	//ԭ��ͨ��KeySet������ȡmap�����еļ����ڵ�Set���ϣ���ͨ��Set�ĵ�������ȡ��ÿһ������
    	//�ٶ�ÿһ����ͨ��map���ϵ�get������ȡ���Ӧ��ֵ���ɡ�
  /*  	
    	Set<Integer>keySet = map.keySet();
    	Iterator<Integer>it = keySet.iterator();
    	
    	while(it.hasNext()){
    		Integer key  = it.next();
    		String value = map.get(key);
    		System.out.println(key+":"+value);
    	}
	}
	public static void method(Map<Integer,String> map){
    	//���Ԫ�ء�
    	System.out.println(map.put(8,"wangcai"));
    	System.out.println(map.put(8,"xiaoqiang"));
    	map.put(2,"zhangfan");
    	map.put(7,"zhaoliu");
    	
    	
    	System.out.println("get:"+map.get(8));
    	
    	System.out.println(map);
    	*/
    }
}
