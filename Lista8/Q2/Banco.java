
public class Banco {
	private int numagencia;
	private String nomeagencia;

	Banco (int numagencia, String nomeagencia){
	this.setNumagencia(numagencia);
	this.setNomeagencia(nomeagencia);
	}

	public int getNumagencia() {
	return numagencia;
	}
	public void setNumagencia(int numagencia) {
	this.numagencia = numagencia;
	}
	public String getNomeagencia() {
	return nomeagencia;
	}
	public void setNomeagencia(String nomeagencia) {
	this.nomeagencia = nomeagencia;
	}
	}
