import java.util.*;
public class Item
{
int eno,cost,f=0;
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
	  System.out.println("");
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
  Item e[]=new Item[n];
  for(int i=0;i<n;i++)
  {
  e[i]=new Item();
  e[i].get();
  }
  /*for(int i=0;i<n;i++)
  {
  e[i].display();
  }*/
  for(int i=0;i<n;i++)
  {
  if(e[i].cost>500)
  {   System.out.println();
	  System.out.println("Item found");
	  e[i].display();
	   //f=f+1;
  }
  }
  /*if(f==0)
  {
	  System.out.println("Item not found");
  }*/
}
}