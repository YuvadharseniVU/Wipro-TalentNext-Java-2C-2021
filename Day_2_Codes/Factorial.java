	//Factorial of a given number

import java.util.*;


public class Factorial {

    public static void main(String[] args) {

	int num;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the value of N");

	num= sc.nextInt();

	long factorial = 1;

	for(int i = 1; i <= num; ++i)
 {

            factorial *= i;
        
	}
	
System.out.printf("Factorial of %d = %d", num, factorial);

    }

}