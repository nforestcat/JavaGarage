package person;

public class Person {
	private int num;
	private String name;
	private String dept;
	private String address;
	void setNum(int num) {
		this.num = num;
	}
	int getNum() {
		return num;
	}
	
	void setName(String name) {
		this.name = name;
	}
	String getName() {
		return name;
	}
	void setDept(String dept) {
		this.dept = dept;
	}
	String getDept() {
		return dept;
	}
	
	void setAddress(String address) {
		this.address = address;
	}
	String getAddress() {
		return address;
	}
}



class Student extends Person{
	private String[] subjects;
	void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	String[] getSubjects() {
		return subjects;
	}
	
	
}
class Professor extends Person{
	private String[] subjects;
	void setSubjects(String[] subjects) {
		this.subjects = subjects;
	}
	String[] getSubjects() {
		return subjects;
	}
}

class Staff extends Person{
	private String[] jobs;
	void setJobs(String[] jobs) {
		this.jobs = jobs;
	}
	String[] getJobs() {
		return jobs;
	}
}

