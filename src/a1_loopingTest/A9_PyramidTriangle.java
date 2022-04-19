package a1_loopingTest;

public class A9_PyramidTriangle {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			// space
			for (int j = 0; j < 5 - i; j++) {
				System.out.print(" ");
			}

			// star
			for (int j = 0; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();

		}
	}
}