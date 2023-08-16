package Aplicacao;

import java.util.Scanner;

import Entidades.Hospede;
import Entidades.Quarto;
import Util.QuartoUtil;

public class Main {

	public static void main(String[] args) {
		Quarto[] quartos = new Quarto[10];
		char opcao;
		Scanner input = new Scanner(System.in);
		while (true) {
			System.out.println("Deseja registrar uma locação? (S/N)");
			opcao = input.next().toUpperCase().charAt(0);
			if (opcao == 'S') {
				int posicao = Quarto.verificarQuartoVazio(quartos);
				if(posicao >= 0) {
					System.out.println("Informe a quantidade de hospedes:(1 a 4)");
					int qtd = input.nextInt();
					quartos[posicao] = new Quarto(qtd);
					for(int x = 0; x < qtd; x++) {
						System.out.println("Informe o nome do hospede: ");
						String nome = input.nextLine();
						input.nextLine();
						System.out.println("Informe a idade do hospede: ");
						Integer idade = input.nextInt();
						System.out.println("Informe o telefone do hospede: ");
						String telefone = input.nextLine();
						input.nextLine();
						quartos[posicao].cadastrarHospede(nome, idade, telefone, x);
					}
					System.out.println("Cadastro realizado! " + posicao);
				}
				else {
					System.out.println("Sem vagas disponíveis!");
				}
			}
			else if (opcao == 'N') {
				break;
			}
			else {
				System.out.println("Opção inválida!");
			}
		}

	}
	
	

}
