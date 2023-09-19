import java.util.*;
public class Largest
{
	public static void main(String[] args)
	{
		Scanner lm = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int z = lm.nextInt();
		int Arr[] = new int[z];
		System.out.println("Enter the elements in array: ");
		for(int i=0;i<z;i++)
		{
			Arr[i] = lm.nextInt();
		}
		System.out.print("The array: ");
		for(int i=0;i<z;i++)
		{
			System.out.print(Arr[i]+" ");
		}
		int large=0;
		for(int i=0;i<z;i++){
			for(int j=0;j<z;j++){
				if(Arr[i]>=Arr[j]){
					large=Arr[i];
				}
				else
				{
					break;
				}
			}
		}
		System.out.println("The largest number in array is "+large);
		}
}
