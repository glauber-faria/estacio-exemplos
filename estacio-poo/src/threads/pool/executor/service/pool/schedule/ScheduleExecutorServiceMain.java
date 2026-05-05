package threads.pool.executor.service.pool.schedule;

import java.time.LocalTime;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ScheduleExecutorServiceMain {
	public static void main(String[] args) {
		threads.implement.Processo p1 = new threads.implement.Processo(1);
		threads.implement.Processo p2 = new threads.implement.Processo(2);

		ScheduledExecutorService pool = Executors.newScheduledThreadPool(2);
		Shutdow sd = new Shutdow(LocalTime.now().plusMinutes(1), pool);

		pool.schedule(p1, 3, TimeUnit.SECONDS); //fixo 1 execução
		pool.scheduleAtFixedRate(p1, 0, 30, TimeUnit.SECONDS); //A cada 30 seconds
		pool.scheduleAtFixedRate(p2, 0, 20, TimeUnit.SECONDS); //A cada 20 seconds
		pool.scheduleAtFixedRate(p1, 0, 40, TimeUnit.SECONDS); //A cada 40 seconds
		pool.scheduleAtFixedRate(sd, 0, 10, TimeUnit.SECONDS);
	}
}
