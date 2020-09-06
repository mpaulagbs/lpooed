
public class Gerenciamento {
	private String numeroconta;
	private String agencia;
	private String nomecliente;
	private double saldo;
	private String cpf;

	public Gerenciamento(String numeroconta, String agencia, String nomecliente, double saldo, String cpf) {
		this.numeroconta = numeroconta;
		this.agencia = agencia;
		this.nomecliente = nomecliente;
		this.saldo = saldo;
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNumeroconta() {
		return numeroconta;
	}

	public void setNumero_conta(String numeroconta) {
		this.numeroconta = numeroconta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public String getNomecliente() {
		return nomecliente;
	}

	public void setNomecliente(String nomecliente) {
		this.nomecliente = nomecliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
