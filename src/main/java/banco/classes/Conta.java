package banco.classes;


import banco.interfaces.IConta;

public abstract class Conta implements IConta {
   
    GeradorDeContas gerador = new GeradorDeContas();

    private static final int AGENCIA_PADRAO = 332;
    private String numeroConta = gerador.getNumeroGerado() ;
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