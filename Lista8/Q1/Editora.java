
public class Editora {
	private String cnpj;
	private String nome;
	private String end;
	private String telefone;

	Editora (String cnpj, String nome, String end, String telefone){
	this.setCnpj(cnpj);
	this.setNome(nome);
	this.setEnd(end);
	this.setTelefone(telefone);
	}

	public String getCnpj() {
	return cnpj;
	}
	public void setCnpj(String cnpj) {
	this.cnpj = cnpj;
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
	public String getTelefone() {
	return telefone;
	}
	public void setTelefone(String telefone) {
	this.telefone = telefone;
	}
}
