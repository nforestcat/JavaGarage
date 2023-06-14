package study2;

import java.sql.*;
import java.util.ArrayList;


class DaoImpl {
	private Connection conn;
	String sql;
	DaoImpl() {
		DBConnect dbconn = DBConnect.getInstance();
		conn =dbconn.getConnection();
	}
	public boolean insert(Product p) {
		sql = "insert into product (name, price) values (?,?);";
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			num = pstmt.executeUpdate();
			pstmt.close();
		} catch( SQLException e) {
			e.printStackTrace();
		}
		if(num <= 0) {
			return false;
		}
		return true;
	}
	public boolean update(Product p) {
		sql = "update product set name =?, price=? where num=?;";
		PreparedStatement pstmt = null;
		int num = 0;
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, p.getName());
			pstmt.setInt(2, p.getPrice());
			pstmt.setInt(3, p.getNum());
			
			num = pstmt.executeUpdate();
			
			pstmt.close();
		} catch( SQLException e) {
			e.printStackTrace();
		}
		if(num <= 0) {
			return false;
		}
		return true;
	}
	public boolean delete(int num) {
		int result = 0;
		sql = "delete from product where num = ?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			result = pstmt.executeUpdate();
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		if(result <= 0) {
			return false;
		}
		return true;
	}
	public Product select(int num) {
		ResultSet rs = null;
		Product p = null;
		sql = "select * from product where num = ?;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int numData = rs.getInt("num");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				
				p = new Product(numData, name, price);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return p;
	}
	public ArrayList<Product> selectAll(){
		ArrayList<Product> al = new ArrayList<>();
		ResultSet rs;
		sql = "select * from product;";
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				int numData = rs.getInt("num");
				String name = rs.getString("name");
				int price = rs.getInt("price");
				
				Product p = new Product(numData, name, price);
				al.add(p);
			}
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	public void close() {
		try {
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
