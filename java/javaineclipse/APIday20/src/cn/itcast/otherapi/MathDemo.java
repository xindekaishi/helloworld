package cn.itcast.otherapi;

import java.util.Random;

public class MathDemo {

	public static void main(String[] args) {

		 /*
		  * Math:�ṩ�˲�����ѧ����ķ������Ǿ�̬�ġ�
		  * 
		  * ���÷�����
		  * ciel()�����ػش��ڲ�������С������
		  * floor();����С�ڲ��������������
		  * round()���������������������
		  * pow(a,b):a��b�η���
		  * */
	//	double d1 = Math.ceil(12.56);
	//	double d2 = Math.floor(12.56);
	//	double d3 = Math.round(12.56);
	//	
	//	sop("d1="+d1);
	//	sop("d2="+d2);
	//	sop("d3="+d3);
	//	double d = Math.pow(2,10);
	//	sop("d="+d);
		Random r = new Random();
		for(int i =0;i<10;i++){
			
		//	double d = Math.floor(Math.random()*10);
			double d = (int)(r.nextDouble()*6 +1);
			System.out.println(d);
		}
		
}

	public static void sop(String string) {
		System.out.println(string);
	}
	}
