	//Given 2 strings, a and b, return a string of the form 
	//short+long+short, with the shorter string on the outside and the longer string on the inside. 
	//The strings will not be the same length, but they may be empty (length 0).
	//If input is "hi" and "hello", then output will be "hihellohi".

import java.util.*;

public class StrSrtLngConcat {
	public static void main(String[] args) {
		Scanner s1= new Scanner(System.in);
		System.out.println("Enter a string ");
		String a = s1.nextLine();
		Scanner s2= new Scanner(System.in);
		System.out.println("Enter a string ");
		String b = s2.nextLine();
		String output;
		if (a.length() < b.length()) 
			output = a + b + a;
		else
			output = b + a + b;		
		System.out.println(output);
	}
}