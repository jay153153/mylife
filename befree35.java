package mylife;

public class befree35 {

	public static void main(String[] args) {
		befree354 car = new befree354();
		befree352 t1 = new befree352();
		befree353 t2 = new befree353();
		car.m1(t1);	

	}
}
interface befree351{
	void m1();
	void m2();
}
class befree352 implements befree351{   //implements:實現
	public	void m1(){System.out.println("befree:m1()");}
	public	void m2(){System.out.println("befree:m2()");}
	void m3(){System.out.println("befree:m3()");}
}
class befree353 implements befree351{   //implements:實現
	public	void m1(){System.out.println("befree:m1()");}
	public	void m2(){System.out.println("befree:m2()");}
	void m4(){System.out.println("befree:m4()");}
}
class befree354 {
	void m1(befree351 obj1){
		obj1.m1();
		obj1.m2();
		
	}
}
