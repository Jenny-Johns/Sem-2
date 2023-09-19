import java.util.*;
public class AddMatrix
{
public static void main(String args[])
{
int [][] a = new int [50][50];
int [][] b = new int [50][50];
int [][] c = new int [50][50];
int i,j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows : ");
int n=sc.nextInt();
System.out.println("Enter the number of cols : ");
int m=sc.nextInt();
System.out.println("Enter the First matrix elements : ");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("Enter the Second matrix elements : ");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
b[i][j]=sc.nextInt();
}
}
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
c[i][j]=a[i][j]+b[i][j];
}
}
System.out.println("Sum of Two matrix : ");
for (i=0;i<n;i++)
{
for (j=0;j<m;j++)
{
System.out.print(c[i][j]+"\t");
}
System.out.println();
}
}
}
