package study;

import java.sql.*;
import java.util.*;

public class UseDBMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conn = null;
		Statement stmt = null;
		String jdbc_driver = "com.mysql.cj.jdbc.Driver";
		String jdbc_url="jdbc:mysql://localhost:3306/sample";
		try {
			Class.forName(jdbc_driver);
			System.out.println("드라이버 로드 성공");
		} catch(ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			System.out.println(e);
		} catch(Exception e) {
			System.out.println(e);
		}
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		
	}

}
