package aula4.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o valor de x");
        int x = scanner.nextInt();
        System.out.println("Digite o valor de y");
        int y = scanner.nextInt();

        Calculadora calculadora = new Calculadora();

        int adicao = calculadora.adicao(x, y);
        System.out.println("Adição: " + adicao);

        int subtracao = calculadora.subtracao(x, y);
        System.out.println("Subtração: " + subtracao);

        int multiplicao = calculadora.multiplicacao(x, y);
        System.out.println("Multiplicação: " + multiplicao);

        int divisao = calculadora.divisao(x, y);
        System.out.println("Divisão: " + divisao);
    }
}
