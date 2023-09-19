import java.util.*;
class Vehicle
{
	int a;
	Vehicle(int r)
	{
	 a=r;
	}
}
class bike extends Vehicle
	{
		int b;
	bike(int r,int s)
	{
	super(r);
     b=s;	
	}
}
class car3 extends bike
{
	int c;
	car3(int r,int s,int t)
	{
	   super(r,s);
	   c=t;
	}
	void display()
	{
		System.out.println("First:"+a);
		System.out.println("Second:"+b);
		System.out.println("Third:"+c);
	}
		
public static void main(String[] args)
{
car3 cn =new car3(1,2,3);
cn.display();

}
}