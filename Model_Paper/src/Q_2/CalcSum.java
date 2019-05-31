package Q_2;

public class CalcSum implements Runnable{

	private int total;
	private String name;
//	MainThreadApp obj;
	CountDown c;
	
	public CalcSum(CountDown c) {
		super();
		this.c = c;
	}
//	
	public void setName(String name) {
		
		this.name = name;
	}



	public void run() {
		
		try {
			
			c.join();
			
		} catch (InterruptedException e) {
						e.printStackTrace();
		}
		for (int i = 1; i <= 100000; i++) {
			
			total = total + i;
		}
		
		System.out.println("Total: " + total + "\nTheadName: " + Thread.currentThread().getName());
	}
}
