package example;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class StudentMain {

		public static void main(String[] args) throws Exception, ClassNotFoundException {
			ArrayList<Student> al = new ArrayList<>();
			String path = "src/example/StudentData.txt";
			File file = new File(path);
			FileOutputStream fos = null;
			ObjectOutputStream oos = null;
			FileInputStream fis = null;
			ObjectInputStream ois = null;
			String path2 = "src/example/StudentData2.txt";
			File file2 = new File(path2);
			FileReader fr = null;
			FileWriter fw = null;
			InputStreamReader isr = null;
			OutputStreamWriter osw = null;
			BufferedReader br = null;
			BufferedWriter bw = null;
			
			StudentMenu sm=new StudentMenu();
			Student s = new Student();
			
//			try {
//				fis = new FileInputStream(file);
//				ois = new ObjectInputStream(fis);
//				while((s=(Student) ois.readObject())!= null) {
//					al.add(s);
//					if(fis.available()==0) {
//						break;
//					}
//				}
//			} catch(Exception e){
//				
//			}
			try {
				fr = new FileReader(file2);
				br = new BufferedReader(fr);
				String str;
				while((str = br.readLine())!= null) {
					String[] str2 = str.split(",");
					Student student = new Student(Integer.parseInt(str2[0]), str2[1], Integer.parseInt(str2[2]), Integer.parseInt(str2[3]), Integer.parseInt(str2[4]));
					al.add(student);
					
				}
				
			} catch(Exception e) {
				
			}
			sm.menuProcess(al);
//			try {
//				fos = new FileOutputStream(path);
//				oos = new ObjectOutputStream(fos);
//				for( int i = 0; i < al.size(); i++) {
//					s = al.get(i);
//					oos.writeObject(s);
//				}
//			}catch(Exception ex) {
//				
//			}
			try {
				fw = new FileWriter(file2);
				bw = new BufferedWriter(fw);
				for( int i = 0; i < al.size(); i++) {
					s = al.get(i);
					bw.write(s.getNo()+","+s.getName()+","+s.getKor()+","+s.getEng()+","+s.getMath());
					bw.write("\n");
				}
				
			} catch (Exception exc) {
			}
			try {
				ois.close();
				fis.close();
			} catch(Exception x){
				
			}
			try {
				bw.close();
				fw.close();
			} catch(Exception e) {
				
			}
//			try {
//				oos.close();
//				fos.close();
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
		}
}
class Student implements Serializable{
	private String name;
	private int no;
	private int kor;
	private int eng;
	private int math;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public Student() {
		
	}
	public Student(int no, String name, int kor, int eng, int math) {
		this.name=name;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public String toString() {
		return "학번: "+no+" 이름: "+name+" 국어점수: "+kor+" 영어점수: "+eng+" 수학점수: "+math;
	}
	
}

class StudentMenu{
	Scanner sc = new Scanner(System.in);
	
	void menuProcess(ArrayList<Student> data) {
		boolean isLoop = true;
		System.out.println("======================================");
		System.out.println("==========학생 관리 프로그램==========");
		System.out.println("======================================");
		
		int menu = 0;
		int idx = -1;
		System.out.println();
		while(isLoop) {
			System.out.println("메뉴(1. 학생추가 2.학생검색 3.학생성적수정 4. 학생삭제 5.전체학생조회  6.학생 전체 초기화 7. 종료 8.과목당 평균 9.학생의 평균 10.석차)를 입력하세요.");
			menu = sc.nextInt();
			switch(menu) {
				case 1:
					data.add(infoInput(data));
					break;
				case 2:
					search(data);
					break;
				case 3:
					editStudent(data);
					break;
				case 4:
					delStudent(data);
					break;
				case 5:
					printAll(data);
					break;
				case 6:
					System.out.println("정말로 초기화하시겠습니까? (y/n)");
					String del = sc.next();
					if(del.equals("y")) {
						data.clear();
						System.out.println("데이터가 초기화되었습니다.");
					} else {
						System.out.println("취소되었습니다.");
					}
					break;
				case 7:
					isLoop = false;
					break;
				case 8:
					avgSubject(data);
					break;
				case 9:
					avgStudent(data);
					break;
				case 10:
					rankOrder(data);
					break;
				default:
					System.out.println("잘못입력하셨습니다");
					break;
			}
			System.out.println("-----------------------------");
		}
		System.out.println("프로그램 종료");
		sc.close();

	}
	Student infoInput(ArrayList<Student> data) {
		System.out.print("학번 : ");
		int no = sc.nextInt();
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		return new Student(no, name, kor, eng, math);
	}
	int[] search(ArrayList<Student> data) {
		int idx = -1;
		int[] temp = new int[50];	//최대 동명이인의 수
		int[] dup = null;
		System.out.println("이름 또는 학번으로 검색하실 수 있습니다.");
		String search = sc.next();
		Student s = new Student();
		int j = 0;
		try {
		for (int i = 0; i < data.size(); i++) {
			s = data.get(i);
			if(s.getNo()== Integer.parseInt(search)) {
				idx = i;
				temp[j] = idx;
				j++;
				}
			}
			
		} catch(Exception e) {
			
		}
		for (int i = 0; i < data.size(); i++) {
			s = data.get(i);
			if(s.getName().equals(search)) {
				idx = i;
				temp[j] = idx;
				j++;
			}
		}
		if (idx == -1) {
			System.out.println("학생을 찾을 수 없습니다.");
			dup = new int[1];
			dup[0] = idx;
		} else {
			dup = Arrays.copyOf(temp, j);
		}
		if(j == 1) {
			s = data.get(dup[0]);
			printStudent(s);
		}else if(j > 1){
			for(int i = 0; i < dup.length; i++) {

					System.out.println("해당 학생은 "+ dup[i]+"번에 있습니다.");
					s = data.get(dup[i]);
					printStudent(s);

			}	
		}		
		return dup;
	}
	void printStudent(Student s) {
		System.out.println(s.toString());
	}
	void printAll(ArrayList<Student> data) {
		for(int i = 0; i < data.size(); i++) {
			Student s = data.get(i);
			printStudent(s);
		}

	}
	void editStudent (ArrayList<Student> data ) {
		int[] idx = search(data);
		
		if(idx[0] == -1) {
		} else if(idx.length == 1 && idx[0] != -1){
			Student s1 = data.get(idx[0]);
			System.out.println("기존 정보");
			printStudent(s1);
			System.out.print("새 국어점수");
			int kor = sc.nextInt();
			System.out.print("새 영어점수");
			int eng = sc.nextInt();
			System.out.print("새 수학점수");
			int math = sc.nextInt();
			s1=new Student(s1.getNo(), s1.getName(), kor, eng, math);
			data.set(idx[0], s1);
			printStudent(s1);
		} else {
			System.out.println("학생을 선택해주세요(인덱스 번호)");
			for(int i = 0; i < idx.length; i++) {
				Student s2 = data.get(idx[i]);
				System.out.println("아래는"+idx[i]+"번 학생입니다.");
				printStudent(s2);
			}
			int select = sc.nextInt();
			Student s = data.get(select);
		System.out.println("기존 정보");
			printStudent(s);

			System.out.print("새 국어점수");
			int kor = sc.nextInt();
			System.out.print("새 영어점수");
			int eng = sc.nextInt();
			System.out.print("새 수학점수");
			int math = sc.nextInt();
			s=new Student(s.getNo(), s.getName(), kor, eng, math);
			data.set(idx[select], s);
			printStudent(s);	
			//통합 가능할 듯 변경 예정
		}
	}
	void delStudent (ArrayList<Student> data ) {
		int[] idx = search(data);
		
		if(idx[0] == -1) {
		} else if(idx.length == 1 && idx[0] != -1){
			//Student s1 = data.get(idx[0]);
			data.remove(idx[0]);
			System.out.println("삭제했습니다.");
		} else {
			System.out.println("학생을 선택해주세요(인덱스 번호)");
			for(int i = 0; i < idx.length; i++) {
				Student s2 = data.get(idx[i]);
				System.out.println(idx[i]);
				printStudent(s2);
			}
			int select = sc.nextInt();
			//Student s = data.get(select);
			data.remove(select);
			System.out.println("삭제했습니다.");
		}
	}
	void avgSubject(ArrayList<Student> data ){
		
		int[] temp = new int[data.size()];
		int sum = 0;
		float length = data.size();
		float avg;
		System.out.println("과목을 선택해주세요(번호).");
		System.out.println("1.국어 2.영어 3.수학");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			for(int i = 0; i < data.size(); i ++) {
				Student s = data.get(i);
				temp[i]= s.getKor(); 
				sum += temp[i];
			}
			
			avg = sum / length;
			System.out.println("전체 학생 국어 평균 점수는 "+avg+"점 입니다.");
			break;
		case 2:
			for(int i = 0; i < data.size(); i ++) {
				Student s = data.get(i);
				temp[i]= s.getEng(); 
				sum += temp[i];
			}
			avg = sum / length;
			System.out.println("전체 학생 영어 평균 점수는 "+avg+"점 입니다.");
			break;
		case 3:
			for(int i = 0; i < data.size(); i ++) {
				Student s = data.get(i);
				temp[i]= s.getMath(); 
				sum += temp[i];
			}
			avg = sum / length;
			System.out.println("전체 학생 수학 평균 점수는 "+avg+"점 입니다.");
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		
	}
	
	void avgStudent(ArrayList<Student> data ){
		int[] idx = search(data);
		if(idx[0] == -1) {
			//System.out.println("찾을 수 없습니다");
		} else if(idx.length == 1 && idx[0] != -1){
			Student s1 = data.get(idx[0]);
			int sum = s1.getKor()+s1.getEng()+s1.getMath();
			float avg = sum / 3.0f;
			System.out.println("이 학생의 평균 점수는 "+avg+"입니다.");
		} else {
			System.out.println("학생을 선택해주세요(인덱스 번호)");
			for(int i = 0; i < idx.length; i++) {
				Student s2 = data.get(idx[i]);
				System.out.println(idx[i]);
				printStudent(s2);
			}
			int select = sc.nextInt();
			Student s = data.get(select);
			int sum = s.getKor()+s.getEng()+s.getMath();
			float avg = sum / 3.0f;
			System.out.println("이 학생의 평균 점수는 "+avg+"입니다.");
		}
	}
	void rankOrder(ArrayList<Student> data) {
		System.out.println("석차 정보를 구할 과목을 정해주세요(1. 국어  2. 영어  3. 수학)");
		int select = sc.nextInt();
		switch(select) {
		case 1:
			Collections.sort(data, new StudentKorComparator().reversed());
			break;
		case 2:
			Collections.sort(data, new StudentEngComparator().reversed());
			break;
		case 3:
			break;
		default:
			Collections.sort(data, new StudentMathComparator().reversed());
			System.out.println("잘못 입력하셨습니다.");
			break;
		}
		for(int i = 0; i < data.size(); i++) {
			Student student = data.get(i);
			System.out.println(student);
		}
	}
}
class StudentKorComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		if(s1.getKor() > s2.getKor()) {
			return 1;
		} else if(s1.getKor()<s2.getKor()){
			return -1;
		}
		return 0;
	}
}
class StudentEngComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		if(s1.getEng() > s2.getEng()) {
			return 1;
		} else if(s1.getEng()<s2.getEng()){
			return -1;
		}
		return 0;
	}
}
class StudentMathComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		if(s1.getMath() > s2.getMath()) {
			return 1;
		} else if(s1.getMath()<s2.getMath()){
			return -1;
		}
		return 0;
	}
}
class StudentOrder extends Student{
	private int order;

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}
	public StudentOrder() {
		// TODO Auto-generated constructor stub
	}
	public StudentOrder(int no, String name, int kor, int eng, int math, int order) {
		this.setNo(no);
		this.setName(name);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
		this.order = order;
	}
	@Override
	public String toString() {
		return order+"등 "+"학번: "+getNo()+" 이름: "+getName()+" 국어점수: "+getKor()+" 영어점수: "+getEng()+" 수학점수: "+getMath();
	}
}