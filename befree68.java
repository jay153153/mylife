package mylifegit;
//執行緒
public class befree68 {

	public static void main(String[] args) {
		befree681 obj1 = new befree681("A",200);     //建立物件
		befree681 obj2 = new befree681("B",100);
		befree682 obj3 = new befree682("C",150);
		Thread t3 = new Thread(obj3);
		obj1.start();    //會實作下面的實作 run
		obj2.start();
		t3.start();
		try {
			obj2.join();
		} catch (InterruptedException e) {
		}
		System.out.println("main");
	}

}

class befree681 extends Thread{
	private String name;
	private int    delay;
	befree681(String name,int dalay){this.name = name;
	this.delay = delay;}
	
	@Override							//賦予生命
	public void run() {
		for(int i=0;i<10;i++)			//生命的意義          
		{
			System.out.println(name+":"+i);
		}
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			
		}
	}
}
class befree682 implements Runnable{
	private String name;
	private int    delay;
	befree682(String name,int dalay){this.name = name;
	this.delay = delay;}
	@Override
	public void run() {
		for(int i=0;i<10;i++)			//生命的意義          
		{
			System.out.println(name+":"+i);
		}
		try {
			Thread.sleep(delay);
		} catch (InterruptedException e) {
			
		}
	}
}

