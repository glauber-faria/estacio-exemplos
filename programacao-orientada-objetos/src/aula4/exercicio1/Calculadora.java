package aula4.exercicio1;

public class Calculadora {
    public int adicao(int x, int y){
        return x + y;
    }
    public int subtracao(int x, int y){
        return x - y;
    }
    public int divisao(int x, int y){
        try {
            return x/y;
        }catch (ArithmeticException exception){
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            System.out.println("!!!!!!!! Não é possivel dividir por zero !!!!!!!!!!!!!");
            System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
            return 0;
        }
    }
    public int multiplicacao(int x, int y){
        return x * y;
    }
}
