import java.io.*;
import java.util.*;

class StringRev{
public static void main(String[]args)
{
	
	String Original,reverse="";
	Scanner in = new Scanner(System.in);
	
	System.out.print.ln("enetr a string");
	original = in.nextLine();
	
	int length = original.length();
	
	for (int i= length-1;i>=0;i--)
		reverse =  reverse + original.CharAt(i);
	
	System.out.println("reverse of string"+ reverse);
}
}