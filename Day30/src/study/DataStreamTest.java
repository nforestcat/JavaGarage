package study;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
//import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {
	public static void main(String[] args) throws IOException{
		String path = "src/study/data.dat";
		
		FileOutputStream fos = new FileOutputStream(path);
		DataOutputStream dout = new DataOutputStream(fos);
		dout.writeInt(1);
		dout.writeByte(2);
		dout.writeShort(3);
		dout.writeBoolean(true);
		dout.writeChar('c');
		dout.writeFloat(3.23f);
		dout.writeDouble(234.567);
		
		FileInputStream fis = new FileInputStream(path);
		DataInputStream dis = new DataInputStream(fis);
		
		System.out.println(dis.readInt());
		System.out.println(dis.readByte());
		System.out.println(dis.readShort());
		System.out.println(dis.readBoolean());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		
		dis.close();
		dout.close();
		
	}
}
