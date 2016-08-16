package mylife;

public class befree05 {

	public static void main(String[] args) 
	{



		double test = Math.random();
		int Score =(int)(Math.random()*101);   
		Score=84;
		System.out.println(Score);
		 if(Score >= 90)
		 {
			 System.out.println("A");
		 }
		 else if(Score >= 80)
		 {
			 System.out.println("B");
			 Score = 32;
		 }
		 else if(Score >= 70)
		 {
			 System.out.println("C");
		 }
		 else if(Score >= 60)
		 {
			 System.out.println("D");
		 }
		 else 
		 {
			System.out.println("E"); 
		 }
		 System.out.println(Score);
		
	}

}
