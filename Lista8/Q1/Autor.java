
public class Autor {
	private String cpf;
	private String nome;
	private String end;

	Autor(String cpf, String nome, String end){
	this.setCpf(cpf);
	this.setNome(nome);
	this.setEnd(end);
	}

	public String getCpf() {
	return cpf;
	}
	public void setCpf(String cpf) {
	this.cpf = cpf;
	}
	public String getNome() {
	return nome;
	}
	public void setNome(String nome) {
	this.nome = nome;
	}
	public String getEnd() {
	return end;
	}
	public void setEnd(String end) {
	this.end = end;
	}
}
