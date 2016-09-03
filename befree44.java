package mylife;

import java.io.File;
import java.io.IOException;

public class befree44 {

	public static void main(String[] args) {
		File f1 = new File("dir1/befree01.txt");
//System.out.println(f1.getAbsolutePath());   //getAbsolutePath 絕對路徑

		if(f1.isFile())
		{
			System.out.println("exist");
		}
		else
		{
			try {
				if(f1.createNewFile()){
					System.out.println("create ok");
				}else{
					System.out.println("create fail");
				}
			} catch (IOException e) {
				System.out.println(e.toString());
			}
		}
		}

}
