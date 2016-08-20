package mylife;//package=目錄結構
public class befree07//宣告
{

	public static void main(String[] args) 
	{
		int year =2016;
		if(year % 4 == 0)
		{
			if(year % 100 == 0)
			{
				if(year % 400 == 0)
				{
					
				}
				else
				{
					System.out.println("非閏年");
				}
			}
			else
			{
				System.out.println("閏年");
			}
		}
		else
		{
			System.out.println("非閏年");
		}

	}

}
