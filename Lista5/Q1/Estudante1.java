
public class Estudante1 {
	private String nome;
	private String matricula;
	private String end;
	private double [] array = new double[4];
	
	
	public Estudante1(String n, String mat, double [] array, String end) {
		this.nome = n;
		this.matricula = mat;
		this.end = end;
		this.array = array;
	}
	
	public String getNome() {
		return this.nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return this.matricula;
	}
	public String  getEnd() {
		return this.end;
	}
	public void setEnd (String end) {
		this.end = end;
	}
	public double[] getArray() {
		return this.array;
	}
	public void setArray (double [] array) {
		this.array = array;
	}
	public double getMedia() {
		return (array[0] + array[1] + array[2] + array[3])/4;
	}
	
}
