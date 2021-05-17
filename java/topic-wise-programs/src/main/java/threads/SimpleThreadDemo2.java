package threads;

class Hi1 implements Runnable{
	public void run() {
		for (int i=0;i<5;i++){
			System.out.println("Hi");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

class Hello1 implements Runnable{
	public void run() {
		for (int i=0;i<5;i++){
			System.out.println("Hello");
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}

public class SimpleThreadDemo2 {
	public static void main(String args[]) {
		Hi1 hi = new Hi1();
		Hello1 hello = new Hello1();
		
		// This is also right
		/*Runnable hi = new Hi1();
		Runnable hello = new Hello1();*/
		
		Thread t1 = new Thread(hi);
		Thread t2 = new Thread(hello);
		
		t1.start();
		try{Thread.sleep(10);}catch (InterruptedException e){e.printStackTrace();}
		t2.start();
	}
}
