package Q_2;

public class ParallelThread extends Thread {

	Calculation myCalc;
	
	
	private int start;
	
	private int end;

	public ParallelThread(Calculation myCalc, int start, int end) {
		
		this.myCalc = myCalc;
		this.start = start;
		this.end = end;
	}
	
	public void run() {
		
			myCalc.Factorial(start, end);
	}
	
	
}
