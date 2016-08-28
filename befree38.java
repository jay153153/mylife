package mylife;

public class befree38 {

	public static void main(String[] args) {
		 //存取修飾字:public protected void private
	     //存取範圍    : 大 ~~~~~~~~~~~~~~~~~~~~~小
		 //public          = 全世界
		 //protected       = 相同package,繼承子類別
		 //沒有存取修飾字     = 相同package,繼承子類別
		 //private         = 本類別
	}

}
class befree381{						
	void m1(){}                          
}										 
class befree382 extends befree381{     //extends=發揚光大 
	public void m1(){}
}
