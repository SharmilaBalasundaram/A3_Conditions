package a2_whileLoop;

public class B1_TaskDiamondPattern {

	public static void main(String[] args) {

		int row = 0;
		while (row < 5) {

			int spc = 0;
			while (spc < 5 - row) {
				System.out.print(" ");
				spc++;
			}

			// star
			int col = 0;
			while (col <= row) {
				System.out.print("* ");
				col++;

			}

			System.out.println();
			row++;
		}

		int row1=5;
				while (row1<10){

				int spc1=5;
				while(spc1<=row1+1){
				System.out.print(" ");
				spc1++;
				}

				int col1= 0;
				while(col1<=8-row1){
				System.out.print("* ");
				col1++;
				}

				System.out.println();
				row1++;
		
				}	
		
		
		
		
		
		
		
	}

}
