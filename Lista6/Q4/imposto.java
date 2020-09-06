import java.util.ArrayList;

public class imposto {
	String nome;
	double salario;
	
	public imposto(String n, double s) {
		  this.nome = n;
		  this.salario = s; 
		 }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
