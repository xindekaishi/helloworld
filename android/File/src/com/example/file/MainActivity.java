package com.example.file;

import android.os.Bundle;
import android.os.Environment;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private EditText nameET;
	private EditText contentET;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		nameET = (EditText) findViewById(R.id.nameET);
		contentET = (EditText) findViewById(R.id.contentET);
	}
	protected void onResume(){
		super.onResume();
		//����sd��״̬�����ð�ť�Ƿ����
		findViewById(R.id.sdBT).setEnabled(Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED));
	}

	public void onClick(View view) {
		try {

			String name = nameET.getText().toString();
			String content = contentET.getText().toString();
			FileService service = new FileService();
			switch (view.getId()) {
			case R.id.sdBT:
				System.out.println("sd��");
				if (!Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED)) {
					Toast.makeText(getApplicationContext(), "SD��״̬�쳣�����ܱ��棡", Toast.LENGTH_SHORT)
					.show();
					return ;
				}
				service.saveToSDCard(name, content);
				break;
			case R.id.romBT:
				System.out.println("rom");
				service.saveToRom(name, content);
				break;

			}
			Toast.makeText(getApplicationContext(), "����ɹ�", Toast.LENGTH_SHORT)
					.show();
		} catch (Exception e) {
			// TODO: handle exception
			Toast.makeText(getApplicationContext(), "����ʧ��", Toast.LENGTH_SHORT)
			.show();
		}

	}
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
