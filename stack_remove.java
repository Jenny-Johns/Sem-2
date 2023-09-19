import java.util.*;
public class stack_remove
{
	public static void main(String[] args)
	{
		Stack<String> strm = new Stack<String>();
		strm.add("jenny");
		strm.add("mca");
		strm.add("amaljyothi");
		strm.add("s2");
		strm.add("b");
		System.out.println("stack: "+ strm);
		String rm=strm.remove(3);
		System.out.println("Removed element: "+rm);
	}
}
	