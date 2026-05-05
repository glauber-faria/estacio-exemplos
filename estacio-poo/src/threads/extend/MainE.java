package threads.extend;

public class MainE {
    public static void main(String[] args) {
        threads.extend.ProcessoE p1 = new threads.extend.ProcessoE(1);
        threads.extend.ProcessoE p2 = new threads.extend.ProcessoE(2);
        threads.extend.ProcessoE p3 = new threads.extend.ProcessoE(3);

        p1.start();
        p2.start();
        p3.start();
    }
}
