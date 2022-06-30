package step01;

public class Ex07ThreadSafetyStop extends Thread {

	public Ex07ThreadSafetyStop() {
	}

	public Ex07ThreadSafetyStop(ThreadGroup busan, String threadName) {
		super(busan, threadName);
	}

	@Override
	public void run() {
		while (true) {
			System.out.println("스레드 실행중!");
			if (Thread.interrupted()) {
				System.out.println("스레드 종료");
				break;
			}
		}
	}

	public static void main(String[] args) {
		Ex07ThreadSafetyStop thread = new Ex07ThreadSafetyStop();
//		thread.start();
		try {
			Thread.sleep(1000);
			thread.interrupt();
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
		}

		// 스레드 그룹화
		ThreadGroup busan = new ThreadGroup("Busan");
		Ex07ThreadSafetyStop thread1 = new Ex07ThreadSafetyStop(busan, "부산1");
		Ex07ThreadSafetyStop thread2 = new Ex07ThreadSafetyStop(busan, "부산2");
		Ex07ThreadSafetyStop thread3 = new Ex07ThreadSafetyStop(busan, "부산3");
		thread1.start();
		busan.list();
		busan.interrupt();
	}
}
