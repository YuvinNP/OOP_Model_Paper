package Q_2;

public class MainThreadApp {

	public static void main(String[] args) throws InterruptedException {
		
//		MainThreadApp obj = new MainThreadApp();
		
		CountDown c1 = new CountDown();
		Thread c2 = new Thread(new CalcSum(c1));
		Thread c3 = new Thread(new CalcSum(c1));
		
		c2.setName("Black");
		c3.setName("White");
		
		c1.start();
		c2.start();
		c3.start();
		
//		c1.join();
//		c2.join();
//		c3.join();
	}
}
