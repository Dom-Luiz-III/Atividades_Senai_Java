package aplicacao;

import java.util.Scanner;
import elementos.Hospede;
import elementos.Quarto;
import util.QuartoUtil;

public class Main {

	public static void main(String[] args) {
		Quarto[] quartos = new Quarto[10];
		Scanner sc = new Scanner(System.in);
		char opcao;
		
		while (true){
			System.out.println("Deseja registrar uma alocação? (S/N)");
			opcao = sc.next().toUpperCase().charAt(0);
			
			if (opcao == 'S') {
				int posicao = QuartoUtil.VerificaQuartoVazio(quartos);
				if (posicao >= 0){
					System.out.println("Informe a quantidade de hospedes:(1 a 4)");
					int qtd = sc.nextInt();
					quartos[posicao] = new Quarto(qtd);
					for (int x = 0; x < qtd; x++) {
						sc.nextLine();
						System.out.println("Informe o nome do hospede: ");
						String nome = sc.nextLine();
						System.out.println("Informe a idade do hospede: ");
						Integer idade = sc.nextInt();
						sc.nextLine();
						System.out.println("Informe o telefone do hospede: ");
						String telefone = sc.nextLine();
						quartos[posicao].CadastrarHospedes(nome, idade, telefone, x);
					}
					System.out.println("Cadastro Realizado!");
					System.out.println(quartos[0].toString());
					}
				else {
					System.out.println("Sem vagas disponíveis!");
				}
			}
			else if (opcao == 'N'){
				sc.close();
				break;
			}
			else {
				System.out.println("Opção invalida!");
			}
		}
	}
}
