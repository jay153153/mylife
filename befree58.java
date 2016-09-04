package mylife;

import java.net.InetAddress;
import java.net.UnknownHostException;
//	host name   主機名稱 
public class befree58 {

	public static void main(String[] args) {
		try{
			InetAddress[] ips = InetAddress.getAllByName("www.hinet.com");//字串裡面打主機名稱
			for(InetAddress ip :ips)
			System.out.println(ip.getHostAddress());
		}
		catch(UnknownHostException ue){
			System.out.println("X");
		}
	}

}

//TCP 連接導向     會確定目標有無收到   優點:完整性高
//UDP 非連接導向  只傳遞 沒有確認有無收到  優點 :效率高   適合訊息的傳遞