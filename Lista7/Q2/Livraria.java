import java.util.ArrayList;

public class Livraria {
	private String nome;
	private String codigo;
	private String preco;
	private int quant;

	public Livraria(String nome, String codigo, String preco, int quant) {
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
		this.quant = quant;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getPreco() {
		return preco;
	}

	public void setPreco(String preco) {
		this.preco = preco;
	}

	public int getQuant() {
		return quant;
	}

	public void setQuant(int quant) {
		this.quant = quant;
	}
	
}
