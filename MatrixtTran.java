import java.util.*;
public class MatrixtTran
{
public static void main(String args[])
{
int [][] a = new int [50][50];
int i,j;
Scanner sc = new Scanner(System.in);
System.out.println("Enter the number of rows : ");
int n=sc.nextInt();
System.out.println("Enter the number of cols : ");
int m=sc.nextInt();
System.out.println("Enter the array elements : ");
for(i=0;i<n;i++)
{
for(j=0;j<m;j++)
{
a[i][j]=sc.nextInt();
}
}
System.out.println("The matrix : ");
for (i=0;i<n;i++)
{
for (j=0;j<m;j++)
{
System.out.print(a[i][j]+"\t");
}
System.out.println();
}
System.out.println("Transpose of matrix : ");
for (i=0;i<m;i++)
{
for (j=0;j<n;j++)
{
System.out.print(a[j][i]+"\t");
}
System.out.println();
}
}
}
