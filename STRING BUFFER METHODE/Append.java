import java.io.*;
import java.util.*;
  class Append
  {
	  public static void main(String args[]) throws IOException
	  {
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  String s=new String();
		  String s1=new String();
		  System.out.println("Enter a string=");
		  s=br.readLine();
		  StringBuffer sb=new StringBuffer(s);
		  System.out.println("Eneter second String=");
		  s1=br.readLine();
		  System.out.println("String="+sb.append(s1));
	  }
  }
  