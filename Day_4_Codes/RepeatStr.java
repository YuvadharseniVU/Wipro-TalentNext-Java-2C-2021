	//Given a string, return a new string made of n copies of the first 2 chars of the original string 
	//where n is the length of the string. 
	//The string may be any length. 
	//If there are fewer than 2 chars, use whatever is there.
	//If input is "Wipro" then output should be "WiWiWiWiWi".

import java.util.*;

public class RepeatStr {
	public static void main(String[] args) {
		Scanner s = new Scanner(System. in);
    		System. out. println("Enter a string");
    		String str = s. nextLine(); 
		int n = str.length();
		String repeater = "";
		if (n < 2) 
			repeater = str;
		else 
			repeater = str.substring(0, 2);
		String output = "";
		for (int i = 0; i < n; i++) {
			output += repeater;
		}		
		System.out.println(output);
	}
}