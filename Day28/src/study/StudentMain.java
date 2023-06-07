package study;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class StudentMain {

		public static void main(String[] args) {
			ArrayList<Student> al = new ArrayList<Student>();
			StudentMenu sm=new StudentMenu();
			sm.menuProcess(al);
		}
}
class Student{
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
	public Student(String name, int no, int kor, int eng, int math) {
		this.name=name;
		this.no=no;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	public String toString() {
		return "이름: "+name+" 학번: "+no+" 국어점수: "+kor+" 영어점수: "+eng+" 수학점수: "+math;
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
			System.out.println("메뉴(1. 학생추가 2.학생검색 3.학생성적수정 4. 학생삭제 5.전체학생조회  6.학생 전체 초기화 7. 종료 8.과목당 평균 9.학생의 평균)를 입력하세요.");
			menu = sc.nextInt();
			switch(menu) {
				case 1:
					data.add(infoInput());
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
					data.removeAll(data);
					System.out.println("데이터가 초기화되었습니다.");
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
				default:
					System.out.println("잘못입력하셨습니다");
					break;
			}
			System.out.println("-----------------------------");
		}
		System.out.println("프로그램 종료");
		sc.close();

	}
	Student infoInput() {
		System.out.print("이름 : ");
		String name = sc.next();
		System.out.print("학번 : ");
		int no = sc.nextInt();
		System.out.print("국어 점수 : ");
		int kor = sc.nextInt();
		System.out.print("영어 점수 : ");
		int eng = sc.nextInt();
		System.out.print("수학 점수 : ");
		int math = sc.nextInt();
		return new Student(name, no, kor, eng, math);
	}
	int[] search(ArrayList<Student> data) {
		int idx = -1;
		int[] temp = new int[50];
		int[] dup = null;
		System.out.println("검색할 이름을 입력해주세요");
		String name = sc.next();
		int size = data.size();
		Student student = new Student();
		int j = 0;
		for (int i = 0; i < size; i++) {
			student = data.get(i);
			if(student.getName().equals(name)) {
				idx = i;
				temp[j] = idx;
				j++;
			}
		}
		if(j!=0) {
			dup = new int[j];
			for(int i = 0; i < j; i++) {
				dup[i]= temp[i]; 
			}
			
		}
		if(j == 1) {
			Student s = data.get(dup[0]);
			printStudent(s);
		}else {
			
			for(int i = 0; i < dup.length; i++) {
				if(i == dup[i] ) {
					System.out.println("해당 학생은 "+ dup[i]+"번에 있습니다.");
					Student s = data.get(i);
					printStudent(s);
				}
			}	
		}
		if (idx == -1) {
			System.out.println("학생을 찾을 수 없습니다.");
			dup = new int[1];
			dup[0] = idx;
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
			//System.out.println("찾을 수 없습니다");
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
			s1=new Student(s1.getName(), s1.getNo(), kor, eng, math);
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
			s=new Student(s.getName(), s.getNo(), kor, eng, math);
			data.set(idx[select], s);
			printStudent(s);
		}
	}
	void delStudent (ArrayList<Student> data ) {
		int[] idx = search(data);
		
		if(idx[0] == -1) {
			//System.out.println("찾을 수 없습니다");
		} else if(idx.length == 1 && idx[0] != -1){
			Student s1 = data.get(idx[0]);
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
			Student s = data.get(select);
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
}