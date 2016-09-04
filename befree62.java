package mylife;

import java.util.Iterator;
import java.util.TreeSet;

public class befree62 {
// Collection  : 1.Set(不會重覆,無順序性)   ;   2. List ( 可重複 有順序)
	public static void main(String[] args) {
//		set.add(12);   //參數只能放物件  不能放基本型別     已自動轉成物件
//		HashSet set = new HashSet();
	    TreeSet set = new TreeSet();
		while(set.size()<6){
			set.add((int)(Math.random()*49+1));
		}
		System.out.println(set);
		System.out.println("----");
		
		Iterator it = set.iterator();
		while(it.hasNext()){
			Object obj = it.next();
			System.out.println((Integer)obj);
			
		}
		System.out.println("----");
		for(Object obj:set){
			System.out.println((Integer)obj);
		}
	}

}
