package mylife;

import java.awt.AWTException;
import java.lang.instrument.IllegalClassFormatException;
import java.security.acl.AclNotFoundException;

import javax.sound.sampled.UnsupportedAudioFileException;


public class befree42 {
	public static void main(String[] args) {

		Bird b1 = new Bird();
		b1.setLeg(2);
		try {
			b1.setLeg(2);
			System.out.println(b1.leg);
		} catch (RuntimeException re) {
			System.out.println("別來亂");
		}
		Brad421 obj1 = new Brad421();
		try {
			obj1.m1(2);
		} catch (IllegalClassFormatException ie) {
		} catch (UnsupportedAudioFileException iu) {

		}
		Brad422 obj2 = new Brad422();
		obj2.m1(1);
		}
}
	class Bird {
		int leg;

		void setLeg(int n) {
			if (n < 0 || n > 2) {
				throw new RuntimeException();
			}
			leg = n;
		}
	}

class Brad421{
	void m1(int n)throws IllegalClassFormatException,UnsupportedAudioFileException{
		if(n<0){
			throw new IllegalClassFormatException();
		}else if(n>100){
			throw new UnsupportedAudioFileException();
		}
	}
}
class Brad422 extends Brad421{
	void m1(int n){
		int a = 10 , b = 0;
		try{
			int c = a/b;
		}catch(RuntimeException re){
			System.out.println("catch");
			return;
		}finally{
			System.out.println("finally");
		}	//return;
		System.out.println("ok");
	}
}
