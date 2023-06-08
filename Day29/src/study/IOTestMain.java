package study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOTestMain {
	public static void main(String[] args) {
//		File file = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream("src/study/test.txt");
			
			fos = new FileOutputStream("src/study/test_copy.txt");
			
			int buf = 0;
			while((buf = fis.read())!= -1) {
				System.out.print((char)buf);
				fos.write(buf);
			}
			fis.close();
			fos.close();
		}catch(IOException e) {
			e.printStackTrace();
			
			
		} finally {
			
		}
		
		
	}
}
