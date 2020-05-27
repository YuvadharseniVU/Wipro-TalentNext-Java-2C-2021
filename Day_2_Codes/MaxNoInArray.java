	//Program to accept 25 integer elements for an array then find the maximum number in the set and display

import java.util.*;

public class MaxNoInArray {    
	public static void main(String[] args) {        
		int n,max;        
		max=0;        
		int[] a;         //array declaration
        	a = new int[25];   
		System.out.println("Enter 25 numbers ");
		for(int i=0;i<25;i++){            
			Scanner sc = new Scanner(System.in);            
			n=sc.nextInt();            
			a[i] = n;        
		}        
		for(int i=0;i<25;i++)            
			if(a[i]>max)                
				max=a[i];        
		System.out.println("max=" +max);
	}
}
