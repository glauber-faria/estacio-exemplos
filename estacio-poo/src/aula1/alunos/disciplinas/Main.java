package aula1.alunos.disciplinas;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Disciplina poo = new Disciplina(21, "Programação orientada a objetos", 3);
        Disciplina web = new Disciplina(27, "Programação web", 2);
        Disciplina lp = new Disciplina(10, "Logica de programação", 1);

        System.out.println(poo);
        System.out.println(web);
        System.out.println(lp);

        ArrayList<Disciplina> disciplinas1 = new ArrayList<>();
        disciplinas1.add(poo);
        disciplinas1.add(web);




        Aluno gustavo = new Aluno("Gustavo Alves", 1234, disciplinas1);

        System.out.println(gustavo);


        Aluno arthur = new Aluno("Arthur Ricardo", 556, null);
        System.out.println(arthur);

    }
}
