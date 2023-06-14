package study2;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBConnect {
	private static DBConnect db = new DBConnect();
	private Connection conn = null;
	String jdbc_driver = "org.mariadb.jdbc.Driver";
	String jdbc_url = "jdbc:mariadb://localhost:8888";
	private DBConnect() {
		try {
			Class.forName(jdbc_driver);
		} catch(ClassNotFoundException e){
			e.printStackTrace();
		}
		Properties properties = new Properties();
		properties.setProperty("user", "root");
		properties.setProperty("password", "iotiot");
		properties.setProperty("useSSL", "false");
		properties.setProperty("autoReconnect", "true");
		properties.setProperty("serverTimezone", "UTC");
		properties.setProperty("allowPublicKeyRetrieval", "true");
		
		try {
			conn = DriverManager.getConnection(jdbc_url, properties);
		} catch(SQLException e) {
			e.printStackTrace();
		}
		try {
			Statement stmt= conn.createStatement();
			stmt.executeUpdate("create database if not exists productdb;");
			stmt.executeUpdate("use productdb;");
			stmt.executeUpdate("create table if not exists product (num int primary key auto_increment, name varchar(10), price int);");
			if(stmt!=null)stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	static DBConnect getInstance() {
		return db;
	}
	Connection getConnection(){
		return conn;
	}
}
