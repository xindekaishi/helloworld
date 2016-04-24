package com.example.phone;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity {
	private EditText nuText;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		// �ҵ���ť����
		Button callButton = (Button) findViewById(R.id.button1);
		nuText = (EditText) findViewById(R.id.editText1);
		// ��ȡ���еĺ���

		// ��Ӽ�����
		callButton.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				// �ҵ��ı������

				String num = nuText.getText().toString();

				// ���д˺���
				Intent intent = new Intent(); // ������ͼ����
				intent.setAction(Intent.ACTION_CALL);// ������ͼ�Ķ���Ϊ��绰
				intent.setData(Uri.parse("tel:" + num));// ������ͼ�����ݣ��绰���룩
				startActivity(intent); // ʹ����ͼ����һ�����棨����绰�Ľ��棩

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
