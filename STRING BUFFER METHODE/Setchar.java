import java.io.*;
import java.util.*;
  class Setchar
  {
	  public static void main(String args[]) throws IOException
	  {
		  InputStreamReader isr=new InputStreamReader(System.in);
		  BufferedReader br=new BufferedReader(isr);
		  String s=new String();
		  System.out.println("Enter a Strijng =");
		  s=br.readLine();
		  StringBuffer sb=new StringBuffer(s);
		  System.out.println("Enter a charecter and their position=");
		  char k=(char)br.read();
		  int pos=Integer.parseInt(br.readLine());
		  System.out.print(sb.setCharAt(pos,k));
	  }
  }
  