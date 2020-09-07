import java.util.ArrayList;

public class Livraria2 {
	
	 private String nome;
	    private String nome_cidade;
	    private String nome_estado;
	    private String nome_gerente;
	    private ArrayList<Livro3> livro;
	    private ArrayList<Funcionario> funcionario;

	    public Livraria2(String nome, String nome_cidade, String nome_estado, String nome_gerente, ArrayList<Livro3> livro,
	            ArrayList<Funcionario> funcionario) {

	        this.nome = nome;
	        this.nome_cidade = nome_cidade;
	        this.nome_estado = nome_estado;
	        this.nome_gerente = nome_gerente;
	        this.livro = livro;
	        this.funcionario = funcionario;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public void setNome(String nome) {
	        this.nome = nome;
	    }

	    public String getNome_cidade() {
	        return nome_cidade;
	    }

	    public void setNome_cidade(String nome_cidade) {
	        this.nome_cidade = nome_cidade;
	    }

	    public String getNome_estado() {
	        return nome_estado;
	    }

	    public void setNome_estado(String nome_estado) {
	        this.nome_estado = nome_estado;
	    }

	    public String getNome_gerente() {
	        return nome_gerente;
	    }

	    public void setNome_gerente(String nome_gerente) {
	        this.nome_gerente = nome_gerente;
	    }

	    public ArrayList<Livro3> getLivro() {
	        return livro;
	    }

	    public void setLivro(ArrayList<Livro3> livro) {
	        this.livro = livro;
	    }

	    public ArrayList<Funcionario> getFuncionario() {
	        return funcionario;
	    }

	    public void setFuncionario(ArrayList<Funcionario> funcionario) {
	        this.funcionario = funcionario;
	    }

	}
