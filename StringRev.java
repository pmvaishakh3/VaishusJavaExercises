import java.io.*;
import java.util.*;

class StringRev{
public static void main(String[]args)
{
	
	String Original,reverse="";
	Scanner in = new Scanner(System.in);
	
	System.out.println("enter a string");
	Original = in.nextLine();
	
	int length = Original.length();
	
	for (int i= length-1;i>=0;i--)
		reverse =  reverse + Original.charAt(i);
	
	System.out.println("reverse of string"+ reverse);
}
}