package j26_스레드;

public class ThreadTest {
	
	public static void main(String[] args) {
		
		LoopThread loopThread1 = new LoopThread("손흥민");
		LoopThread loopThread2 = new LoopThread("김민재");
		LoopThread loopThread3 = new LoopThread("이강인");
		LoopThread loopThread4 = new LoopThread("황희찬");
		
		
		loopThread1.setPriority(Thread.MAX_PRIORITY);
		loopThread2.setPriority(Thread.MAX_PRIORITY - 1);
		loopThread3.setPriority(Thread.MAX_PRIORITY - 2);
		loopThread4.setPriority(Thread.MAX_PRIORITY - 3);
		System.out.println(loopThread1.getPriority());
		System.out.println(loopThread2.getPriority());
		System.out.println(loopThread3.getPriority());
		System.out.println(loopThread4.getPriority());
		
		
		
		
		loopThread1.start();
		loopThread2.start();
		loopThread3.start();
		loopThread4.start();
		
	}

}
