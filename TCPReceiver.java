package mylife;
import java.io.BufferedReader;
//接收端
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPReceiver {

	public static void main(String[] args) {
		try {
			ServerSocket server = new ServerSocket(7777);
			Socket socket = server.accept();
			
			InputStream in = socket.getInputStream();
			InputStreamReader irs = new InputStreamReader(in);
			BufferedReader reader =new BufferedReader(irs); 
			     StringBuffer sb  = new StringBuffer();
			     
			int c;
			while((c=reader.read())!=-1){
				sb.append((char)c);
			}
			InetAddress urip = socket.getInetAddress();
			server.close();
			
			System.out.println(urip.getHostAddress()+ ":"+ sb);
//			server.accept();
//			System.out.println("after");
//			server.close();
//			System.out.println("Rec ok!");
		} catch (IOException e) {
			
		} 
	}

}
