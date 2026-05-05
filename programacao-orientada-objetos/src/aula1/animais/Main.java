package aula1.animais;

public class Main {
    public static void main(String[] args) {
        Animal gato = new Animal("gato", 5, true);
        Animal cachorro = new Animal("cachorro", 1, true);

        gato.emitirSom();
        cachorro.emitirSom();
    }

}
