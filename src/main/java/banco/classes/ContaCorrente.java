package banco.classes;

import java.util.HashMap;

public class ContaCorrente extends Conta {
	private static final String DEBITO = "d";
	private static final String CREDITO = "c";

	HashMap<String, Double> transacoes = new HashMap<>();

	public ContaCorrente(Cliente cliente) {
		super(cliente);
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
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("********** Extrato conta corrente **********");
		super.imprimirInfosComuns();
	}
	


	@Override
	public void creditos() {
		System.out.println(String.format("$ c_c: %.2f", transacoes.getOrDefault(CREDITO, 0.0)) + CREDITO);

	}

	public void debitos() {
		System.out.println(String.format("$ c_c: %.2f", transacoes.getOrDefault(DEBITO, 0.0)) + DEBITO);
	}

}
