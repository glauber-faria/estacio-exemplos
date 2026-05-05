package threads.implement;

import java.util.Random;

public class Processo implements Runnable {
	int id;

	public Processo(int id) {
		this.id = id;
	}

	@Override
	public void run() {
		try {
			int random = new Random().nextInt(500);
			System.out.printf("%d - Iniciando o processo de numero: %d, na Thread: %s, sleep por %d ms, valor do contador %d \n", this.id, this.id, Thread.currentThread().getName(), random, threads.implement.Contador.count);
			threads.implement.Contador.count += 1;
			Thread.sleep(random);
			System.out.printf("%d - Finalizando o processo de numero: %d, na Thread: %s, sleep por %d ms, valor do contador %d \n", this.id, this.id, Thread.currentThread().getName(), random, threads.implement.Contador.count);
		} catch (InterruptedException e) {
			throw new RuntimeException(e);
		}
	}
}
