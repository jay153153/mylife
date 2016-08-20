package mylife;

import javax.swing.JOptionPane;

public class befree11 {

	public static void main(String[] args) {
		
		String strYear =JOptionPane.showInputDialog("year");
		System.out.println(strYear);
		String strMonth =JOptionPane.showInputDialog("month");
		System.out.println(strMonth);
		int intyear =Integer.parseInt(strYear);
		System.out.println(strYear +"/" + strMonth);
	}

}
