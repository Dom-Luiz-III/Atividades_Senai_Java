package aplicacao;

import java.util.Scanner;
import execucao.Dados;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String nome,horaEntrada,horaSaida;
		int qtd;
		
		System.out.println("Informe quantos trabalhadores vão marcar horário: ");
		qtd = sc.nextInt();
		
		Dados[] pessoa = new Dados[qtd];
		
		for(int i = 0;i < qtd ;i++) {
			System.out.println("Informe o nome do funcionário: ");
			sc.nextLine();
			nome = sc.nextLine();
			System.out.println("Informe o horario de entrada: ");
			horaEntrada = sc.next();
			System.out.println("Informe o horario de saida: ");
			horaSaida = sc.next();
			pessoa[i] = new Dados(nome,horaEntrada,horaSaida);
		}
		sc.close();
		
		for(Dados item : pessoa) {
			System.out.printf("%s trabalhou %s\n", item.getNome(), item.horaEntrada);

		}

	}

}
