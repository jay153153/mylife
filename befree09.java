package mylife;

public class befree09  
{
	public static void main(String[] args)
	{
//switch語法:
//		int a=10;     //byte a=10;  byte型別:範圍 -128~127值
//		final int b=9;
//		switch(a)	  //switch語法只能接受:byte/short/int/char
//		{
//		case 1 :							//case裡面只能接受一個變數
//			System.out.println("A");
//			break;
//		case 10 :
//			System.out.println("B");
//			break;
//		case 100 :
//			System.out.println("C");
//			break;
//		case b :
//			System.out.println("D");
//			break;
//		default:                            //default:如果a不等於上述的值,脫離switch的結構 
//			System.out.println("E");
//		}
		
		int dir=10;     
		final int b=9;
		switch(dir)	  
		{
		case 1 :							
			System.out.println("A");
			break;
		case 10 :
			System.out.println("B1");
			break;
		case b+2 :    //if b+1 會出現error  因為 = 10
			System.out.println("B2");
			break;
		default:                            //default:如果a不等於上述的值,脫離switch的結構 
			System.out.println("X");
		}
	}
}
