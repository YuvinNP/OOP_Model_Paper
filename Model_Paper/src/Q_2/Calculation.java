package Q_2;

public class Calculation {

	private double ans = 1;

	public synchronized void Factorial(int start, int end) {
		
		for (int i = start; i <= end; i++) {
		
			ans = ans * i;
		}
		
	}
	
	public double getAns() {
		return ans;
	}

	
	
}
