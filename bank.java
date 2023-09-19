import java.util.*;
class bank
{
	String name,gender;
	int age;
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
		savings s=new savings();
		current c=new current();
	
		System.out.println("Enter Savings account Details");
		s.get();
		s.get1();
		System.out.println("Enter Crrent account Details");
		c.get();
		c.get2();
		
		System.out.println("Details of Savings account");
		s.disp();
		s.disp1();
		System.out.println("Details of Current account");
		c.disp();
		c.disp2();
	
	}
}
class savings extends bank
{
	int bal;
	void get1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the balance");
		bal=sc.nextInt();
	}
	void disp1()
	{
		System.out.println("Balance: "+bal);
	}
}
class current extends bank
{
	int bal1;
	void get2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the balance");
		bal1=sc.nextInt();
	}
	void disp2()
	{
		System.out.println("Subject: "+bal1);
	}
}