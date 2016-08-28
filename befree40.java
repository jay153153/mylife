package mylife;

public class befree40 {

	public static void main(String[] args) {
			befree401 obj1 = new befree401();
			befree402 obj2 = new befree402();
			befree401 obj3 = new befree402();
//			befree402 obj4 = new befree401();
			obj1.m1();
			obj2.m1();
			obj3.m1();
	}

}

class befree401{
	int a = 1;
	void m1(){System.out.println("befree401:m1():" + a);}
}
class befree402 extends befree401{
	int a=2 ;
	void m1(){System.out.println("befree402:m1():"+ a);}
	void m2(){System.out.println("befree402:m2()");} 
}