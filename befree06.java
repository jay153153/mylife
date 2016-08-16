package mylife;

import java.util.Scanner;

public class befree06 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int Y;
		System.out.println("請輸入: ");
		while(true)
		{
		Y=scanner.nextInt();
		
		if (Y%4==0)
		{
			if(Y%100==0 || Y%400==0)
			{
				System.out.println("非閏年");
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
}
