
public class Circulo3 {
	private double r;
	private double perimetro;

	public Circulo3 (double r, double perimetro) {
		this.r = r;
		this.perimetro = perimetro;
		
	}
	
	
	public void setR (double r) {
		this.r = r;
	}
	
	public void setPerimetro(double perimetro) {
		this.perimetro = perimetro;
	}
	public double getR() {
		return (3.14*Math.pow(r, 2));
	}
	public double getPerimetro() {
		return (2*3.14*r);
	}

}
