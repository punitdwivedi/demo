package test.concept.core;

public class ThreadLocalExample implements Runnable{

	private volatile int counter = 0;
	private final static ThreadLocal<Integer> threadLocal = new ThreadLocal<Integer>(){
		@Override
		protected Integer initialValue() {
			return 100;
		}
	};
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			counter = i;
			threadLocal.set(i);
			System.out.println(Thread.currentThread().getName()+"::"+ threadLocal.get()+ "---- Counter :: "+ counter);
		}
		
		
	}
	public static void main(String[] args) {
		Runnable runnable = new ThreadLocalExample();
		Thread t1 = new Thread(runnable,"t1");
		Thread t2 = new Thread(runnable, "t2");
		Thread t3 = new Thread(runnable, "t3");
		t1.start();
		t2.start();
		t3.start();
	}
}
