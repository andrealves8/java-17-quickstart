package banco.app;

import banco.classes.Cliente;
import banco.classes.Conta;
import banco.classes.ContaCorrente;
import banco.classes.ContaPoupanca;

public class App {

    public static void main(String[] args) {
        Cliente cli = new Cliente();
        cli.setNome("André Alves");
        cli.setCpf("023.756.888-90");

        Conta cc = new ContaCorrente(cli);
        Conta cp = new ContaPoupanca(cli);

        // métodos de operações bancárias
        cp.depositar(200);
        cp.transferir(100, cc);

        // método de impressão de extrato
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}