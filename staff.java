import java.util.*;
class staff
{
	int c;
	staff()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter staff code");
		c=sc.nextInt();
	}
	public static void main(String[] args)
	{
		System.out.println("Enter Teacher's Details");
		teacher t=new teacher();
		System.out.println("Enter officer's Details");
	    officer o=new officer();
		System.out.println("Details of Teacher");
		t.disp1();
		System.out.println("Details of officer");
		o.disp2();
	}
}
class teacher extends staff
{
	String sub;
	teacher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the subject");
	    sub=sc.next();
	}
	void disp1()
	{
	    System.out.println("Staff code: "+c);
		System.out.println("Subject: "+sub);
	}
}
class officer extends staff
{
	String grade;
	officer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the grade");
		grade=sc.next();
	}
	void disp2()
	{
	    System.out.println("Staff code: "+c);
		System.out.println("Grade: "+grade);
	}
}

	