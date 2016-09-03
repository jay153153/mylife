package mylife;

import java.io.File;
import java.io.FileReader;

public class befree48 {

	public static void main(String[] args) {
			File f1 = new File("dir1/befree01.text");
			try{
				
			FileReader reader= new FileReader(f1);
			int c;
			while((c=reader.read())!= -1){
			System.out.print((char)c);
			}
			reader.close();
			}catch(Exception e){
			}
			
		}
			
	}


