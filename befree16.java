package mylife;

public class befree16 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++)
		{
			if(i%2==0)
			{
				continue;   //以下都不要繼續做
			}
			System.out.println(i);
		}
	}

}
