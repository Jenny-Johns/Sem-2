import java.util.*;
public class AverageN
{
	void average(int a,int b)
	{
	System.out.println("Average of two integers: "+((a+b)/2));	
	}
	void average(double x,double y)
	{
	System.out.println("Average of two double values: "+((x+y)/2));
	}
	void average(float m,float n)
	{
	System.out.println("Average of two float values: "+((m+n)/2));
	}
	
public static void main(String[] args)
{
	AverageN s=new AverageN();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter two integers: ");
	int a=sc.nextInt();
	int b=sc.nextInt();
	System.out.println("Enter two double values: ");
	double x=sc.nextDouble();
    double y=sc.nextDouble();
	System.out.println("Enter two float valus: ");
	float m=sc.nextFloat();
	float n=sc.nextFloat();
	s.average(a,b);
	s.average(x,y);
	s.average(m,n);
}
}
	