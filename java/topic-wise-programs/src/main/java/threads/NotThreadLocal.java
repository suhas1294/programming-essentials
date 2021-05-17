package threads;

public class NotThreadLocal {

    public static class MyRunnable implements Runnable {

        private Integer notThreadlocal = 5;
        private ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>();

        @Override
        public void run() {
            System.out.println("Name: " + Thread.currentThread().getName());
            threadLocal.set( (int) (Math.random() * 100D) );
            notThreadlocal = threadLocal.get();

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
            }
            System.out.println("notThreadlocalvariable: " + notThreadlocal);
            System.out.println("threadlocalvariable: " + threadLocal.get());
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyRunnable sharedRunnableInstance = new MyRunnable();

        Thread thread1 = new Thread(sharedRunnableInstance);
        Thread thread2 = new Thread(sharedRunnableInstance);

        thread1.setName("thread1");
        thread2.setName("thread2");

        thread1.start();
        thread2.start();

        thread1.join(); //wait for thread 1 to terminate
        thread2.join(); //wait for thread 2 to terminate
    }
}
