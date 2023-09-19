import java.util.*;
public class StringM
{
public static void main(String[] args)
{
Scanner sm = new Scanner(System.in);
System.out.println("Enter the string: ");
String a=sm.nextLine();
System.out.println("Enter the second string: ");
String b=sm.nextLine();
System.out.println("Concatination of strings: "+a.concat(b));
System.out.println("lenth:"+a.length());
System.out.println("Length:"+b.length());
System.out.println("Uppercase: "+a.toUpperCase());
System.out.println("Lowercase: "+a.toLowerCase());
System.out.println("Uppercase: "+b.toUpperCase());
System.out.println("Lowercase: "+b.toLowerCase());
System.out.println("Strings equal? "+a.equals(b));
System.out.println("Substring from first string: "+a.substring(3));
System.out.println("Substring from first string: "+b.substring(3));

}}