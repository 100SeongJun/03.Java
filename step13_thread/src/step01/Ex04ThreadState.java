package step01;

public class Ex04ThreadState {

	public static void main(String[] args) {
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Thread thread2 = new Thread(new Runnable() {

					@Override
					public void run() {
						for (int i = 0; i < 1000000000; i++) {
						}
						;

						try {
							Thread.sleep(3000);
						} catch (Exception e) {
							System.out.println("에러");
						}
					}
				});
				while (true) {
					System.out.println(thread2.getState());
					if (thread2.getState() == Thread.State.NEW) {
						thread2.start();
						System.out.println(thread2.getState());
					} else if (thread2.getState() == Thread.State.TERMINATED) {

						System.out.println("실행 종료");
						break;
					}
					try {
						Thread.sleep(00);
					} catch (InterruptedException e) {
						System.out.println("에러발생");
					}
				}
			}
		}

		);
		thread.start();

	}
}
