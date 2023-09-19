import java.util.*;
public class Student
{
int rno,fee;
String name;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student name: ");
name=sc.next();
System.out.println("Enter Rollno: ");
rno=sc.nextInt();
System.out.println("Enter paid fees: ");
fee=sc.nextInt();
}
public void display()
{
	  System.out.println();
System.out.println("Student Details");
  System.out.println();
System.out.println("Student Name: "+name);
System.out.println("Rollno: "+rno);
System.out.println("Total fee paid: "+fee);
}
 public static void main(String[] args)
{
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter No.of students");
  int n=sc.nextInt();
  Student e[]=new Student[n];
  for(int i=0;i<n;i++)
  {
  e[i]=new Student();
  e[i].get();
  }
  for(int i=0;i<n;i++)
  {
  e[i].display();
  }

}
}