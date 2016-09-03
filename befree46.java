package mylife;

import java.io.File;

public class befree46 {

	public static void main(String[] args) {
		File[] roots = File.listRoots();
		for(File root :roots)
			System.out.println(root.getAbsolutePath());
	}

}
