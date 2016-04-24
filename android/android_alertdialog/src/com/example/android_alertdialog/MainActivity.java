package com.example.android_alertdialog;

import android.os.Bundle;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.DialogInterface;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Button button;
	private Button button2;
	private Button button3;
	private AlertDialog.Builder builder;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		button = (Button) this.findViewById(R.id.button1);
		button2 = (Button) this.findViewById(R.id.button2);
		button3 = (Button) this.findViewById(R.id.button3);
		builder = new AlertDialog.Builder(this);
		builder.setTitle("��ʾ��");
		builder.setMessage("��ȷ��Ҫɾ����");
		builder.setIcon(R.drawable.ic_launcher);
		builder.setPositiveButton("ȷ��", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, "ȷ��ɾ��", 1).show();
			}
		});
		builder.setNegativeButton("ȡ��", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, "ȷ��ȡ��", 1).show();
			}
		});
		builder.setNeutralButton("����", new DialogInterface.OnClickListener() {

			@Override
			public void onClick(DialogInterface dialog, int which) {
				Toast.makeText(MainActivity.this, "ȷ������", 1).show();
			}
		});
		button.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				builder.show();
			}
		});
		button2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				AlertDialog.Builder builder = new AlertDialog.Builder(
						MainActivity.this);

				builder.setTitle("��ѡ�񰮺�");
				final String[] hobby = { "����", "����", "����Ϸ" };
				builder.setMultiChoiceItems(hobby, new boolean[] { true, false,
						true },
						new DialogInterface.OnMultiChoiceClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which, boolean isChecked) {
								if (isChecked) {
									Toast.makeText(MainActivity.this,
											"-->>" + hobby[which], 1).show();
								}
							}
						});
				button3.setOnClickListener(new View.OnClickListener() {

					@Override
					public void onClick(View v) {
						AlertDialog.Builder builder = new AlertDialog.Builder(
								MainActivity.this);
						builder.setTitle("xx");
						builder.setSingleChoiceItems(new String[] { "����", "����",
								"����Ϸ" }, -1,
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
									}
								});
						builder.setPositiveButton("ȷ��",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
									}
								});
						builder.setNegativeButton("ȡ��",
								new DialogInterface.OnClickListener() {

									@Override
									public void onClick(DialogInterface dialog,
											int which) {
									}
								});
						builder.show();
					}
				});

				builder.setPositiveButton("ȷ��",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
							}
						});
				builder.setNegativeButton("ȡ��",
						new DialogInterface.OnClickListener() {

							@Override
							public void onClick(DialogInterface dialog,
									int which) {
							}
						});
				builder.show();
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
