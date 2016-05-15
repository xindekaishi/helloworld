package com.newstart.test;

import javax.swing.*;

import java.awt.*; //�����Ҫ�İ�
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClientUI extends JFrame {

	// �û���¼״̬���
	private static int LOGIN_TAG = -1;

	JTextField userName; // �����ı������
	JPasswordField password; // ������������
	JLabel jLabel1, jLabel2, jLabel3;
	JPanel jp1, jp2, jp3, jp4;
	JButton jb1, jb2; // ������ť

	private ObjectClient client;

	public static void main(String[] args) {

		new ClientUI();

	}

	public ClientUI() {

		userName = new JTextField(12);
		password = new JPasswordField(13);
		jLabel1 = new JLabel("�û���");
		jLabel2 = new JLabel("����");
		jLabel3 = new JLabel("�û�״̬�� ");
		jb1 = new JButton("��¼");
		jb2 = new JButton("�˳�");
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		jp4 = new JPanel();

		// ��¼�¼�
		jb1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				// �ж��û����������Ƿ�Ϊ�գ����Ϊ�գ���ʾ�û������û����룬�����Ϊ�գ���ֱ�ӵ�¼

				String name = userName.getText().trim();
				String psd = password.getText().trim();

				if (name == null || "".equals(name) || psd == null
						|| "".equals(psd)) {
					jLabel3.setText("�û��������벻��Ϊ�գ�");
					return;
				} else {

					// �û����ŵ�¼

					client = new ObjectClient(name, psd);

					if (client.connectServer()) {

						LOGIN_TAG = 1;

						jLabel3.setText("��¼�ɹ�");
						jb1.setEnabled(false);

						System.out.println(name + "��¼�ɹ���");

					} else {

						jLabel3.setText("��¼ʧ��");

						System.out.println("��¼ʧ�ܣ�");

					}
				}
			}
		});

		// �˳��¼�
		jb2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				if (LOGIN_TAG == -1) {

					jLabel3.setText("����δ��¼��");

				} else {

					String name = userName.getText().trim();
					String psd = password.getText().trim();

					boolean logoutResult = client.disconnectServer(name, psd);

					if (logoutResult) {

						jLabel3.setText("�˳��ɹ���");
						LOGIN_TAG = -1;
						jb1.setEnabled(true);

					} else {

						jLabel3.setText("�˳�ʧ�ܣ�");

					}

				}

			}
		});

		// ���ò���
		this.setLayout(new GridLayout(4, 1));

		jp1.add(jLabel1);
		jp1.add(userName);// ��һ���������û������ı���

		jp2.add(jLabel2);
		jp2.add(password);// �ڶ�����������������������

		jp3.add(jb1);
		jp3.add(jb2); // ������������ȷ�Ϻ�ȡ��
		jp4.add(jLabel3);

		this.add(jp1);
		this.add(jp2);
		this.add(jp4);
		this.add(jp3); // �����������ӵ���½������
		// ������ʾ
		this.setSize(300, 200);
		// this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setTitle("��½");

	}

}