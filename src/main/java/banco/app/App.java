package banco.app;

import banco.classes.Cliente;
import banco.classes.Conta;
import banco.classes.ContaCorrente;
import banco.classes.ContaPoupanca;

public class App {

    public static void main(String[] args) {
    	
    	String nome = "André Alves";
    	String cpf = "023.756.888-90";
    	
        Cliente cli = new Cliente(nome, cpf);

        Conta cc = new ContaCorrente(cli);
        Conta cp = new ContaPoupanca(cli);

        // métodos de operações bancárias
        cp.depositar(100);
        cc.depositar(100);
        cc.transferir(100, cp);
        cp.transferir(100, cc);
        
        // método de impressão de extrato
        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }

}