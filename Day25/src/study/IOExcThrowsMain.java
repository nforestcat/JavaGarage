package study;

import java.io.IOException;

public class IOExcThrowsMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IOExcThrows io = new IOExcThrows();
		try {
			io.input();
			
		} catch(IOException e) {
			e.printStackTrace();
		}
		io.print();
	}

}
class IOExcThrows{
	char[] arr = new char[10];
	int i = 0;
	void input() throws IOException, ArithmeticException {
		while((arr[i++] = ((char) System.in.read())) != '\n');
			
	}
	void print() {
		int j = 0;
		while (j < i) {
			System.out.print(arr[j++]);
		}
	}
}