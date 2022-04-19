package a3_ifConditions;

public class A6_MultipleIfStatments_2Condtrue {

	public static void main(String[] args) {
		
		int age=19;
		String nationality="Aus";
		if (age>18){
			System.out.println("You are eligible to vote");
		} 
		
		if (nationality.equals("Aus")){
			System.out.println("Eligible to vote since you are Aussie");
		} else {
			System.out.println("Sorry you are not eligible to vote");
		}
		
		
		
	}
}
