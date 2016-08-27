package mylife;

public class befree31 {

	public static void main(String[] args) {
		String a = "0123";
		System.out.println(a.concat("brad"));//在字串後增加 但沒傳回
		System.out.println(a);
		System.out.println(a.replace('2', 'k'));
		System.out.println(a);
		StringBuffer sb1 = new StringBuffer(); //如果字串裡面可能會變動的話就用StringBuffer;
		System.out.println(sb1.capacity());  //容量
		sb1.append("123456789123456992922382222233847"); //字串後增加,再傳回字串
		System.out.println(sb1.capacity());
		sb1.append("12");
		System.out.println(sb1.capacity());
		
	}

}
