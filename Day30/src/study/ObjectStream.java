package study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class ObjectStream {
	public static void main(String[] args) throws IOException, ClassNotFoundException{
		ArrayList<Student> al = new ArrayList<Student>();
		
		al.add(new Student("aaa", 56, 45, 34));
		al.add(new Student("bbb", 99, 87, 65));
		al.add(new Student("ccc", 32, 65, 89));
		
		String path = "src/study/MemData.dat";
		FileOutputStream fos = new FileOutputStream(path);
		//OutputStreamWriter osw = new OutputStreamWriter(fos, StandardCharsets.UTF_8);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		Student s = new Student();
		for( int i = 0; i < al.size(); i++) {
			s = al.get(i);
			s.eval_avg();
			oos.writeObject(s);
		}
		FileInputStream fis = new FileInputStream(path);
		//InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		while((s=(Student) ois.readObject())!= null) {
			System.out.println(s);
			if(fis.available()==0) {
				break;
			}
		}
		oos.close();
		ois.close();
		
	}
}
class Student implements Serializable{
	private String name;
	private int kor;
	private int eng;
	private int math;
	private int sum;
	private float avg;
	Student(){
		
	}
	Student(String name, int kor, int eng, int math){
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	void eval_sum() {
		sum = kor + eng + math;
	}
	void eval_avg() {
		eval_sum();
		avg = sum / 3.0f;
	}
	public String toString() {
		String str = "Student [ name = " + name + ", kor = "+ kor+ ", eng = " + eng + " , math = " + math+ " , sum = " + sum+ " , avg = " + avg+ "]";
		return str;
	}
}