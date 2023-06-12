package study;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;

public class EchoDataServer {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		DatagramSocket socket = new DatagramSocket(4445);
		System.out.println("서버 시작");
		
		byte[] buf = new byte[256];
		
		DatagramPacket packet = new DatagramPacket(buf, buf.length);
		
		socket.receive(packet);
		
		String received = new String(packet.getData(), 0, packet.getLength());
		
		System.out.println("서버 받은 메시지 : " + received);
		InetAddress address = packet.getAddress();
		int port = packet.getPort();
		packet = new DatagramPacket(buf, buf.length, address, port);
		socket.send(packet);
		System.out.println("서버 종료");
		socket.close();
	}

}
