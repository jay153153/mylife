package mylife;

public class befree15 {

	public static void main(String[] args) {
		
		befree:
		for(int j=3; j>0;j--){   // 跑幾遍
		for(int i=0;i<3;i++){    
			System.out.println(i+";"+ j);
			if (i==1){
			    break befree;      //脫離所在的迴圈
			}
			}
		}

	}

}
