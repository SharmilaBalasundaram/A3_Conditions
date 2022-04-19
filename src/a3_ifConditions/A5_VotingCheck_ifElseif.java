package a3_ifConditions;

import java.util.Scanner;

public class A5_VotingCheck_ifElseif {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age= sc.nextInt();
		System.out.println("Enter the country:");
		String nationality = sc.next();
		
		if (age>18){
			System.out.println("You are eligible to vote");
		} else if (nationality.equals("Aus")){
			System.out.println("Eligible to vote since you are Aussie");
		} else {
			System.out.println("Sorry you are not eligible to vote");
		}
		sc.close();
		
		
		
	}
}
