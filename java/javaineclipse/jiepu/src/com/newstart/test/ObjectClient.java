package com.newstart.test;


import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;


public class ObjectClient {

	private static ObjectOutputStream out = null ;
	private static ObjectInputStream in = null ;
	private static Message msg = null ;
	private static Socket socketConnection = null ;
	private static boolean isUserOnLine = false ;
	
	private static  String userName = null ;
	private static  String password  = null ;
	
	public ObjectClient (String userName ,String password ){
		
		this.userName = userName ;
		this.password = password ;
		
	}
	
	
	
	/**
	 * �û���¼���������������������
	 */
	public static boolean connectServer (){

		
		try {
			
			socketConnection  = new Socket("192.168.1.104", 6688);
			
			out = new ObjectOutputStream(socketConnection.getOutputStream());
			in = new ObjectInputStream(socketConnection.getInputStream());
			
			msg = new LoginMsg();
			
			LoginMsg loginMsg = (LoginMsg) msg ;
			
			
			loginMsg.clientId  = "abc-def" ;
			loginMsg.ipAddress =  InetAddress.getLocalHost().getHostAddress() ;
			loginMsg.userName = userName ;
			loginMsg.password = password ;
			
			//���ͻ��˵Ķ����������������������ȥ
			out.writeObject(loginMsg);
			out.flush();
			
			Boolean loginResult = (Boolean)in.readObject();			
			System.out.println(loginResult);			
			closeResource();
			
			return loginResult ;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return false ; 
		
	}
	
	
	/**
	 * ����������ͶϿ���������
	 */
	public static boolean disconnectServer (String name,String psd ){
		
		
		try {
			
			socketConnection  = new Socket(InetAddress.getLocalHost(), 6688);
			
			out = new ObjectOutputStream(socketConnection .getOutputStream());
			in = new ObjectInputStream(socketConnection.getInputStream());
			
			msg = new LogOutMsg();
			
			LogOutMsg logoutMsg = (LogOutMsg) msg ;
			
			logoutMsg.clientId  = "abc-def" ;
			logoutMsg.ipAddress =  InetAddress.getLocalHost().getHostAddress() ;
			logoutMsg.userName = name ;
			
			//���ͻ��˵Ķ����������������������ȥ
			out.writeObject(logoutMsg);
			out.flush();
			
			Boolean logoutResult = (Boolean)in.readObject();
			
			System.out.println(logoutResult);
			
			closeResource();
			
			return logoutResult ;
			
		} catch (Exception e) {
			
			e.printStackTrace();
			
		}
		
		return false ; 
		
	}
	
	
	public static void closeResource() {
		
		try {
			
			if(out != null ){
				out.close(); 
			}
			if(in != null){
				in.close();
			}
			if(socketConnection != null ){
				socketConnection.close();
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
}
