
public class Funcionarios1 {
	
	private String nomeFunc;
	private double salarioFunc;
	
	public Funcionarios1(String nomeFunc, double salarioFunc) {
		this.nomeFunc = nomeFunc;
		this.salarioFunc = salarioFunc;
		
	}
	
	public String getnomeFunc() {
		return this.nomeFunc;
	}
	
	public void setnomeFunc(String nomeFunc) {
		this.nomeFunc = nomeFunc;
	}
	
	public double getsalarioFunc() {
		return this.salarioFunc;
	}
}
