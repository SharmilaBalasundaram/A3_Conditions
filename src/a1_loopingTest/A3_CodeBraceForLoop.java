package a1_loopingTest;

public class A3_CodeBraceForLoop {

	public static void main(String[] args) {
		
		for (int j=1;j<=5;j++)
			System.out.println(j);
		System.out.println("See code blocks difference");
		
		System.out.println("-----");
		
		for (int i=1;i<=5;i++){
			System.out.println(i);
			System.out.println("Loop Execution");
		}
		
		System.out.println("-----");
		
		for (int i=0;i<=5;i++){
			System.out.println(i);
		} System.out.println("see the difference using code blocks within loop");
		
	}
}
