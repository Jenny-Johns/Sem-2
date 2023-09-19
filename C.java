class A
{
void disp()
{
	System.out.println("base class");
}
}
class B extends A
{
	void disp1()
	{
	 System.out.println("class B");
	}
}
class C extends A
{
 void disp2()
 {
   System.out.println("class C");
 }
public static void main(String[] args)
{
 C c=new C();
 B b=new B();
c.disp();
c.disp2;
b.disp1;
}
} 