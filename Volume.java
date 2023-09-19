import java.util.*;
class Volume
{
	int so,cu;
	double py,e;
	float cy,p,sp,c,rpy;
void vol(int l,int w,int h)
{	
int so=l*w*h;
System.out.println("Volume of rectangular solid: "+so);
}
void vol(int a)
{
	int cu=a*a*a;
	System.out.println("Volume of cube: "+cu);
}
void vol(int h1, float r)
{
double cy=3.14*((r*r)*h1);
System.out.println("Volume of cylinder: "+cy);
}
void vol(int b,int h2,float l2)
{
	float p=(l2*b)*h2;
	System.out.println("Volume of prism: "+p);
}
void vol(float r)
{
	double sp=(3.14*(r*r))*1.33;
	System.out.println("Volume of sphere: "+sp);
}
void vol(double h3,int t2,int t3)
{
	double py=0.33*((t2+t3)*h3);
	System.out.println("Volume of pyramid: "+py);
}
void vol(float r1,float h4)
{	
double c=(3.14*(r1*r1)*h4)*0.33;
System.out.println("Volume of right circular cone: "+c);
}
void vol(float le,float wi,float he)
{
	double rpy=0.33*(le*wi*he);
	System.out.println("Volume of Rectangular pyramid: "+rpy);
}
void vol(double a,double b,double c)
{	
double e=(3.14*(a*b*c))*1.33;
System.out.println("Volume of ellipsoid: "+e);
}
public static void main(String[] args)
{ 
    int ch;
    Scanner s=new Scanner(System.in);
	Volume sh =new Volume();
	System.out.println("Volume of different shapes"+"\n"+" 1.Rectangular Solid"+"\n"+" 2.Cube"+"\n"+" 3.Cylinder "+"\n"+" 4.Prism "+"\n"+" 5.Sphere "+"\n"+" 6.Pyramid"+"\n"+" 7.Right Circular cone"+"\n"+" 8.Rectangularpyramid"+"\n"+" 9.Ellipsoid");
	do
	{
	System.out.println("Enter choice: ");
	ch=s.nextInt();
	switch(ch)
	{
		case 1:
		{
	System.out.println("Enter the length: ");
	int l=s.nextInt();
	System.out.println("Enter the breadth: ");
	int w=s.nextInt();
	System.out.println("Enter the height: ");
	int h=s.nextInt();
	sh.vol(l,w,h);
		}
		break;
		case 2:
		{
	System.out.println("Enter the length of edge: ");
	int a=s.nextInt();
	sh.vol(a);
		}
		break;
		case 3:
		{
	System.out.println("Enter the radius: ");
	float r=s.nextFloat();
	System.out.println("Enter the height: ");
	int h1=s.nextInt();
	sh.vol(h1,r);
		}
		break;
		case 4:
		{
	System.out.println("Enter the breadth: ");
	int b=s.nextInt();
	System.out.println("Enter the height: ");
	int h2=s.nextInt();
	System.out.println("Enter the length: ");
	float l2=s.nextFloat();
	sh.vol(b,h2,l2);
		}
		break;
		case 5:
		{
	System.out.println("Enter the radius: ");
	float r=s.nextFloat();
	sh.vol(r);
		}
		break;
		case 6:
		{
	System.out.println("Enter the height of trapezium: ");
	double h3=s.nextDouble();
	System.out.println("Enter the length of parallel side: ");
	int t2=s.nextInt();
	System.out.println("Enter the length of parallel side: ");
	int t3=s.nextInt();
	sh.vol(h3,t2,t3);
		}
		break;
		case 7:
		{
	System.out.println("Enter the radius: ");
	float r1=s.nextFloat();
	System.out.println("Enter the height: ");
	float h4=s.nextFloat();
	sh.vol(r1,h4);
		}
		break;
		case 8:
		{
	System.out.println("Enter the length: ");
	float le=s.nextFloat();
	System.out.println("Enter the breadth: ");
	float wi=s.nextFloat();
	System.out.println("Enter the height: ");
	float he=s.nextFloat();
	sh.vol(le,wi,he);
		}
		break;
		case 9:
		{
	System.out.println("Enter the first semi axis: ");
	double a=s.nextDouble();
	System.out.println("Enter the second semi axis: ");
	double b=s.nextDouble();
	System.out.println("Enter the third semi axis: ");
	double c=s.nextDouble();
	sh.vol(a,b,c);
		}
		break;
		/*default:
		System.out.println("invalid choice");
		break;*/
	}
	}
	while(ch!=9);
}
}

	