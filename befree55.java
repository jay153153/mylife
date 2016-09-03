package mylife;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class befree55  {
	public static void main(String[] args) {
		Student s1 =new Student(new PM(),"Dave",90,50,75);
		Student s2 =new Student(new PM(),"Tony",80,70,45);
		System.out.println(s1.calTotal());
		System.out.println(s1.calAvg());
		
try {
	ObjectOutputStream oout =
			new ObjectOutputStream(
					new FileOutputStream("dir1/student.brad"));
	oout.writeObject(s1);
	oout.writeObject(s2);
	oout.flush();
	oout.close();
} catch (IOException e) {
	System.out.println(e.toString());
	}

	}
}
class Student implements Serializable{         //類別:學生
	int ch,eng,math;
	String name;
	PM pm;
Student(PM pm,String name,int ch ,int eng ,int math){ // 學生的屬性
	this.pm = pm;
	this.name = name;
	this.ch=ch;
	this.eng=eng;
	this.math=math;
}
int calTotal(){return ch+eng+math;} // 方法
double calAvg(){return calTotal()/3.0;}
}
class PM implements Serializable{    //implements Serializable 就是序列化
	
}

