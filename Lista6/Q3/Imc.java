
	public class Imc {
	String nome;
	double peso;
	double altura;
	
	public Imc(String n, double p, double a) {
		  this.nome = n;
		  this.peso = p;
		  this.altura = a;
		 }
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	public double getImc() {
		return (peso/(altura*altura));
	}
}
