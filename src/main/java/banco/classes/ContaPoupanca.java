package banco.classes;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
        super.saldo = 10;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        super.transferir(valor, contaDestino);
        super.saldo -= 0.1;

    }

    @Override
    public void imprimirExtrato() {
        System.out.println("*** Extrato conta poupança ***");
        super.imprimirInfosComuns();
    }

}
