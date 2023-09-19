//Create a class ‘common’ with members name, gender and age.
//Derive three classes principal, teacher and student with data members salary, subject and grade respectively. 
//Display the details of the same using hierarchical inheritance.
import java.util.*;
class common
{
	int age;
	String name,gender;
	void get()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Name");
		name=sc.next();
		System.out.println("Enter age");
		age=sc.nextInt();
		System.out.println("Enter gender");
		gender=sc.next();
	}
	void disp()
	{
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	}
	public static void main(String[] args)
	{
		principal p=new principal();
		teacher t=new teacher();
		student s=new student();
		System.out.println("Enter Principal's Details");
		p.get();
		p.get1();
		System.out.println("Enter Teacher's Details");
		t.get();
		t.get2();
		System.out.println("Enter Student's Details");
		s.get();
		s.get3();
		System.out.println("Details of Principal");
		p.disp();
		p.disp1();
		System.out.println("Details of Teacher");
		t.disp();
		t.disp2();
		System.out.println("Details of Student");
		s.disp();
		s.disp3();
	}
}
class principal extends common
{
	int sal;
	void get1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the salary");
	sal=sc.nextInt();
	}
	void disp1()
	{
		System.out.println("Salary: "+sal);
	}
}
class teacher extends common
{
	String sub;
	void get2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subject");
		sub=sc.next();
	}
	void disp2()
	{
		System.out.println("Subject: "+sub);
	}
}
class student extends common
{
	String g;
	void get3()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the grade");
		g=sc.next();
	}
	void disp3()
	{
		System.out.println("Grade: "+g);
	}
}

	