package classes;

import java.util.Random;

public class Conta {
	private int agencia;
	private String numeroConta;
	private double saldo;

	public Conta() {
	}

	public Conta(int agencia, String numeroConta, double saldo) {
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;

	}

	public void criarConta() {
		Random random = new Random();
		int min = 1000, max = 99999;
		String numeroGerado = String.valueOf(random.nextInt((max - min) + 1) + min);
		String p1 = numeroGerado.substring(0, 4);
		String p2 = numeroGerado.substring(4);
		this.numeroConta = p1 + "-" + p2;
	}

	public void depositar(double valor) {
		saldo += valor;
	}

	public void sacar(double valor) {
		saldo -= valor;
	}

	public void transferir(double valor, String numeroConta) {
		sacar(valor);
		depositar(valor);
	}

	public String getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}

}
