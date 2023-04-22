import java.io.*;
import java.util.*;
  class Palindrome
  {
	  public static void main(String args[])
	  {
		  String s=new String();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a string=");
		  s=sc.nextLine();
		  StringBuffer sb=new StringBuffer(s);
		  StringBuffer sb1=sb.reverse();
		  String s1=new String(sb1);
		  if(s.equals(s1))
		  {
		  System.out.println(" palindrome");
		  }
		  else
		  {
			  System.out.println("not palindrome");
		  }
	  }
  }
	  