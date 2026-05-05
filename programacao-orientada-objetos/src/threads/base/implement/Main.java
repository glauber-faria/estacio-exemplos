package threads.implement;

public class Main {
	public static void main(String[] args) {
		threads.implement.Processo p1 = new threads.implement.Processo(1);
		threads.implement.Processo p2 = new threads.implement.Processo(2);
		threads.implement.Processo p3 = new threads.implement.Processo(3);

		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(p2);
		Thread t3 = new Thread(p3);

		t1.start();
		t2.start();
		t3.start();
	}
}
