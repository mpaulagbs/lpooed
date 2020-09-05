
public class Retangulo2 {
	private double base;
	private double altura;
	
	public Retangulo2 (double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	
	public double getBase() {
		return this.base;
	}
	public void setBase (double base) {
		this.base = base;
	}
	public double getAltura() {
		return this.altura;
	}
	public void setAltura (double altura) {
		this.altura = altura;
	}
	public double getPerimetro() {
		return (2*base) + (2*altura);
	}
	public double getArea() {
		return base * altura; 
	}
}
