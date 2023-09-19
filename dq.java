import java.util.*;
public class dq
{
	public static void main(String[] args)
	{
		Deque<Integer> deq =new ArrayDeque<>();
		deq.addFirst(1);
		deq.addLast(0);
		int first=deq.removeFirst();
		int last=deq.removeLast();
		System.out.println("First: "+first+" Last: "+last);
	}
}