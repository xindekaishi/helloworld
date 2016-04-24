package com.example.layout_hello;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //������λ�ڳ����һ�У���Ҫ����������Xml�Ĳ��֣�ϵͳ������View�Ķ���
        setContentView(R.layout.login);
        //ͨ��R�ļ��е�id������xml����
        button = (Button)this.findViewById(R.id.button1);
        button.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
	     Toast.makeText(MainActivity.this, "hello Android", 1).show();
			}
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
