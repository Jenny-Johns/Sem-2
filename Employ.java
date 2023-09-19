import java.util.*;
public class Employ
{
int eno,salary;
String ename;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter employee name: ");
ename=sc.next();
System.out.println("Enter the employee code: ");
eno=sc.nextInt();
System.out.println("Enter salary: ");
salary=sc.nextInt();
}
public void display()
{
	  System.out.println("\n");
System.out.println("Employee Details");
  System.out.println("\n");
System.out.println("Employee Name: "+ename);
System.out.println("Employe Code: "+eno);
System.out.println("Employee Salary: "+salary);
}
 public static void main(String[] args)
{
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter No.of employees");
  int n=sc.nextInt();
  Employ e[]=new Employ[n];
  for(int i=0;i<n;i++)
  {
  e[i]=new Employ();
  e[i].get();
  }
  /*for(int i=0;i<n;i++)
  {
  e[i].display();
  }*/
  
  for(int i=0;i<n;i++)
  {
  if(e[i].salary>10000&&e[i].salary<15000)
  {
	  System.out.println("Employee found");
	  e[i].display();
  }
  }
}
}