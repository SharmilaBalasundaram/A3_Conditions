package a1_loopingTest;

public class B2_ReverseString {
	
	public static void main(String[] args) throws InterruptedException {
		
		String s ="Vcentry";
		for (int i=s.length()-1;i>=0;i--){
			System.out.print(s.charAt(i));
			Thread.sleep(1000);
		}
		
		
		
	}

}
