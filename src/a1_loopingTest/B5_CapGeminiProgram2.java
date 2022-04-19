package a1_loopingTest;

public class B5_CapGeminiProgram2 {
	
	public static void main(String[] args) {
		
		int x=20;
		int a=x++; // x value returns to a, then increments. so after increment its 21
		System.out.println(a); // returns 20
		System.out.println(++x); // returns 22 - adding 1 to 21
		int b=x--; // after this 21
		System.out.println(b);
		System.out.println(--x); // returns 20 
		
	}

}
