package study2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CreateDB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		//String jdbc_driver = "com.mysql.cj.jdbc.Driver";//"org.git.mm.mysql.Driver";
		String jdbc_driver = "org.mariadb.jdbc.Driver";
		//String jdbc_url = "jdbc:mysql://localhost:3306";//jdbc:subprotocal:subname
		String jdbc_url = "jdbc:mariadb://localhost:8888";//jdbc:subprotocal:subname
		Statement stmt = null;
		
		try {
			Class.forName(jdbc_driver);
			System.out.println("드라이버 로드 성공");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
			// TODO: handle exception
		}
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "iotiot");
		properties.setProperty("useSSL", "false");
		properties.setProperty("autoReconnect", "true");
		properties.setProperty("serverTimezone", "UTC");
		
		try {
			conn = DriverManager.getConnection(jdbc_url, properties); //DB에 커넥션을 수립하고, 커넥션 객체를 반환
			//conn = DriverManager.getConnection(jdbc_url, "root", "iotiot");
			System.out.println("커넥션 수립 성공");
		} catch(SQLException e) {
			System.out.println("Error. 커넥션 수립 실패");
			e.printStackTrace();
		}
		
	}

}
