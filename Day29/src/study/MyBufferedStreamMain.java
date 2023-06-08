package study;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class MyBufferedStreamMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		File file = new File("src/study/test3.txt");
		File file3 = new File("src/study/test4.txt");
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream bis = new BufferedInputStream(fis);
		FileInputStream fis2 = new FileInputStream(file3);
		BufferedInputStream bis2 = new BufferedInputStream(fis2);
		File file2 = new File("src/study/test5_copy.txt");
		FileOutputStream fos = new FileOutputStream(file2);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
			
		int buf = 0;
//		while((buf =fis.read()) != -1) {
//			System.out.print((char)buf);
//			fos.write(buf);
//		}
			
		while((buf = bis.read()) != -1) {
			System.out.print((char)buf);
			bos.write(buf);
		}
		while((buf = bis2.read()) != -1) {
			System.out.print((char)buf);
			bos.write(buf);
		}
		fis.close();
		bos.close();
	}
}
