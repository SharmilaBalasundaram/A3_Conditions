package a3_ifConditions;

import java.util.Scanner;

public class A3_GetInputDatausingScanner {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		Scanner sc= new Scanner(System.in); // used to get input, scanner class used 
		int a = sc.nextInt(); // to get int input value
		int b = sc.nextInt(); // to get int input value
		String c=sc.next(); // to get String input value
		System.out.println("We got your input, we will compare this");
		
		Thread.sleep(1000);
		
		if(a>b){
			System.out.println("The value of a is bigger");
		} else {
			System.out.println("The value of b is Bigger");
		}
		sc.close(); // scanner class must be closed
		}
		
	}


