package banco.classes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import banco.interfaces.IConta;

public abstract class Conta implements IConta {

	GeradorDeContas gerador = new GeradorDeContas();

	private static final int AGENCIA_PADRAO = 332;
	private String numeroConta = gerador.getNumeroGerado();
	protected int agencia;
	protected String numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta() {
	};

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = numeroConta;
		this.cliente = cliente;
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);

	}

	public int getAgencia() {
		return agencia;
	}

	public String getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;

	}

	LocalDateTime dtH = LocalDateTime.now();
	DateTimeFormatter dtHf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	String datHoraFormatada = dtH.format(dtHf);

	protected void imprimirInfosComuns() {
		System.out.println(String.format("%n" + "             " + datHoraFormatada + "%n"));
		System.out.print(String.format("Cliente: %s", this.cliente.getNome()) + "    ");
		System.out.println(String.format("Cpf: %s", this.cliente.getCpf()));
		System.out.print(String.format("Agencia: %d", this.agencia) + "    ");
		System.out.println(String.format("Numero: %s", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
		System.out.println();

	}

}