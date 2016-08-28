package mylife;

public class befree37 {                                          //宣告在方法裡面的就是  區域變數;
	public static void main(String[] args) {
		final int a;
		System.out.println(befree376.a);
	}
}

interface befree371{void m1();}
interface befree372{void m2();}
class befree373 implements befree371,befree372{
	public void m1(){}
	public void m2(){}
}
interface befree374 extends befree371{
	void m3();
}

interface befree375 extends befree371 , befree372{
	int a = 10;            //public final  static            //屬性必須 直接給值;
	void m3();			   //public 
}

class befree376 implements befree375{
	int b;
	final int c;                          //or final int c = 10;
	
	befree376(){c=12;}
	@Override
	public void m1() {
		
	}

	@Override
	public void m2() {
		
	}

	@Override
	public void m3() {
		
	}
}