import java.util.*;
public class Account
{
	int ano,bal;
	String aname;
	public void get()
    {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter name: ");
		aname=sc.next();
		System.out.println("Enter account no: ");
		ano=sc.nextInt();
		System.out.println("Enter balance amount: ");
		bal=sc.nextInt();
    }
    public void display()
    {
		System.out.println("");
		System.out.println("Account Details");
		System.out.println();
		System.out.println("Name: "+aname);
		System.out.println("Account no: "+ano);
		System.out.println("Balance amount: "+bal);
    }
 public static void main(String[] args)
{
	  Scanner sc =new Scanner(System.in);
	  System.out.println("Enter limit");
	  int n=sc.nextInt();
	  Account e[]=new Account[n];
	  for(int i=0;i<n;i++)
      {
		  e[i]=new Account();
		  e[i].get();
      }
      /*for(int i=0;i<n;i++)
      {
          e[i].display();
      }*/
     for(int i=0;i<n;i++)
      {
          if(e[i].bal<500)
             {     System.out.println();
				  System.out.println("Account found");
				  e[i].display();
             }
      }
}
}