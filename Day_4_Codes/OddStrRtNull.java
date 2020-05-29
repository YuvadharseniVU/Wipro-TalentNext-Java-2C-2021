	//Given a string of even length, return the first half. 
	//So the string "CatDog" yields "Cat". 
	//If the string length is odd number then return null.

import java.util.*;

public class OddStrRtNull {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a string ");
		String str= s.nextLine();		
		String output;		
		if (str.length() % 2 == 0) {
			output = str.substring(0, str.length() / 2);
		} 
		else {
			output = null;
		}		
		System.out.println(output);
	}
}