	//Write a program to accept two numbers and print whether their sum is EVEN or ODD

import java.util.*;

public class SumEvenOdd {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in); 
		System.out.println("a=");
       		int a= sc.nextInt();
		Scanner sc1= new Scanner(System.in); 
		System.out.println("b=");
       		int b= sc.nextInt();
		if((a+b)%2==0)
			System.out.println("Sum of value a & b is even");
		else
 			System.out.println("Sum of value a & b is odd");
	}
}
