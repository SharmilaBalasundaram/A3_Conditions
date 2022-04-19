package a1_loopingTest;

public class B1_TaskDiamondPattern {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {

			for (int k = 0; k < 5 - i; k++) {
				System.out.print(" ");
			}

			for (int j = 0; j <= i; j++) {
				System.out.print("* ");

			}
			System.out.println();
		}

		for (int row = 0; row < 4; row++) {
			
			for (int spc = 0; spc <= row + 1; spc++) {
				System.out.print(" ");
			}
			
			for (int col = 0; col < 4 - row; col++) {
				System.out.print("* ");
			}

			System.out.println();

		}

	}

}
