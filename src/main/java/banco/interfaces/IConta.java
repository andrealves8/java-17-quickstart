package banco.interfaces;

import banco.classes.Conta;

public interface IConta {

    public void depositar(double valor);

    public void sacar(double valor);

    public void transferir(double valor, Conta contaDestino);

    public void imprimirExtrato();
    
    public void creditos();

}