import java.util.*;
class employee
{
	int eid;
	String name;
	void get()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter employee id");
		eid=sc.nextInt();
		System.out.println("Enter employee name");
		name=sc.next();
	}
}
class worker extends employee
{
	int n;
	void get1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Daily wage");
		n=sc.nextInt();
	}
	void display()
	{
		System.out.println("Employee name: "+name);
		System.out.println("Employee id: "+eid);
		System.out.println("Daily wage: "+n);
	}
	public static void main(String[] args)
	{
        worker s=new worker();
        s.get();
        s.get1();
        s.display();
	}
}	