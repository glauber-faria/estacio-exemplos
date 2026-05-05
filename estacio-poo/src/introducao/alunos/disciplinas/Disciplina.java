package introducao.alunos.disciplinas;

public class Disciplina {
    public Integer id;
    public String nome;
    public Integer periodo;

    public Disciplina(Integer id, String nome, Integer periodo) {
        this.id = id;
        this.nome = nome;
        this.periodo = periodo;
    }

    @Override
    public String toString() {
        return "Disciplina{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", periodo=" + periodo +
                '}';
    }
}
