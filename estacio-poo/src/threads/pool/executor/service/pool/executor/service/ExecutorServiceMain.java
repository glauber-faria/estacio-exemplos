package threads.pool.executor.service.pool.executor.service;

import threads.implement.Processo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMain {
	public static void main(String[] args) {
		Processo p1 = new Processo(1);
		Processo p2 = new Processo(2);
		Processo p3 = new Processo(3);

		ExecutorService executor = Executors.newFixedThreadPool(3);
		executor.execute(p1);
		executor.execute(p2);
		executor.execute(p3);
		executor.shutdown();
	}
}