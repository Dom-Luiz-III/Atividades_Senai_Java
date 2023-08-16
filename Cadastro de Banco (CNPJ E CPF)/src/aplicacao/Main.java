package aplicacao;

import java.util.Scanner;

import dados.Conta;
import dados.ContaEmpresarial;
import dados.ContaSalario;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Conta pessoa = new Conta("Luiz","1000");
		System.out.println(pessoa);
		pessoa.depositar(4000.0);
		System.out.println(pessoa);
		pessoa.sacar(200.0);
		System.out.println(pessoa);
		
		System.out.println("---------------------------------------------------------------------------------------");
		
		ContaEmpresarial empresa = new ContaEmpresarial("Ótica Especialista", "1001");
		System.out.println(empresa);
		empresa.depositar(100000.0);
		System.out.println(empresa);
		empresa.sacar(200.00);
		System.out.println(empresa);
		
		if(empresa.solicitarEmprestimo(900.0)) {
			System.out.println("Empréstimo aprovado!");
		}
		else {
			System.out.println("Empréstimo negado!");
		}
		System.out.println(empresa);
		
		System.out.println("---------------------------------------------------------------------------------------");

		ContaSalario conta = new ContaSalario("Jessica", "1002", 150.0);
		System.out.println(conta);
		conta.depositar(500.0);
		System.out.println(conta);
		conta.sacar(600.0);
		System.out.println(conta);
		
		if(conta.sacar(100.00)) System.out.println("Saque Realizado!");
		else System.out.println("Saque negado!");

		sc.close();
	}
}