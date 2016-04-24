package com.example.sharedpreferences;

import android.os.Bundle;
import android.app.Activity;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText nameET;
	private EditText phoneET;
	private EditText emailET;
	private SharedPreferences sp;
	

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        nameET = (EditText)findViewById(R.id.nameET );
        phoneET = (EditText)findViewById(R.id.phoneET);
        emailET = (EditText)findViewById(R.id.emailET);
        
        sp = getSharedPreferences("data", MODE_PRIVATE); //��ȡ����Ĭ��ָ��ǰӦ�ã��ļ���Ϊdata.xml,ģʽΪ˽��
        nameET.setText(sp.getString("name",""));  //��ȡ���ݣ�ָ��Ĭ��ֵ
        phoneET.setText(sp.getString("phone", ""));
        emailET.setText(sp.getString("email", ""));
    }
    
    public void onClick(View view){
    	String name = nameET.getText().toString();
    	String phone = phoneET.getText().toString();
    	String email = emailET.getText().toString();
    	
    	
    	Editor editor  = sp.edit();//��ȡ�༭��
    	editor.putString( "name", name); //�洢���ݣ���û�����ļ���
    	editor.putString( "phone", phone);
    	editor.putString("email", email );
    	editor.commit();    //�ύ�޸ģ���������
    	
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
