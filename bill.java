import java.util.*;
interface calculate
{
public void calc();
}
class bill implements calculate
{

String date,name;
int qu,id;
float uprice,total;
Scanner sc= new Scanner(System.in);
public void get()
{
		System.out.println("Enter product id");
		id=sc.nextInt();
		System.out.println("Enter product name");
		name=sc.next();
		System.out.println("Enter the quantity of the product");
		qu=sc.nextInt();
		System.out.println("Enter product unit price");
		uprice=sc.nextFloat();
}
public void calc()
{
total=qu*uprice;
}
public void disp()
{
System.out.println(id+"     "+name+"     "+qu+"     "+uprice+"     "+total);
}
public static void main(String[] args)
{
	int n,i,o;
	float net=0;
	String date;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter order number");
	o=sc.nextInt();
	System.out.println("Enter order date");
	date=sc.next();
	System.out.println("Enter no.of products");
    n=sc.nextInt();
	bill b[]=new bill[n];
	for(i=0;i<n;i++)
	{
		b[i]=new bill();
		b[i].get();
		b[i].calc();
	}
System.out.println("............BILL............");
System.out.println("Order no.:"+o);
System.out.println("Date:"+date);
System.out.println("........................");
System.out.println("ID     NAME     QUANTITY     PRICE");
for(i=0;i<n;i++)
	{
		b[i].disp();
		net=net+b[i].total;
	}
	System.out.println("                 Net Amount: "+net);
}
}

