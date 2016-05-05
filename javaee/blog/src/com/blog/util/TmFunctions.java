package com.blog.util;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;


/**
 * 
 * JSP�����Զ����ǩ
 * TmFunctions<BR>
 * ������:̶��ѧԺ-keke <BR>
 * ʱ�䣺2014��11��11��-����9:21:37 <BR>
 * @version 1.0.0
 *
 */
public class TmFunctions {
	/*
	 * ΪʲôҪѧϰ�Զ����ǩ����һ���򵥣�������ǿ
	 * 
	 * */
	
	/**
	 * ���ַ���ת���ɴ�д
	 * ��������toUpper<BR>
	 * �����ˣ�̶��ѧԺ-keke <BR>
	 * ʱ�䣺2014��11��11��-����9:28:15 <BR>
	 * @param content
	 * @return String<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static String toUpper(String content){
		if(StringUtils.isEmpty(content))return null;
		return content.toUpperCase();
	}
	
	
	/**
	 * ��ʽ�����ڵ��Զ��庯��
	 * ��������dateFormat<BR>
	 * �����ˣ�̶��ѧԺ-keke <BR>
	 * ʱ�䣺2014��11��11��-����9:57:18 <BR>
	 * @param dateString
	 * @param format
	 * @return String<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 * System.out.println(dateFormat("2014-12-14 12:12:12", "yyyy"));���
		System.out.println(dateFormat("2014-12-14 12:12:12", "MM"));�·�
		System.out.println(dateFormat("2014-12-14 12:12:12", "dd"));��
		System.out.println(dateFormat("2014-12-14 12:12:12", "HH:mm:ss"));24Сʱ��
		System.out.println(dateFormat("2014-12-14 12:12:12", "hh:mm:ss"));12Сʱ��
		System.out.println(dateFormat("2014-12-14 12:12:12", "yyyy-MM-dd"));������
		System.out.println(dateFormat("2014-12-14 12:12:12", "yyyy-MM-dd HH:mm"));������ ʱ��
		System.out.println(dateFormat("2014-12-14 12:12:12", "yyyy-MM-dd HH:mm:ss"));������ ʱ����
	 */
	public static String dateFormat(String dateString,String format){
		if(StringUtils.isEmpty(dateString))return "";
		try {
			Date date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(dateString);
			String ds =  new SimpleDateFormat(format).format(date);
			return ds;
		} catch (ParseException e) {
			return "";
		}
	}
	
	/**
	 * ���ж� 
	 * ��������isEmpty<BR>
	 * �����ˣ�̶��ѧԺ-keke <BR>
	 * ʱ�䣺2014��11��11��-����10:19:52 <BR>
	 * @param content
	 * @return boolean<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static boolean isEmpty(String content){
		return StringUtils.isEmpty(content);
	}
	
	/**
	 * ���ж�
	 * ��������isNotEmpty<BR>
	 * �����ˣ�̶��ѧԺ-keke <BR>
	 * ʱ�䣺2014��11��11��-����10:20:07 <BR>
	 * @param content
	 * @return boolean<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static boolean isNotEmpty(String content){
		return !isEmpty(content);
	}
	
	
	public static String getWeekChinesee(int week){
		String cweek = "";
		if(week==1)cweek = "һ";
		if(week==2)cweek = "��";
		if(week==3)cweek = "��";
		if(week==4)cweek = "��";
		if(week==5)cweek = "��";
		if(week==6)cweek = "��";
		if(week==7)cweek = "��";
		return cweek;
	}
	
	public static String getCharacter(int num){
		String cweek = "";
		if(num==1)cweek = "A";
		if(num==2)cweek = "B";
		if(num==3)cweek = "C";
		if(num==4)cweek = "D";
		if(num==5)cweek = "E";
		if(num==6)cweek = "F";
		if(num==7)cweek = "G";
		if(num==8)cweek = "H";
		if(num==9)cweek = "I";
		if(num==10)cweek = "J";
		if(num==11)cweek = "K";
		if(num==12)cweek = "M";
		if(num==13)cweek = "L";
		if(num==14)cweek = "N";
		if(num==15)cweek = "O";
		if(num==16)cweek = "P";
		if(num==17)cweek = "Q";
		if(num==18)cweek = "R";
		if(num==19)cweek = "S";
		if(num==20)cweek = "T";
		if(num==21)cweek = "U";
		if(num==22)cweek = "V";
		if(num==23)cweek = "W";
		if(num==24)cweek = "X";
		if(num==25)cweek = "Y";
		if(num==26)cweek = "Z";
		return cweek;
	}
	
	/**
	 * ���ھ���ļ�������ǰ
	 * ��������dateString<BR>
	 * �����ˣ�̶��ѧԺ-keke <BR>
	 * ʱ�䣺2014��11��11��-����10:34:33 <BR>
	 * @param startTime
	 * @return String<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static String dateToString(String startTime){
		return TmDateUtil.getTimeFormat(startTime);
	}
	
	/**
	 *  ���ھ���ļ�������ǰ
	 * ��������dateToString2<BR>
	 * �����ˣ�̶��ѧԺ-keke <BR>
	 * ʱ�䣺2014��11��11��-����10:38:06 <BR>
	 * @param startTime
	 * @return String<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static String dateToString2(Date startTime){
		return TmDateUtil.getTimeFormat(startTime);
	}
	
	/**
	 * ������ת���ɶ�Ӧ������
	 * ��������intToChnNumConverter<BR>
	 * �����ˣ�̶��ѧԺ-keke <BR>
	 * ʱ�䣺2014��11��11��-����10:33:30 <BR>
	 * @param num
	 * @return String<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static String intToChnNumConverter(int num){
	    String resultNumber = null;
	    if(num > 10000 || num < 0){
	        return "";
	    }
	    HashMap chnNumbers = new HashMap();
	    chnNumbers.put(0, "��");
	    chnNumbers.put(1, "һ");
	    chnNumbers.put(2, "��");
	    chnNumbers.put(3, "��");
	    chnNumbers.put(4, "��");
	    chnNumbers.put(5, "��");
	    chnNumbers.put(6, "��");
	    chnNumbers.put(7, "��");
	    chnNumbers.put(8, "��");
	    chnNumbers.put(9, "��");
	 
	    HashMap unitMap = new HashMap();
	    unitMap.put(1, "");
	    unitMap.put(10, "ʮ");
	    unitMap.put(100, "��");
	    unitMap.put(1000, "ǧ");
	    int[] unitArray = {1000, 100, 10, 1};
	 
	    StringBuilder result = new StringBuilder();
	    int i = 0;
	    while(num > 0){
	        int n1 = num / unitArray[i];
	        if(n1 > 0){
	            result.append(chnNumbers.get(n1)).append(unitMap.get(unitArray[i]));
	        }
	        if(n1 == 0){
	            if(result.lastIndexOf("��") != result.length()-1){
	                result.append("��");
	            }
	        }
	        num = num % unitArray[i++];
	        if(num == 0){
	            break;
	        }
	    }
	    resultNumber = result.toString();
	    if(resultNumber.startsWith("��")){
	        resultNumber = resultNumber.substring(1);
	    }
	    if(resultNumber.startsWith("һʮ")){
	        resultNumber = resultNumber.substring(1);
	    }
	    return resultNumber;
	}
	
	/**
	 * 
	 * ��������cutContent<BR>
	 * �����ˣ�̶��ѧԺ-keke <BR>
	 * ʱ�䣺2014��11��14��-����12:27:16 <BR>
	 * @param content
	 * @param begin
	 * @param end
	 * @return String<BR>
	 * @exception <BR>
	 * @since  1.0.0
	 */
	public static String cutContent(String content,int begin,int end){
		if(StringUtils.isEmpty(content))return "";
		String start = "";
		String result = "";
		if(content.length() > end){
			start = content.substring(begin,end);
			result = "<span style='display:none;'>"+content.substring(100,content.length())+"</span>";
			return start+result+"&nbsp;&nbsp;<a onclick='tm_show_expand(this)' href='javascript:void(0)'>չ��</a>";
		}else{
			return content;
		}
	}
	
	
	public static String countFileSize(long fileSize) {
		String fileSizeString = "";
		try {
			DecimalFormat df = new DecimalFormat("#.00");
			long fileS = fileSize;
			if (fileS == 0) {
				fileSizeString = "0KB";
			} else if (fileS < 1024) {
				fileSizeString = df.format((double) fileS) + "B";
			} else if (fileS < 1048576) {
				fileSizeString = df.format((double) fileS / 1024) + "KB";
			} else if (fileS < 1073741824) {
				fileSizeString = df
						.format(((double) fileS / 1024 / 1024) - 0.01)
						+ "MB";
			} else {
				fileSizeString = df.format((double) fileS / 1024 / 1024 / 1024)
						+ "G";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return fileSizeString;
	}
}
