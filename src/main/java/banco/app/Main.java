package banco.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import banco.classes.Cliente;
import banco.classes.ContaCorrente;
import banco.classes.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		String nome = "André Alves";
		String cpf = "023.756.888-90";
		String dataNascimento = "11/04/1987";
		String discricao = "coisa e tal...";

		/*
		 * Esse bloco de código a seguir é responsável pela criação de um objeto do tipo
		 * LocalDate e formata para o padrão dd/MM/yyyy
		 */
		LocalDate dtNasc = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		dtNasc.format(dataFormatada);
		
		Cliente cliente1 = new Cliente(nome, cpf, dataNascimento);
		Cliente cliente2 = new Cliente("João", "243.726.188-00", "10/11/1980");

		ContaCorrente cc = new ContaCorrente(cliente1);
		ContaPoupanca cp = new ContaPoupanca(cliente2);

		// Métodos básicos de operações bancárias
		cc.depositar(100);
		cc.depositar(200);
		cc.depositar(120);
		cp.transferir(130, cc);
		cc.sacar(290);
		cp.depositar(160);
	
		// Método de impressão de extrato
		cc.imprimirExtrato();
	    //cp.imprimirExtrato();
	}

}