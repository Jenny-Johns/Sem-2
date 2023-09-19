import java.util.*;
class cricketer
{
	String name, c;
	cricketer()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name");
		name=sc.next();
		System.out.println("Enter country");
		c=sc.next();
	}
	public static void main(String[] args)
	{
		
		System.out.println("Enter Batsman's Details");
		batsman b=new batsman();
		System.out.println("Enter Bowler's Details");
	    bowler o=new bowler();
		System.out.println("Details of Batsman");
		b.disp1();
		System.out.println("Details of Bowler");
		o.disp2();
	}
}
class batsman extends cricketer
{
	int run;
	batsman()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the runs");
	    run=sc.nextInt();
	}
	void disp1()
	{
	    System.out.println("Name: "+name);
		System.out.println("Country: "+c);
		System.out.println("Runs: "+run);
	}
}
class bowler extends cricketer
{
	int w;
	bowler()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no.of wickets");
		w=sc.nextInt();
	}
	void disp2()
	{
	    System.out.println("Name: "+name);
		System.out.println("Country: "+c);
		System.out.println("Wickets: "+w);
	}
}

	