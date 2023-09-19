import java.util.*;
	public class Linked
	{
		public static void main (String [] args)
		{
			LinkedList<String> list = new LinkedList<String>();
			Scanner obj =new Scanner(System.in);
			int ch;
		do
		{
			System.out.println("1.Add ");
			System.out.println("2.Remove ");
			System.out.println("3.Clear ");
			System.out.println("4.Display");
			System.out.println("5.Exit");
			System.out.println("Select your Option  ");
			ch=obj.nextInt();
			switch(ch)
			{
				case 1:
					String val;
					System.out.println("Enter the element");
					val=obj.next();
					list.add(val);
					System.out.println("Element added");
					break;
				case 2:
				    String v;
					 System.out.println("element to be removed");
					 v=obj.next();
					 list.remove(v);
					 System.out.println("Element removed");
					break;
				case 3:
					list.clear();
					break;
				case 4 :
					System.out.println(list);
					break;
			}
		}while(ch !=5);

		}
	}	