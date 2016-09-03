package mylife;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class befree49 {

	public static void main(String[] args) {
		File f1 = new File ("dir1/befree03.txt");
		try {
			FileOutputStream fout = new FileOutputStream(f1);  //在這間段會清除資料
//			FileOutputStream fout = new FileOutputStream(f1,true); //在TXT最後面會一直複寫
			fout.write("Hello,\nbrad2".getBytes());
			fout.flush();
			fout.close();
			System.out.println("OK");
		} catch (Exception e) {
			System.out.println(e.toString());
		} 
	}

}
