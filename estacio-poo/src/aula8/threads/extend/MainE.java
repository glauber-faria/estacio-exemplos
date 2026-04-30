package aula8.threads.extend;

public class MainE {
    public static void main(String[] args) {
        ProcessoE p1 = new ProcessoE(1);
        ProcessoE p2 = new ProcessoE(2);
        ProcessoE p3 = new ProcessoE(3);

        p1.start();
        p2.start();
        p3.start();
    }
}
