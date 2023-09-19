import java.util.*;
public class ItemM
{
int eno,cost;
String ename;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter item name: ");
ename=sc.next();
System.out.println("Enter the item code: ");
eno=sc.nextInt();
System.out.println("Enter cost: ");
cost=sc.nextInt();
}
public void display()
{
	  System.out.println("\n");
System.out.println("Item Details");
  System.out.println();
System.out.println("Item Name: "+ename);
System.out.println("Item Code: "+eno);
System.out.println("Item cost: "+cost);
}
 public static void main(String[] args)
{
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter No.of items");
  int n=sc.nextInt();
  Item2 e[]=new Item2[n];
  for(int i=0;i<n;i++)
  {
  e[i]=new Item2();
  e[i].get();
  }
  for(int i=0;i<n;i++)
  {
  e[i].display();
  }
}
}