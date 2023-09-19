import java.util.*;
public class Arr
{
public static void main(String[] args)
{
int i,temp;
Scanner aro=new Scanner(System.in);
System.out.println("Enter the limit");
int n=aro.nextInt();
int arr[]=new int[5];

System.out.println("Enter elements");

for(i=0;i<n;i++)
{
	arr[i]=aro.nextInt();
}
System.out.println("Elements are: ");
for(i=0;i<n;i++)
{
	System.out.println(arr[i]);
}
System.out.println("Enter the element to search");
int el=aro.nextInt();
for(i=0;i<n;i++)
{
	if(el==arr[i])
	{
		System.out.println("Element found at position: "+(i+1));
		break;
	}
}
		
}}