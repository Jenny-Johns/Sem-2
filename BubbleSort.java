import java.util.*;
public class BubbleSort
{
	public static void main(String[] args)
    {
		//BubbleSort b=new BubbleSort();
		int n,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		n=sc.nextInt();
		int bub[]=new int[n];
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++)
		{
			bub[i]=sc.nextInt();
		}
		
		
			for(int i=0;i<n;i++)
			{
				for(int j=i+1;j<n;j++)
				{
					if(bub[i]>bub[j])
					{
						temp=bub[i];
						bub[i]=bub[j];
						bub[j]=temp;
					}
				}
			}
			System.out.println("Bubble sorted form");
			for(int i=0;i<n;i++)
				{
					System.out.println(bub[i]);
				}

}
}