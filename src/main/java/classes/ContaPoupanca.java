package classes;

public class ContaPoupanca extends Conta {

	public ContaPoupanca(int agencia, String numeroConta, double saldo) {
		super(agencia, numeroConta, saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void criarConta() {
		// TODO Auto-generated method stub
		super.criarConta();
		super.setSaldo(10);
	}

	@Override
	public void depositar(double valor) {
		// TODO Auto-generated method stub
		super.depositar(valor);
	}

	@Override
	public void sacar(double valor) {
		// TODO Auto-generated method stub
		super.sacar(valor);
	}
	
	@Override
	public void transferir(double valor, String numeroConta) {
		// TODO Auto-generated method stub
		super.transferir(valor, numeroConta);
		sacar(valor);
		
	}

}
