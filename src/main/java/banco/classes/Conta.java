package banco.classes;


import java.util.Random;

import banco.interfaces.IConta;

public abstract class Conta implements IConta {

    Random random = new Random();
    int min = 100000, max = 999999;
    String numeroGerado = String.valueOf(random.nextInt((max - min) + 1) + min);
    String p1 = numeroGerado.substring(0, 5);
    String p2 = numeroGerado.substring(numeroGerado.length() - 1);

    private static final int AGENCIA_PADRAO = 332;
    private String numeroConta = p1 + "-" + p2;

    protected int agencia;
    protected String numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = numeroConta;
        this.cliente = cliente;
    }

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("depositos");

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

    protected void imprimirInfosComuns() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome())
                + " - Cpf: " + this.cliente.getCpf());
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %s", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

}