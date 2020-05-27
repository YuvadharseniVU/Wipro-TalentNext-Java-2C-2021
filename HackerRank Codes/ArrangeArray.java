//Write a Java program to move every Upper letters to the right and every Lower Case letters to the left of a given array of strings.
//Date : 27-05-2020

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ArrangeArray {
	public static void main(String args[] ) {
		Scanner sc=new Scanner(System.in);	//get input from user e.g:ByeBoo
		String st=sc.nextLine();
		ArrangeArray test = new ArrangeArray();
		String result=test.move(st);
		System.out.println(result);
    	}
	public String move(String str) {   
        	int len=str.length();
        	char ch;
        	String low="";		//lowercase letters
        	String upr="";		//uppercase letters
        	for(int i=0;i<len;i++){
            		ch=str.charAt(i);
            		if (ch>='A' && ch<='Z'){
                		upr += ch;
            		}
            		else{
                		low+=ch;
            		}
        	}
        	return low+upr;		//e.g: result -yeooBB
	}
}
