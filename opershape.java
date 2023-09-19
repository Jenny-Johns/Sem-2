//opershape.java    
package graphics;
import java.util.*;
	public class opershape implements interpack
	{
		double rl,rb,ra,tb,th,ta,ss,sa,cr,ca;
		public void rectangle()
		{
	
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the length of the rectangle");
			rl= sc.nextDouble();
			System.out.println("Enter the breadth of the rectangle");
			rb=sc.nextDouble();
		}
		public void rectangleput()
		{
			
			ra=rl*rb;
			System.out.println("The area of the rectangle is"+ra);
		}
		public void triangle()
		{
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the base of the triangle");
			tb=sc.nextDouble();
			System.out.println("Enter the height of the triangle");
			th= sc.nextDouble();
		}
		public void triangleput()
		{
			
			ta=tb*th*2.5;
			System.out.println("The area of the triangle is"+ta);
		}
		public void square()
		{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the side of the square");
			ss= sc.nextDouble();
		}
		public void squareget()
		{
			
			sa= ss*ss;
			System.out.println("The area of the square is"+ss);
		}
		public void circle()
		{
		
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter the radius of the circle");
			cr=sc.nextDouble();
		}
		public void circleput()
		{
			
			ca=3.14*cr;
			System.out.println("The area of the circle is"+ca);
		}
		public static void main(String[]args)
		{
			opershape s= new opershape();
			s.rectangle();
			s.rectangleput();
			s.triangle();
			s.triangleput();
			s.square();
			s.squareget();
			s.circle();
			s.circleput();
		}
	}