	/*Given a string, return a version without the first and last char, so "Wipro" yields "ipr". The string length will be at least 2.*/

import java.util.*;

public class CutString {

	public static void main(String[] args) {
		String str = "Wipro";		
		str = str.substring(1, str.length() - 1);		
		System.out.println(str);
	}
}