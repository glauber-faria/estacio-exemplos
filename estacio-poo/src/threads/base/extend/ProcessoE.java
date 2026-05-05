package threads.extend;

import java.util.Random;

public class ProcessoE extends Thread{
    int id;
    public ProcessoE(int id){
        this.id = id;
    }

    @Override
    public void run() {
        try {
            int random = new Random().nextInt(500);
            Thread.sleep(random);
            System.out.printf("Executando o processo de numero: %d, na Thread: %s, sleep por %d ms \n", this.id, Thread.currentThread().getName(), random);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
