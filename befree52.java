package mylife;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class befree52 {

	public static void main(String[] args) {
		FileInputStream fin;
		try {
			fin = new FileInputStream("dir1/staff.csv");
			InputStreamReader irs = new InputStreamReader(fin);
			BufferedReader br  =  new BufferedReader(irs);
			
			String line = br.readLine();
//			while((line=br.readLine()) !=null){
//				System.out.print(line);
//			}
			String[] row = line.split(",");
			System.out.println(row.length);
			
			for(String data:row)
			{
				System.out.println(data);
			}
			
			fin.close();
		} catch (Exception e) {
		
		}
				
				
	}

}
