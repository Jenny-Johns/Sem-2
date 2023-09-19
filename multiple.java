import java.util.*;
interface A
{
public void disp();

}
interface B
{
	public void disp1();
}
class multiple implements A,B
{
	public void disp()
{
	System.out.println("class A");
}
public void disp1()
	{
		System.out.println("ClassB");
	}
	void disp2()
	{
		System.out.println("Multiple");
	}
	public static void main(String[] args)
	{
		multiple m=new multiple();
		m.disp2();
		m.disp();
		m.disp1();
	}
}
