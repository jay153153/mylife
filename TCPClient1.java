package mylife;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient1 {

	public static void main(String[] args) {
		//1.read from local filesystem
		long start = System.currentTimeMillis();
		try {
			File sendFile = new File("dir1/coffee.jpg");
			Socket client = new Socket(InetAddress.getByName("127.0.0.1"),6667);
			
			BufferedOutputStream bout =new BufferedOutputStream(client.getOutputStream());
		//
			byte[] sendBuf = new byte[(int)sendFile.length()];
			BufferedInputStream bin = 
				new BufferedInputStream(
					new FileInputStream(sendFile));
			bin.read(sendBuf);
 			
			// 2. send by TCP
			bout.write(sendBuf);
			bin.close();
			bout.flush();
			bout.close();
			client.close();
			System.out.println(System.currentTimeMillis()-start);
			System.out.println("Send OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		}
		
		
		
		
	}
}