package mylife;
//用戶端  確認收到並回應
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class TCPClient {

	public static void main(String[] args) {
		try {
			Socket socket = 
					new Socket(InetAddress.getByName("10.2.24.138"),
							7777); //本機回錄
			OutputStream out = socket.getOutputStream();
			
			out.write("狂".getBytes());
			out.flush();
			out.close();
			socket.close();
		} catch (IOException e) {
					
			
		}
	}

}
