package cn.itcast.gui.awt;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MouseAndKeyDemo {
	
	
	private Frame f;
	private TextField tf;
	private Button but;
	
     
	
	public MouseAndKeyDemo() {
	
		 init();
		
	}


	private void init() {
		
		f = new Frame("��ʾ���ͼ��̼���");
	    f.setBounds(400,200,500,400);
	    f.setLayout(new FlowLayout());
	    
	    tf  = new TextField(35);
	    but = new Button("һ����ť");
	    
	    f.add(tf);
	    f.add(but);
	    
	    myEvent();
	    
	    f.setVisible(true);
		
		
	}


	


	private void myEvent() {
		
		//���ı�����Ӽ��̼�����
		tf.addKeyListener(new KeyAdapter(){

		//	@Override
			public void keyPressed(KeyEvent e) {
				System.out.println("key run...."+e.getKeyChar()+"::::"+e.getKeyCode());
			}
			
		});
		
		
		f.addWindowListener(new WindowAdapter(){

		//	@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
			
		});
		
		//�ڰ�ť�����һ����������
		but.addMouseListener(new MouseAdapter(){
        
			private int count = 1;
		//	@Override
			public void mouseEntered(MouseEvent e) {
				
				tf.setText("mouse enter...."+count++);
			}
		//	@Override
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount()==2)
			    tf.setText("Mouse double click....."+count++);
			}
			
			
		});
		
	}


	public static void main(String[] args) {
		
		new MouseAndKeyDemo();

	}

}
