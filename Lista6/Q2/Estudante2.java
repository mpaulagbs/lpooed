import java.util.ArrayList;

 	public class Estudante2 {
 		
	 String nome;
	 String matricula;
	 double nota1;
	 double nota2;
	 
	 public Estudante2(String n, String mat, double nota1, double nota2) {
	  this.nome = n;
	  this.matricula = mat;
	  this.nota1 = nota1;
	  this.nota2 = nota2;
	 }
	 public void setNome(String nome) {
	  this.nome = nome;
	 }
	 public String getNome() {
	  return this.nome;
	 }
	 public void setMatricula(String matricula) {
	  this.matricula = matricula;
	 }
	 public String getMatricula() {
	  return this.matricula;
	 }
	 public void setNota1(double n1) {
	  this.nota1 = n1;
	 }
	 public double getNota1() {
	  return this.nota1;
	 }
	 public void setNota2(double n2) {
	  this.nota2 = n2;
	 }
	 public double getNota2() {
	  return this.nota2;
	 }
	 public void nome_matricula(ArrayList<Estudante2> lista, String matricula) {
	  for(int x = 0; x < lista.size(); x++) {
	   if(matricula.equals(lista.get(x).getMatricula())) {
	    System.out.println(lista.get(x).getNome());
	   }
	  }
	 }
	 public double getMedia() {
		 
	  return (this.nota1 + this.nota2)/2;
	 }
	}