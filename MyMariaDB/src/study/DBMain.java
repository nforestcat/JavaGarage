package study;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class DBMain {
	Scanner sc = new Scanner(System.in);
	ServiceImplement si = new ServiceImplement();
	
	void process() {
		boolean bFlag = true;
		
		while (bFlag) {
			System.out.println("1.추가  2.전체검색  3.검색  4.종료  5.수정  6.삭제");
			int menu= sc.nextInt();
			switch(menu) {
			case 1:
				if (si.addMember(add())) {
					System.out.println("추가되었습니다.");
				} else {
					System.out.println("추가 실패");
				}
				break;
			case 2:
				printAll();
				break;
			case 3:
				search();
				break;
			case 4:
				bFlag = false;
				break;
			case 5:
				modify();
				break;
			case 6:
				del();
				break;
			default:
				break;
			}
		}
		System.out.println("프로그램 종료");
		si.close();
		sc.close();
	}
	void printAll() {
		System.out.println("전체 멤버 출력");
		ArrayList<Member> al = si.getMembers();
		if (al.size() == 0) {
			System.out.println("멤버가 없습니다.");
			return;
		}
		Iterator<Member> iter = al.iterator();
		System.out.println("-----------전체 멤버 출력-----------");
		while(iter.hasNext()) {
			Member m = iter.next();
			System.out.println(m);
		}
		System.out.println("------------------------------------");
	}
	void del() {
		//search();
		System.out.println("삭제하고자 하는 멤버의 이름을 적어주세요");
		sc.nextLine();
		String name = sc.nextLine();
		
		Member m = si.getMember(name);
		if ( m == null) {
			System.out.println("존재하지 않는 멤버입니다.");
			return;
		}
		if( si.delMember(name)) {
			System.out.println("삭제에 성공했습니다.");
		} else {
			System.out.println("삭제에 실패했습니다.");
		}
	}
	void search() {
		System.out.println("찾고자 하는 멤버의 이름을 적어주세요.");
		sc.nextLine();
		String name = sc.next();
		Member m = si.getMember(name);
		System.out.println("찾은 결과는 다음과 같습니다.");
		if(m==null) {
			System.out.println("검색된 멤버가 없습니다.");
		} else {
			System.out.println(m);
		}	
	}
	void modify() {
		System.out.println("수정하고자 하는 멤버의 이름을 적어주세요.");
		sc.nextLine();
		String name = sc.next();
		Member m = si.getMember(name);
		if(m==null) {
			System.out.println("멤버가 존재하지 않습니다.");
			return;
		}
		System.out.println("수정 할 전화번호를 입력해주세요");
		sc.nextLine();
		String tel = sc.nextLine();
		System.out.println("수정 할 주소를 입력해주세요");
		String address = sc.nextLine();
		m.setTel(tel);
		m.setAddress(address);
		boolean ret = si.editMember(m);
		if(ret) {
			System.out.println("수정되었습니다");
		} else {
			System.out.println("수정 실패");
		}
	}
	Member add() {
		System.out.println("DB에 추가할 멤버의 정보를 입력해주세요");
		System.out.print("이름: ");
		String name = sc.next();
		System.out.print("전화번호: ");
		String tel = sc.next();
		System.out.print("주소: ");
		sc.nextLine();
		String address = sc.nextLine();
		
		return new Member(0, name, tel, address);
	}
}
interface Service{
	boolean addMember(Member m);
	ArrayList<Member> getMembers();
	Member getMember(String name);
	boolean editMember(Member m);
	boolean delMember(String name);
	void close();
}
class ServiceImplement implements Service{
	MySqlDao msd = new MySqlDao();
	public boolean addMember(Member m) {
		return msd.insert(m);
	}
	public ArrayList<Member> getMembers(){
		return msd.selectAll();
	}
	public Member getMember(String name) {
		return msd.select(name);
	}
	public boolean editMember(Member m) {
		return msd.update(m);
	}
	public boolean delMember(String name) {
		return msd.delete(name);
	}
	public void close() {
		msd.close();
	}
}
interface Dao{
	boolean insert(Member m);
	ArrayList<Member> selectAll();
	Member select(String name);
	boolean update(Member m);
	boolean delete(String name);
	void close();
}
class MySqlDao implements Dao{
	private Connection conn;
	private PreparedStatement pstmt;
	String sql;
	ResultSet rs;
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		} catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public MySqlDao() {
		// TODO Auto-generated constructor stub
		DBConnect dbconn = DBConnect.getInstance();
		conn = dbconn.getConnection();
	}
	public boolean insert(Member m) {
		int num = 0;
		boolean ret = true;
		sql = "insert into addr values(?, ?, ?);";
		
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getName());
			pstmt.setString(2, m.getTel());
			pstmt.setString(3, m.getAddress());
			
			num = pstmt.executeUpdate();
			System.out.println(ret + " / "+ num);
			pstmt.close();
			
		} catch( Exception e) {
			System.out.println("이름은 중복되지 않습니다. 다시 입력해주세요.");
		} /*catch(SQLException e) {
			System.out.println("insert실패.");
			e.printStackTrace();
		}*/
		if(num <= 0) {
			ret = false;
		}
		return ret;
	}
	public ArrayList<Member> selectAll(){
		Member m = null;
		ArrayList<Member> al = new ArrayList<>();
		
		sql = "select * from addr;";
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				m = new Member(rs.getInt("num"), rs.getString("name"), rs.getString(2), rs.getString("address"));
				al.add(m);
			}
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return al;
	}
	public Member select(String name) {
		Member m = null;
		sql = "select * from addr where name = ?;";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				String name2 = rs.getString("name");
				String tel = rs.getString("tel");
				String address = rs.getString(3);
				m = new Member(rs.getInt("num"), name2, tel, address);
			}
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		return m;
	}
	public boolean update(Member m) {
		boolean ret = true;
		int num = 0;
		//여기 수정 필요
		//sql = "update addr set tel = ? , address = ? where name = ?;";
		sql= "update addr set tel= ? , address = ? where num = ?;";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, m.getTel());
			pstmt.setString(2, m.getAddress());
			pstmt.setInt(3, m.getNum());
			num = pstmt.executeUpdate();
			pstmt.close();
		} catch (SQLException e) {
			System.out.println("update 실패");
			e.printStackTrace();
		}
		if(num <= 0) {
			ret = false;
		}
		return ret;
	}
	public boolean delete(String name) {
		boolean ret = true;
		int num = 0;
		sql = "delete from addr where name = ?;";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			num = pstmt.executeUpdate();
			pstmt.close();
		} catch(SQLException e) {
			e.printStackTrace();
		}
		if(num <= 0) {
			ret = false;
		}
		return ret;
	}
}
