package threads;

// concept of producer and consumer problem
class Temp{
	private int num;
	boolean valueSet = false;
	
	public synchronized void getNum() {
		while (!valueSet){ // if value is not set, then wait until its set.
			try{wait();}catch (Exception e){}
		}
		System.out.println("Getting value :\t" + num);
		valueSet = false;
		notify();
	}
	
	public synchronized void setNum(int num) {
		while (valueSet){ // if value is set, then wait until its consumed.
			try{wait();}catch (Exception e){}
		}
		System.out.println("Setting value :\t"+ num);
		this.num = num;
		valueSet = true;
		notify();
	}
}

class Producer implements Runnable{
	Temp obj;
	
	public Producer(Temp obj) {
		this.obj = obj;
		Thread t = new Thread(this, "producer-thread");
		t.start();
	}
	public void run(){
		int i = 0;
		while (true){
			obj.setNum(i++);
			try{Thread.sleep(5000);}catch (InterruptedException e){e.printStackTrace();}
		}
	}
}


class Consumer implements Runnable{
	Temp obj;
	
	public Consumer(Temp obj) {
		this.obj = obj;
		Thread t = new Thread(this, "consumer-thread");
		t.start();
	}
	public void run(){
		while (true){
			obj.getNum();
			try{Thread.sleep(200);}catch (InterruptedException e){e.printStackTrace();}
		}
	}
}

public class InterThreadComm {
	public static void main(String args[]){
		Temp temp = new Temp();
		new Producer(temp);
		new Consumer(temp);
	}
}
