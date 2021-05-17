package threads;

class Hi extends Thread{
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

class Hello extends Thread{
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

public class SimpleThreadDemo1 {
	public static void main(String args[]) {
		Hi hi = new Hi();
		Hello hello = new Hello();
		hi.start();
		hello.start();
	}
}
