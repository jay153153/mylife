package mylife;

public class befree14 
{
	public static void main(String[] args) 
	{
//		for(int i=1;i<100;i++)
//		{
//			System.out.print(i+" "); //print換列
//			if(i%10==0)
//			{
//				System.out.println(); 
//			}
//		}
		for(int j=0; j<10; j++)
		{
		for(int i=1;i<10;i++) //
		{
			int v = j *10+i;//判斷是否為質數
			boolean isok = true;
			for(int k=2;k<v; k++)
			{
				if(v%k==0)
				{
					isok= false;
					break;
				}
			}
			System.out.print(v+ (isok?"*":" "));
		}
			System.out.println();
		}
	}

}
