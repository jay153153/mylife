package mylife;

public class Bike {       //類別是在做定義
	//Feild 領域 欄位
	private double speed;			  //private私有的
	//Constructor        建構式   建立初始的動作
	Bike(){
		speed = 1;
		System.out.println("Bike():"+speed);
	}
	
	//Method
	
	void upSpeed(){                    //定義方法
		speed = speed<=1?1:speed*1.2;  
	}
	void downSpeed(){
		speed = speed<1?0:speed*0.7; 
	}
	double getSpeed(){              
		return speed;                //回傳自己物件的方法
	}
}
