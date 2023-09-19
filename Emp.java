import java.util.*;
public class Emp
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
  Emp e[]=new Emp[n];
  for(int i=0;i<n;i++)
  {
  e[i]=new Emp();
  e[i].get();
  }
  for(int i=0;i<n;i++)
  {
  e[i].display();
  }
  System.out.println("Enter the Employee code to search");
  int v=sc.nextInt();
  for(int i=0;i<n;i++)
  {
  if(e[i].eno==v)
  {
	  System.out.println("Employee found");
	  e[i].display();
  }
  }
}
}