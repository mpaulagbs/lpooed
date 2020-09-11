
public class Aluno {
	private String nome;
    private String matricula;
    private double nota_1;
    private double nota_2;
    private double nota_3;
    private double nota_4;

    public Aluno(String nome, String matricula, double nota_1, double nota_2, double nota_3, double nota_4) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota_1 = nota_1;
        this.nota_2 = nota_2;
        this.nota_3 = nota_3;
        this.nota_4 = nota_4;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public double getNota_1() {
        return nota_1;
    }

    public void setNota_1(double nota_1) {
        this.nota_1 = nota_1;
    }

    public double getNota_2() {
        return nota_2;
    }

    public void setNota_2(double nota_2) {
        this.nota_2 = nota_2;
    }

    public double getNota_3() {
        return nota_3;
    }

    public void setNota_3(double nota_3) {
        this.nota_3 = nota_3;
    }

    public double getNota_4() {
        return nota_4;
    }

    public void setNota_4(double nota_4) {
        this.nota_4 = nota_4;
    }
}
