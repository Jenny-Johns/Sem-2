import java.util.*;
public class product
{
int pcode,price;
String pname;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter pcode: ");
pcode=sc.nextInt();
System.out.println("Enter pname: ");
pname=sc.next();
System.out.println("Enter price: ");
price=sc.nextInt();
}
public void display()
{
System.out.println("Product code is: "+pcode);
System.out.println("Product name is: "+pname);
System.out.println("Product Price is: "+price);
}
 public static void main(String[] args)
{
product p1=new product();
product p2=new product();
product p3=new product();
p1.get();
p2.get();
p3.get();
p1.display();
p2.display();
p3.display();
if(p1.price<p2.price&&p1.price<p3.price)
{
	System.out.println("Price of first product is less");
}
else if(p2.price<p1.price&&p2.price<p3.price)
{
	System.out.println("Price of product 3 is less");
}
else
{
	System.out.println("Price of product 3 is less");
}
}
}