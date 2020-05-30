	//Count the total characters after Removing the Duplicate String

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class CharCount {

	//Complete the 'fewestCoins' function below.
	//The function is expected to return an INTEGER.
     	//The function accepts STRING coins as parameter.
	
	public static int fewestCoins(String coins) {
    		int n=coins.length();
		char[] ch = new char[n]; 
		for (int i = 0; i < n; i++) { 
       			ch[i] = coins.charAt(i); 
		}        
        	String res=CharCount.removeDuplicate(ch,n);
        	int result=res.length();
        	return result; 
    	} 

    	static String removeDuplicate(char ch[], int n) { 
        	int index = 0;
        	for (int i=0;i<n;i++) {
            		int j; 
            		for (j=0;j<i;j++) { 
                		if (ch[i]==ch[j]) { 
                    			break; 
                		} 
            		} 
            		if (j == i) { 
                		ch[index++] = ch[i];             
            		} 
        	}
        	return String.valueOf(Arrays.copyOf(ch, index));
    	}
}

public class Solution {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));		//Enter a string
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
		String coins = bufferedReader.readLine();		//coins="String"

		int result = CharCount.fewestCoins(coins);
									
		bufferedWriter.write(String.valueOf(result));		//System.out.println(result) can be used
		bufferedWriter.newLine();
		bufferedReader.close();
	        bufferedWriter.close();
    	}
}