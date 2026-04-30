package aula1.alunos.disciplinas;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
    public String nome;
    public Integer matricula;
    public List<Disciplina> disciplinas = new ArrayList<>();

    public Aluno(String nome, Integer matricula, ArrayList<Disciplina> disciplinas) {
        this.nome = nome;
        this.matricula = matricula;
        this.disciplinas = disciplinas;

        if(disciplinas == null){
            System.out.println("Aluno não matriculado - Adicionando disciplinas default");
            this.disciplinas = disciplinasDefault();
        }
    }

    public List<Disciplina> disciplinasDefault(){
        List<Disciplina> discDefault = new ArrayList<>();
        Disciplina disciplina1 = new Disciplina(123, "Programação em nuvem", 1);
        Disciplina disciplina2 = new Disciplina(11, "Sistemas operacionais", 5);

        discDefault.add(disciplina1);
        discDefault.add(disciplina2);

        return discDefault;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", disciplinas=" + disciplinas +
                '}';
    }
}
