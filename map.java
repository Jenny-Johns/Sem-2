import java.util.*;
class map {
	public static void main(String args[])
	{
		Map<String, Integer> hm= new HashMap<String, Integer>();
		hm.put("a",10);
		hm.put("b",20);
		hm.put("c", 30);
		hm.put("d", 40);
			System.out.println("map content:"+hm);
			hm.put("a",50);
		    System.out.println("map content after changing value:"+hm);
			hm.remove("c",30);
			System.out.println("map content after removing value:"+hm);
	}
}
