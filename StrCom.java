import java.util.*;
public class StrCom
{
public static void main(String[] args)
{
	String temp;

Scanner sm=new Scanner(System.in);
System.out.println("Enter the limit");
int l=sm.nextInt();
System.out.println("Enter the string: ");
String a[]=new String[l];
for(int i=0;i<l;i++)
{
	a[i]=sm.nextLine();
}
for(int i=0;i<l;i++)
{
for(int j=i+1;j<l;j++)
{
	if(a[i].compareTo(a[j])>0)
	{
	    temp=a[i];
		a[i]=a[j];
		a[j]=temp;
	}
}
}
System.out.println("Sorted form");
for(int i=0;i<l;i++)
{
	System.out.println(a[i]);
}
}
}