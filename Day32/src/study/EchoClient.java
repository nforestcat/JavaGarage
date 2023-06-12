package study;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;
import java.io.IOException;

public class EchoClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		// TODO Auto-generated method stub
		//Socket socket = new Socket("211.253.46.92", 4444);
		Socket socket = new Socket("localhost", 4444);
		
		PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
		out.println("hello echo");
		out.flush();
		BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String str = in.readLine();
		System.out.println("클라이언트 : " + str + " 메시지 받음");
		socket.close();
	}

}
