package introducao.calculadoraIMC;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peso = scanner.nextInt();
        float altura = scanner.nextFloat();
        CalculadoraIMC calculadora = new CalculadoraIMC(peso, altura);
        System.out.println(calculadora.classificar());
    }
}
