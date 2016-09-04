package mylife;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;

public class befree61 {

	public static void main(String[] args) {
		try {
			URL url = new URL("http://pdfmyurl.com/?url=http://tw.yahoo.com");
			HttpURLConnection conn = (HttpURLConnection)url.openConnection();
			conn.connect();
//			conn.getInputStream();
//			BufferedReader reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//			
//			String line;
//			while((line = reader.readLine()) != null){
//				System.out.println(line);
//			}
//			reader.close();
//			
//			} catch (IOException e) {
//				System.out.println(e.toString());
//		}
			InputStream in = conn.getInputStream();
			FileOutputStream fout = new FileOutputStream("upload/brad111.jpg");
			
			int b;
			while ((b=in.read()) != -1){
				fout.write(b);
			}
			fout.flush();
			fout.close();
			in.close();
		}catch (IOException e){
		}
	}
}		
