package a2_whileLoop;

public class A9_PyramidTriangle {
	
	public static void main(String[] args) {
		
		int row=0;
		while (row<5){
			
			int spc=0;
			while (spc<5-row){
				System.out.print(" ");
				spc++;
			}
			
			//star
			int col=0;
			while (col<=row){
				System.out.print("* ");
				col++;
			}
			System.out.println();
			row++;
		}
		
		
		
		
	}

}
