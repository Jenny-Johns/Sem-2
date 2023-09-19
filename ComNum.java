import java.util.*;
public class ComNum
{
  public static void main(String[] args)
  {
    Scanner cn=new Scanner(System.in);
	System.out.println("Enter real part");
	int re=cn.nextInt();
	System.out.println("Enter the imaginary part");
	int im=cn.nextInt();
	System.out.println(re+"+"+im+"i");
	System.out.println("Enter real part");
	int rea=cn.nextInt();
	System.out.println("Enter the imaginary part");
	int ima=cn.nextInt();
	System.out.println(rea+"+"+ima+"i");
	System.out.println("Sum of complex numbers: "+(re+rea)+"+"+(im+ima)+"i");
	
	}
}