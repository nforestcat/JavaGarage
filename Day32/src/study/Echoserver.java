package study;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Echoserver {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		ServerSocket serverSocket = new ServerSocket(4444);
		System.out.println("서버 시작");
		while(true) {
			Socket socket = serverSocket.accept();
			
			BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String str = in.readLine();
			String ip=(((InetSocketAddress) socket.getRemoteSocketAddress()).getAddress()).toString().replace("/","");
			String name=(((InetSocketAddress) socket.getRemoteSocketAddress()).getHostName());
			socket.getRemoteSocketAddress();
			System.out.println("서버: "  + str + " 메시지 받음"+" "+"from "+ name +" " +socket.getRemoteSocketAddress() + " "+ ip);
			
			PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
			out.println(str);
			out.flush();
			break;
		}
		System.out.println("서버 종료");
		serverSocket.close();
	}

}
