package mylifegit;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Collections;
import javafx.print.Collation;

public class befree65 {

	public static void main(String[] args) {
		
		String answer = createAnswerV2(4);
		System.out.println(answer);
//		String answer = createAnswer(3);
//		System.out.println(answer);
//		set.add("brad");
//		String[] a = new String[3];
//		
//		LinkedList<Integer> list = new LinkedList<>();
//		list.add(12);
	}	
		//寫出三碼不重複的數字
		static String createAnswer(int n){
			HashSet<Integer> set = new HashSet<>();
			while(set.size()<n){
				set.add((int)(Math.random()*10));
			}	
			StringBuffer sb = new StringBuffer(n);
			for(Integer i : set) sb.append(i);
			return sb.toString();
		}
		static String createAnswerV2(int n){
			LinkedList<Integer> List = new LinkedList<>();
			for(int i=0;i<10;i++) List.add(i);
			Collections.shuffle(List);
			StringBuffer sb = new StringBuffer(n);
			for (int i=0; i<n; i++) sb.append(List.get(i));
			return sb.toString();
		}
}
