package Q_2;

public class Main {

	public static void main(String[] args) throws InterruptedException {
	
		Calculation c = new Calculation();
		
		ParallelThread t1 = new ParallelThread(c, 1, 10);
		ParallelThread t2 = new ParallelThread(c, 11, 20);
		ParallelThread t3 = new ParallelThread(c, 21, 30);
		ParallelThread t4 = new ParallelThread(c, 31, 40);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
			
		t1.join();
		t2.join();
		t3.join();
		t4.join();
		

		
		System.out.println("Factorial of 40: " + c.getAns());
		
		
	}

}
