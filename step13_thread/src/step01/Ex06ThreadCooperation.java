package step01;

class WorkObject {
	public synchronized void methodA(int num) {
//	public void methodA() {
		System.out.println("작업A : " + num);
//		System.out.println("WokerA의 메소드 작업 실행");
		notify();
		try {
			wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		Thread.yield();
	}

	public synchronized void methodB(int num) {
//	public void methodB() {
		System.out.println("작업B : " + num);
//		System.out.println("작업B : " + num + "WokerB의 메소드 작업 실행");
//		notify();	//waiting 상태의 다른 스레드를 호출하는 기능
		try {
			wait(); // 자기 자신은 waiting 상태로 변경하는 기능
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

//		Thread.yield();
	}
}

class WokerA extends Thread {
	private WorkObject workObject;

	public WokerA(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			workObject.methodA(i);
//			Thread.yield();
		}
	}
}

class WokerB extends Thread {
	private WorkObject workObject;

	public WokerB(WorkObject workObject) {
		this.workObject = workObject;
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++) {
			workObject.methodB(i);
//			Thread.yield();
		}
	}
}

public class Ex06ThreadCooperation {
	public static void main(String[] args) {
		WorkObject sharedObj = new WorkObject();
		Thread th = new Thread();

		WokerA workerA = new WokerA(sharedObj);
		WokerB workerB = new WokerB(sharedObj);

		//
		workerA.start();
		workerB.start();
	}
}