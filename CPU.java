import java.util.*;
class CPU
{
 
 class processor
 {
 int noc;
 String man;
 void get()
 {
	 Scanner sc= new Scanner(System.in);
	 System.out.println("Enter no.of cores: ");
	 noc=sc.nextInt();
	 System.out.println("Enter manufacturer name: ");
	 man=sc.next();
	 
 }
 void disp()
 {
	 System.out.println("No.of cores: "+noc);
	 System.out.println("Processor Manufacturer: "+man);
 }
 }
 static class ram
 {
 int mem;
 String manf;
 void get1()
 {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter memory: ");
	 mem=sc.nextInt();
	 System.out.println("Enter manufacturer: ");
	 manf=sc.next();
 }
 void disp1()
 {
	 System.out.println("Memory: "+mem);
	 System.out.println("Ram Manufacturer: "+manf);
	 
 }
 }
 public static void main(String args[])
 {
	 CPU c= new CPU();
	Scanner sc=new Scanner(System.in);
	 System.out.println("Enter price: ");
	 int price=sc.nextInt(); 
	
 
 CPU.processor p = c.new processor();
 p.get();
 CPU.ram r = new CPU.ram(); 
 r.get1();
 System.out.println();
 System.out.println("Details");
 System.out.println();
 System.out.println("Price: "+price);
 p.disp();
 r.disp1();

 
 }
}
