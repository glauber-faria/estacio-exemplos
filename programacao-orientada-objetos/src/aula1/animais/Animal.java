package aula1.animais;

public class Animal {
    public String nome;
    public String corOlhos;
    public Integer tempoVida;
    public Boolean isPelo;

    public Animal() {
    }

    public Animal(String nome, String corOlhos, Integer tempoVida, Boolean isPelo) {
        this.nome = nome;
        this.corOlhos = corOlhos;
        this.tempoVida = tempoVida;
        this.isPelo = isPelo;
    }

    public Animal(String nome, Integer tempoVida, Boolean isPelo) {
        this.nome = nome;
        this.tempoVida = tempoVida;
        this.isPelo = isPelo;
    }
    public Animal(Jacare jacare) {
        this.nome = jacare.nome;
        this.corOlhos = jacare.corOlhos;
        this.tempoVida = jacare.tempoVida;
        this.isPelo = jacare.isPelo;
    }

    public void emitirSom(){
        if(nome == "cachorro"){
            System.out.println("Au au");
        }
        if(nome == "gato"){
            System.out.println("Miau");
        }
    }


    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", corOlhos='" + corOlhos + '\'' +
                ", tempoVida=" + tempoVida +
                ", isPelo=" + isPelo +
                '}';
    }
}
