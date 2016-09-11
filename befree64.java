package mylifegit;

public class befree64 {

	public static void main(String[] args) {
		
	}

}

interface befree641{
	void m1();
}
interface befree642{
	void m2();
}
interface befree643 extends befree641,befree642{
	void m3();
}
class befree644 implements befree643{
	public void m1(){}
	public void m2(){}
	public void m3(){}
}