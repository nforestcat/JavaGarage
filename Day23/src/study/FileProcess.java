package study;

public class FileProcess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String file = "hello.java";
		
		
		String[] arr= file.split("\\.");
		
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		Processor processor = new Processor();
		String file2 = "member.txt";
		processor.getName(file2);
		processor.splitAndPrint();
		String file3 = "test.cpp";
		processor.getName(file3);
		processor.splitAndPrint2();
		processor.replace();
		
		
		
	}

}
class Processor{
	private String name = "";
	String[] arr;
	void getName(String file) {
		this.name=file;
	}
	void splitAndPrint() {
		arr=name.split("\\.");
		//split에서는 \\.
		for(int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	void splitAndPrint2() {
		//int index = this.name.indexOf(".");
		//System.out.println(this.name);
		//System.out.println(this.name.indexOf("."));
		System.out.println(name.substring(0,this.name.indexOf(".")));
		System.out.println(name.substring(this.name.indexOf(".")+1));
		
	}
	void print() {
		for(int i = 0; i < this.arr.length; i++) {
			System.out.println(this.arr[i]);
		}
	}
	void replace() {
		System.out.println(arr[arr.length-1]);
		arr[arr.length-1]="java";
	}
	
}