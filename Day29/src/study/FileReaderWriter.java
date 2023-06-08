package study;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class FileReaderWriter {
	public static void main(String[] args) throws FileNotFoundException, IOException{
		
			FileInputStream fis= new FileInputStream("src/study/test2.txt");
			System.out.println("바이트 단위로 읽었을 때");
			int buf;
			while((buf=fis.read())!= -1) {
				System.out.print((char)buf);
			}
			fis.close();
			FileReader fr = new FileReader("src/study/test3.txt", StandardCharsets.UTF_8);
			//FileReader fr = new FileReader("src/study/test2.txt");
			FileReader fr2 = new FileReader("src/study/test4.txt", StandardCharsets.UTF_8);
			FileWriter fw = new FileWriter("src/study/test6_copy.txt", StandardCharsets.UTF_8);
			
//			while((buf=fr.read())!= -1) {
//				System.out.print((char)buf);
//			}
//			File file = new File ("src/study/test3.txt");
			BufferedReader br = new BufferedReader(fr);
			BufferedReader br2 = new BufferedReader(fr2);
			BufferedWriter bw = new BufferedWriter(fw);

			String line = null;
//			while ((line = br.readLine()) != null) {
//			  System.out.println(line);
//			  bw.write(line);
//			  
//			}
//			while ((line = br2.readLine()) != null) {
//			  System.out.println(line);
//			  bw.write(line);
//			}
			while ((buf = br.read()) != -1) {
				System.out.print((char)buf);
				bw.write((char)buf);
				  
			}
			while ((buf = br2.read()) != -1) {
				System.out.print((char)buf);
				bw.write((char)buf);
			}

			br.close();
			br2.close();
			bw.close();

		
	}
}
