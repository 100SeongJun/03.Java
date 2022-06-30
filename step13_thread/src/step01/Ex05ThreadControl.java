package step01;

class ThreadA extends Thread {
	private boolean stop = false;
	private boolean flag = true;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public void run() {
		while (!stop) {
			if (flag) {
				System.out.println("ThreadA 작업중");
				try {
					ThreadA.sleep(200);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
		}
	}
}

class ThreadB extends Thread {
	private boolean stop = false;
	private boolean flag = true;

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public void run() {
		while (!stop) {
			if (flag) {
				System.out.println("ThreadB 작업중");
				try {
					ThreadA.sleep(200);
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			} else {
				Thread.yield();
			}
		}
	}
}

class SumThread extends Thread {
	private int sum;

	public int getSum() {
		return sum;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
	}
}

public class Ex05ThreadControl {

	public static void main(String[] args) {
//		ThreadA ta = new ThreadA();
//		ThreadB tb = new ThreadB();
//		ta.start();
//		ta.setFlag(false);
//		tb.start();
//		ta.run();
//		ta.setFlag(true);
//		tb.run();
//		ta.setStop(true);
		SumThread sumT = new SumThread();
		sumT.start();
		try {
			sumT.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(sumT.getSum());
	}

}
