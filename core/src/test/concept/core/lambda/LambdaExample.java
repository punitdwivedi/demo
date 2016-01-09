package test.concept.core.lambda;

public class LambdaExample {
	 
	
	public static void main(String[] args) {
		LambdaExample example = new LambdaExample();
		
		Runnable runnable1 = () -> {
			for(int i=0;i<100;i++){
				System.out.println("Run Method 1");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		
		Runnable runnable2 = () -> {
			for(int i=0;i<100;i++){
				System.out.println("Run Method 2");
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		};
		Thread t1 = new Thread(runnable1);
		Thread t2 = new Thread(runnable2);
		t1.start();
		t2.start();
		try {
			t2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
