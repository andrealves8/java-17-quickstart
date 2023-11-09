package banco.app;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import banco.classes.Cliente;
import banco.classes.Conta;
import banco.classes.ContaCorrente;
import banco.classes.ContaPoupanca;

public class Main {

	public static void main(String[] args) {
		
		// TODO 
		// 1 - Gerar conta com nome, cpf, data de nascimento, agencia e conta.
		
		String nome = "André Alves";
		String cpf = "023.756.888-90";
		String dataNascimento = "11/04/1987";

		/*
		 * Esse bloco de código a seguir é responsável pela criação de um objeto do tipo
		 * LocalDate e formata para o padrão dd/MM/yyyy
		 */
		LocalDate dtNasc = LocalDate.parse(dataNascimento, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		DateTimeFormatter dataFormatada = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		dtNasc.format(dataFormatada);
		
		Cliente cli = new Cliente(nome, cpf, dataNascimento);
		System.out.println(cli.toString());

		Conta cc = new ContaCorrente(cli);
		Conta cp = new ContaPoupanca(cli);

		// Métodos básicos de operações bancárias
		cp.depositar(100);
		cc.depositar(100);
		cc.transferir(100, cp);
		cp.transferir(100, cc);

		// Método de impressão de extrato
		cc.imprimirExtrato();
		cp.imprimirExtrato();
	}

}