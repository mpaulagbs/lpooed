
public class Conta {
	private int num;
	private Banco banco;
	private Cliente cliente;
	private double saldo;

	Conta (int num, Banco banco, Cliente cliente, double saldo){
	this.setNum(num);
	this.setBanco(banco);
	this.setCliente(cliente);
	this.setSaldo(saldo);
	}

	public void depositar (double valor) {
	this.setSaldo(this.getSaldo() + valor);
	}

	public void saque (double valor) {
	if (valor > this.getSaldo()) {
	System.out.println("saldo indisponivel");
	} else {
	this.setSaldo(this.getSaldo() - valor);
	}
	}

	public int getNum() {
	return num;
	}
	public void setNum(int num) {
	this.num = num;
	}
	public Banco getBanco() {
	return banco;
	}
	
	public void setBanco(Banco banco) {
	this.banco = banco;
	}
	public Cliente getCliente() {
	return cliente;
	}
	public void setCliente(Cliente cliente) {
	this.cliente = cliente;
	}
	public double getSaldo() {
	return saldo;
	}
	public void setSaldo(double saldo) {
	this.saldo = saldo;
	}
	}

