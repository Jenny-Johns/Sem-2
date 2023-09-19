import java.util.*;
public class Student2
{
int rno,eno;
String name;
public void get()
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter Student name: ");
name=sc.next();
System.out.println("Enter Rollno: ");
rno=sc.nextInt();
System.out.println("Enter Enrollment no: ");
eno=sc.nextInt();
}
public void display()
{
	  System.out.println();
System.out.println("Student Details");
  System.out.println();
System.out.println("Student Name: "+name);
System.out.println("Enrollmentno: "+eno);
System.out.println("Rollno: "+rno);
}
 public static void main(String[] args)
{
  Scanner sc =new Scanner(System.in);
  System.out.println("Enter No.of students");
  int n=sc.nextInt();
  Student2 e[]=new Student2[n];
  for(int i=0;i<n;i++)
  {
  e[i]=new Student2();
  e[i].get();
  }
  for(int i=0;i<n;i++)
  {
  e[i].display();
  }

}
}