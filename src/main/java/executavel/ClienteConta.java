package executavel;

import classes.Conta;
import classes.ContaCorrente;
import classes.ContaPoupanca;

public class ClienteConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta cp = new ContaPoupanca(1020, null, 0);
		cp.criarConta();

		System.out.println("Conta Poupança * Agência: " + cp.getAgencia() + " * Conta: " + cp.getNumeroConta());
		System.out.println("Saldo Anterior: " + cp.getSaldo());
		cp.depositar(100);
		cp.sacar(0);
		cp.transferir(20, null);
		System.out.println("Saldo Atual: " + cp.getSaldo());

		System.out.println("----------------------------------------");
		
		Conta cc = new ContaCorrente(1020, null, 0);
		cc.criarConta();

		System.out.println("Conta Corrente * Agência: " + cc.getAgencia() + " * Conta: " + cc.getNumeroConta());
		System.out.println("Saldo Anterior: " + cc.getSaldo());
		cc.depositar(100);
		cc.sacar(0);
		System.out.println("Saldo Atual: " + cc.getSaldo());

	}

}
