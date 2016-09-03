package mylife;

//output

import java.io.DataInputStream;
import java.io.FileInputStream;

public class befree54 {

	public static void main(String[] args) {
		
		try {
		DataInputStream din = new DataInputStream(new FileInputStream("dir1/data.dat"));
					
				int data1 =din.readInt();
				boolean data2 =din.readBoolean();
				double  data3 = din.readDouble();
				System.out.println(data1);
				System.out.println(data2);
				System.out.println(data3);
				din.close();
			int data = din.readInt();		
		} catch (Exception e) {
		}
	}

}
