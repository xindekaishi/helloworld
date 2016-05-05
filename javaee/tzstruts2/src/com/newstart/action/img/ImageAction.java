package com.newstart.action.img;

import org.apache.struts2.ServletActionContext;

import com.newstart.utilImage.TmImageUtil;

/**
 * 
 * ����: ImageAction
 * ����: ����ͼƬ��ҵ���߼���
 * ������: zhoujuan
 * ʱ��: 2016��3��30�� ����2:31:00
 * @version: V1.0
 */
public class ImageAction {
   
	public static final String SUCCESS = "success";
	//����ˮӡ������
    private String text;
    //ˮӡ��ԭͼƬ
    private String sourceImg;
    //ˮӡ��Ŀ��ͼƬ
    private String targetImg;
    //ˮӡ���������ͣ�΢���źڡ�
    private String fontName;
    //ˮӡ��������ʽ��Font.BOLD
    private String fontStyle;
    //ˮӡ����Ĵ�С��
    private int fontSize;
    //ˮӡ���ֵ�x���ꡣ
    private int x;
    //ˮӡ���ֵ�y���ꡣ
    private int y;
    //ˮӡ���ֵ�λ�á�
    private int flag;
    
	/**
	 * 
	 * ������: pressImg
	 * ����: ͼƬˮӡ��
	 * ������: zhoujuan
	 * ʱ��: 2016��3��30�� ����4:47:14
	 * @return
	 * @return: String
	 * @since: V1.0
	 */
	public String pressImg(){
		sourceImg = "C:/Program Files/Apache Software Foundation/Tomcat 6.0/webapps/tzstruts2/images/m0.jpg";
		//ServletActionContext.getServletContext().getRealPath��ȡ����ĸ�Ŀ¼��
		targetImg = ServletActionContext.getServletContext().getRealPath("images/m0.jpg");
		TmImageUtil.pressText(text, sourceImg, targetImg, fontName,fontSize, x, y,flag);
		return SUCCESS;
	}

	public int getFlag() {
		return flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getSourceImg() {
		return sourceImg;
	}

	public void setSourceImg(String sourceImg) {
		this.sourceImg = sourceImg;
	}

	public String getTargetImg() {
		return targetImg;
	}

	public void setTargetImg(String targetImg) {
		this.targetImg = targetImg;
	}

	public String getFontName() {
		return fontName;
	}

	public void setFontName(String fontName) {
		this.fontName = fontName;
	}

	public String getFontStyle() {
		return fontStyle;
	}

	public void setFontStyle(String fontStyle) {
		this.fontStyle = fontStyle;
	}

	public int getFontSize() {
		return fontSize;
	}

	public void setFontSize(int fontSize) {
		this.fontSize = fontSize;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
}
