import java.util.*;
import java.lang.*;
public class Main {

	public static void main(String[] args) {
		
		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Date e = new Date();

		Student[] stu = new Student[n];
		StudentGroup sgroup=new StudentGroup(n);
		//System.out.println("enter details");
	 	 /* int id = sc.nextInt();
		  String Fullname = sc.next();
		  Double avgmark = sc.nextDouble();*/
		   stu[0] = new Student(11,"AAA",e,3.6);
		stu[1] = new Student(22,"bbb",e,6.3);
		stu[2] = new Student(33,"ccc",e,1.3);
		stu[3] = new Student(44,"ddd",e,4.5);
		stu[4] = new Student(55,"eee",e,6.2);
		  /*sg.addFirst(stu[i]);
		  stu[i].getFullName();
		  System.out.println(id+"\n"+Fullname);*/
		
		System.out.println("set");
		sgroup.setStudents(stu);
		System.out.println("print");
		Student i1=sgroup.getStudent(2);
		System.out.println(stu.length);
	}

}
