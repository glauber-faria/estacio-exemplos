package threads.pool.executor.service.pool.schedule;

import java.time.LocalTime;
import java.util.concurrent.ScheduledExecutorService;

public class Shutdow implements Runnable {
	private LocalTime of;
	private ScheduledExecutorService pool;
	public Shutdow(LocalTime of, ScheduledExecutorService pool) {
		this.of = of;
		this.pool = pool;
	}

	@Override
	public void run() {
		if(LocalTime.now().isAfter(of)){
			pool.shutdown();
		}
	}
}
