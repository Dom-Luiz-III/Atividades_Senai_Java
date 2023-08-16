package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import elementos.Produto;
import elementos.Categoria;

public class Main {

	public static void main(String[] args) {
		List <Produto> lista_produtos = new ArrayList<Produto>();
		Scanner sc = new Scanner(System.in);
		Categoria[] categoria = new Categoria[5];
		
		Double lucro = null,custos,valor_venda;
		String nome = null,nome_produto;
		Integer qtd_Estoque;
		int op;
		
		
		System.out.println("Olá!\nBem vindo à Kratos Store!\n");
		
		while (true) {
		System.out.println(				
				"MENU PRINCIPAL\r\n"
				+ "1 - Cadastrar Categoria\r\n"
				+ "2 - Excluir Categoria\r\n"
				+ "3 - Cadastrar Produto\r\n"
				+ "4 - Excluir Produto\r\n"
				+ "5 - Exibir Produtos Cadastrados\r\n"
				+ "6 - Adicionar Estoque a Produto\r\n"
				+ "7 - Remover Estoque de Produto\r\n"
				+ "8 - Sair");

		System.out.println("\nInforme quais opções você quer escolher pelos números:");
		op = sc.nextInt();
		
// Cadastrar Categoria
			if (op == 1) {
	
				sc.nextLine();
				System.out.println("\nInforme o nome da nova categoria:");
				nome = sc.nextLine();
				System.out.println("\nInforme a margem de lucro que você quer ter: ");
				lucro = sc.nextDouble();
				Categoria categoria = new Categoria(nome,lucro);
							
				if(categoria > 5) {
					System.out.println("\nVOCÊ ATINGIU O LIMITE DE CATEGORIAS");
				}

				}
			
// Excluir Categoria
			if (op == 2) {
				Categoria.excluirCategoria();
			}
			
// Cadastrar Produto
			if (op == 3) {
				System.out.println("Informe o nome do seu produto:\n");
				sc.nextLine();
				nome_produto = sc.nextLine();
				System.out.println("Agora, informe o custo dele:\n");
				custos = sc.nextDouble();
				System.out.println("Agora, informe a sua categoria:\n");
				// neh
				System.out.println("Agora, informe o seu estoque:\n");
				qtd_Estoque = sc.nextInt();
				Produto produto = new Produto(nome_produto,custos,qtd_Estoque, null);
			}
			
// Excluir Produto
			if (op == 4) {
				Produto.excluirProduto();
			}
			
// Exibir Produtos Cadastrados
			if (op == 5) {
				System.out.println("\nPRODUTOS CADASTRADOS:");

				for (Produto item : lista_produtos) {
					Produto.exibirProduto();
				}
			}
// Adicionar Estoque a Produto
			if (op == 6) {
				
			}
			
// Remover Estoque de Produto
			if (op == 7) {
				
			}
			
			
// Sair
			if (op == 8) {
				System.out.println("PROGRAMA ENCERRADO!");
				sc.close();
				break;
			}
			
// Outros
			else {
				System.out.println("NÃO EXISTE ESSA OPÇÃO!\n");
			}
		}
	}
}