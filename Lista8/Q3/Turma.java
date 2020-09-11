import java.util.ArrayList;

public class Turma {
	private String codigo;
    private String nome_turma;
    private ArrayList<Aluno> aluno;

    public Turma(String codigo, String nome_turma, ArrayList<Aluno> aluno) {

        this.codigo = codigo;
        this.nome_turma = nome_turma;
        this.aluno = aluno;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome_turma() {
        return nome_turma;
    }

    public void setNome_turma(String nome_turma) {
        this.nome_turma = nome_turma;
    }

    public ArrayList<Aluno> getAluno() {
        return aluno;
    }

    public void setAluno(ArrayList<Aluno> aluno) {
        this.aluno = aluno;
    }

}
