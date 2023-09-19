//Wap to find area of rectangle and triangle using hierarchical inheritance.
import java.util.*;
class area
{
	int r,t;
	void rect()
	{
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter the length of the rectangle: ");
	 int l = sc.nextInt();
	 System.out.println("Enter the breadth of the rectangle: ");
	 int b =sc.nextInt();
	 r=l*b;
	}
	
 void tri()
 {
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the breadth of the triangle");
 int br=sc.nextInt();
 System.out.println("Enter height of the triangle");
 int h=sc.nextInt();
 t=(br*h)/2;
 }

}
class rectangle extends area
{
	
	void disp2()
	{
	System.out.println("Area of Rectangle: "+r);
	}
	
}
class triangle extends area
{
	
 void disp3()
 {
   System.out.println("Area of triangle: "+t);
 }
public static void main(String[] args)
{
 rectangle re=new rectangle();
 triangle ti=new triangle();
re.rect();
re.disp2();
ti.tri();
ti.disp3();
}
} 