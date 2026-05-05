package aula8.threads;

import aula8.threads.implement.Contador;

import java.util.Random;

public class Processo implements Runnable{
    int id;
    public Processo(int id){
        this.id = id;
    }
    @Override
    public void run() {
        try {
            int random = new Random().nextInt(500);
            Thread.sleep(random);
            System.out.printf("Executando o processo de numero: %d, na Thread: %s, sleep por %d ms, valor do contador %d \n", this.id, Thread.currentThread().getName(), random, Contador.count);
            Contador.count += 1;
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
