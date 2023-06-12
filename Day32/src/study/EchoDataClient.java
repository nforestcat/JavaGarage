package study;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class EchoDataClient {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		byte[] buf = { 'h','e','l','l','o'};
		DatagramSocket socket = new DatagramSocket();
		
		InetAddress address = InetAddress.getByName("localhost");
		
		DatagramPacket packet = new DatagramPacket(buf, buf.length, address, 4445);
		
		socket.send(packet);
		packet = new DatagramPacket(buf, buf.length);
		socket.receive(packet);
		
		String received = new String(packet.getData(), 0, packet.getLength());
		System.out.println("클라이언트 받은 메시지: " + received);
		
		socket.close();
	}

}
