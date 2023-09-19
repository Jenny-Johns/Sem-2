import java.util.*;
public class Stack_Implementation
{
	int size,e,p;
	int stack[];
	int top=0;
	public void push()
	{
		if(top>size)
		{
			System.out.println("Stack is full");
		}
		else
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the size of the stack");
			size=sc.nextInt();
			int stack[]=new int[size];
			System.out.println("Enter the element");
			e=sc.nextInt();
			top=top+1;
			stack[top]=e;
			
			System.out.println("Top Element is: "+stack[top]);
			
			
		}
	}
public void disp()
	{
		/*System.out.println("Stack elements");
		for(int i=0;i<size;i++)
		{
			System.out.println(stack[i]);
		}*/
		System.out.println("Top Element is: "+stack[top]);
	}
	public void pop()
	{
		System.out.println("Stack pop");
		p=stack[top];
		top=top-1;
		System.out.println(p);
	}
public static void main(String[] args)
{
	int c;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the choice"+"\n"+" 1.Push"+"\n"+" 2.Display"+"\n"+" 3.Pop");
	c=sc.nextInt();
	Stack_Implementation s=new Stack_Implementation();
	do
	{
	switch(c)
	{		
		case 1:
		s.push();
		break;
		case 2:
		s.disp();
		break;
		case 3:
		s.pop();
		break;
	}
	}
	while(c!=3);
}
}