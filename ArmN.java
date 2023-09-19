public class ArmN
{
 public static void main(String[] args)
 {
   int n=153;
   int b=153;
   int r=0;
   int sum=0;
   while(n>0)
   {
   r=n%10;
   sum=sum+(r*r*r);
   n=n/10;
   }
   if(sum==b)
   {
   System.out.println("The number is armstrong");
   }
   else
   {
   System.out.println("The number is not armstrong");
   
   }
   }
}