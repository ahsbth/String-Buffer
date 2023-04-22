import java.io.*;
import java.util.*;
  class Display
  {
	  public static void main(String args[])
	  {
		  String s=new String();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter a string=");
		  s=sc.nextLine();
		  StringBuffer sb=new StringBuffer(s);
		  System.out.println("String="+sb);
	  }
  }
	  