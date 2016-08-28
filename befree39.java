package mylife;

public class befree39 {
	public static void main(String[] args){
		befree391 obj1 = new befree391();
		befree392 obj2 = new befree393();
		befree393 obj3 = new befree393();
		befree393 obj4 = (befree393)obj2;
		obj4.m3();
	}
}
class befree391{
	void m1(){}
	void m2(){}
}
abstract class befree392{							//abstract 抽象
	befree392(){System.out.println("befree392()");}
	void m1(){System.out.println("befree392:m1()");}
abstract void m2();
}
class befree393 extends befree392{          
		void m2(){System.out.println("befree:m2()");}
		void m3(){System.out.println("befree:m3()");}

}
final class befree394{
	
}