import java.io.*;
import java.util.*;
  class Setlength
  {
	  public static void main(String args[]) throws IOException
	  {
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  String s=new String();
		  System.out.println("Enter a string=");
		  s=br.readLine();
		  StringBuffer sb=new StringBuffer(s);
		  sb.setLength(5);
		  System.out.println("String="+sb);
	  }
  }
  