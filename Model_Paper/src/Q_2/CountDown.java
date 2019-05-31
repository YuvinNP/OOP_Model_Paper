package Q_2;

public class CountDown extends Thread {

//	MainThreadApp obj;
	
	
//	public CountDown(MainThreadApp obj) {
//		
//		this.obj = obj;
//	}


	public void run() {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {e.printStackTrace();}
			
			
		}
//		obj.notify();
		
	}
}
