package mylife;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class befree59 {

	public static void main(String[] args) {
		String data = "hello world";
		byte[] sendData =data.getBytes();
		
		try {
	DatagramSocket socket = new DatagramSocket();  // socket 插座概念
	DatagramPacket packet = 					   // packet  封包
			new DatagramPacket(sendData,sendData.length,
					InetAddress.getByName("10.2.24.106"),8888);
			socket.send(packet);
			socket.close();
		} catch (SocketException e) {
			
		} catch (UnknownHostException e) {
	
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}

}
