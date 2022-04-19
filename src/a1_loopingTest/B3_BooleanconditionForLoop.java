package a1_loopingTest;

public class B3_BooleanconditionForLoop {

	public static void main(String[] args) throws InterruptedException {

		for (int i = 1; true; i++) { // since the condition is true loop never ends
			System.out.println(i);
			Thread.sleep(1000);
		}

	}

}
