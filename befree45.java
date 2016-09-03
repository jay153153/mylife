package mylife;

import java.io.File;

public class befree45 {

	public static void main(String[] args) {
		File dir2 = new File("dir1/dir3/dir4/dir5/dir6");
		if(!dir2.exists())
			if(dir2.mkdirs()){
				System.out.println("create dir2 ok");
			}
	}

}
