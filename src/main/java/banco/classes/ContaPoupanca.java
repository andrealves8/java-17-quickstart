package banco.classes;

import java.util.HashMap;

public class ContaPoupanca extends Conta {

	private static final String DEBITO = "d";
	private static final String CREDITO = "c";

	HashMap<String, Double> transacoes = new HashMap<>();

	public ContaPoupanca(Cliente cliente) {
		super(cliente);
		super.saldo = 10;
	}

	@Override
	public void depositar(double valor) {
		super.depositar(valor);
		transacoes.put(CREDITO, valor);
		creditos();
	}

	@Override
	public void sacar(double valor) {
		super.sacar(valor);
		transacoes.put(DEBITO, valor);
		debitos();
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		super.transferir(valor, contaDestino);
		super.saldo -= 0.1;
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("********** Extrato conta poupança ***********");
		super.imprimirInfosComuns();
		
	}
	
	public void creditos() {
		System.out.println(String.format("Cc: %.2f", transacoes.getOrDefault(CREDITO, 0.0)) + CREDITO);		
	}

	public void debitos() {
		System.out.println(String.format("Cp: %.2f", transacoes.getOrDefault(DEBITO, 0.0)) + DEBITO);
	}

}
