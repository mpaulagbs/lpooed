
public class Carro {
	double eficiencia;
	double combustivel;
	
	public Carro(double eficiencia, double combustivel) {
		this.setEficiencia(eficiencia);
		this.setCombustivel(combustivel);
	}

	public double getEficiencia() {
		return eficiencia;
	}

	public void setEficiencia(double eficiencia) {
		this.eficiencia = eficiencia;
	}

	public double getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(double combustivel) {
		this.combustivel = combustivel;
	}
	
	public void andarAutomovel(double quilometragem) {
		this.combustivel = this.combustivel - (quilometragem/this.eficiencia);
	}
	
	public void reabastecer(double reabastecimento) {
		this.combustivel = this.combustivel + reabastecimento;
	}
	
}
