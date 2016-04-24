package com.example.sms;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
    
	private EditText numText;
	private EditText contentText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        numText = (EditText) findViewById(R.id.numET);
        contentText = (EditText) findViewById(R.id.contentET);
        
    }
    
   
	public void onClick(View view){
    	//��ȡ���������
    	String num = numText.getText().toString();
    	String content = contentText.getText().toString();
    	
    	//�����ݷ���ָ���ĺ�����
    	android.telephony.SmsManager smsManager = android.telephony.SmsManager.getDefault();//��ȡ���Ź�����
    	ArrayList<String> list = smsManager.divideMessage(content);//���������ݷֶμ���arraylist;    	
    	for(String sms:list)       //����ÿһ�ζ���
    	smsManager.sendTextMessage(num, null, sms, null, null); //����ÿһ����Ϣ
    	//���ͳɹ�֪ͨ
    	Toast.makeText(getApplicationContext(), "���ͳɹ�", Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
