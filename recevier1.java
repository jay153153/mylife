package mylife;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class recevier1 {

	public static void main(String[] args) {
		try{
			
			ServerSocket server =new ServerSocket(6667);
			Socket socket = server.accept();
			BufferedInputStream bin =new BufferedInputStream(socket.getInputStream());
			BufferedOutputStream bout = new BufferedOutputStream(new FileOutputStream("upload/coffee1.jpg"));
			int b;
			while((b=bin.read())!=-1){
				bout.write(b);
			}
			bin.close();
		}catch(IOException e){
			System.out.println("Server:" + e.toString());
		}
	}

}
