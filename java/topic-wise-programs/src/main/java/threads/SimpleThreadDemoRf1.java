package threads;

public class SimpleThreadDemoRf1 {
	public static void main(String args[]) {
		
		Runnable hi = new Runnable() {
			public void run() {
				for (int i=0;i<5;i++){
					System.out.println("Hi");
					try{Thread.sleep(300);}catch (InterruptedException e){e.printStackTrace();}
					
				}
			}
		};
		Runnable hello = new Runnable() {
			public void run() {
				for (int i=0;i<5;i++){
					System.out.println("Hello");
					try{Thread.sleep(300);}catch (InterruptedException e){e.printStackTrace();}
					
				}
			}
		};
		
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);
		
		t1.start();
		try{Thread.sleep(10);}catch (InterruptedException e){e.printStackTrace();}
		t2.start();
	}
}