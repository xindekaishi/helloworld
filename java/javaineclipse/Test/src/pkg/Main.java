package pkg;
import java.sql.*;

public class Main {
	public static void main(String[] args)
	{
		String driverName="com.microsoft.sqlserver.jdbc.SQLServerDriver";
		String dbURL="jdbc:sqlserver://localhost:1433;DatabaseName=Test";
		String userName="sa";
		String userPwd="1";
		try{
			Class.forName(driverName);
			Connection dbConn=DriverManager.getConnection(dbURL,userName,userPwd);
			System.out.println("�������ݿ�ɹ�");
		
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println("����ʧ��");
		}
				
}
}