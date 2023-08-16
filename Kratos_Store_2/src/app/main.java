package app;

import java.util.List;
import java.util.Scanner;

import repositories.CategoriaRepository;
import repositories.IRepository;
import repositories.PedidoRepository;
import repositories.ProdutoRepository;
import entities.Categoria;
import entities.Produto;

public class main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		IRepository categoria_repository = new CategoriaRepository();
		// Você deve instanciar os objetos ProdutoRepository e PedidosRepository
		IRepository produtos_repository = new ProdutoRepository();
		IRepository pedidos_repository = new PedidoRepository();
		int operacao = 10;
		// Você deve realizar o tratamento das exceções geradas por entradas inconsistentes de dados fornecidos pelo usuário
		do {
			operacao = menuPrincipal(sc);
			switch(operacao){
			case 1:
				sc.nextLine();
				System.out.println("INFORME O NOME DA SUA CATEOGRIA:");
				String nome = sc.nextLine();
				System.out.println("INFORME QUAL A ADICIONAL VOCÊ VAI COLOCAR NELE:");
				Double adicional = sc.nextDouble();
				Categoria categoria = new Categoria(nome,adicional);

				break;
			case 2:
				System.out.println("LISTA DE CATEOGRIAS:");
				categoria_repository.listar();
				break;
			case 3:
				categoria_repository.excluir(categoria_repository);
				System.out.println("CATEGORIAS EXCLUÍDAS!");
				break;
			case 4:
				sc.nextLine();
				System.out.println("INFORME O NOME DO PRODUTO:");
				nome = sc.nextLine();
				System.out.println("INFORME O CUSTO DELE:");
				Double custo = sc.nextDouble();
				sc.nextLine();
				System.out.println("INFORME A SUA CATEGORIA:");
				String cate = sc.nextLine();
				
				Produto produto = new Produto(nome,custo,cate);
				break;
			case 5:
				System.out.println("LISTA DE PRODUTOS:");
				produtos_repository.listar();
				break;
			case 6:
				produtos_repository.excluir(produtos_repository);
				System.out.println("PRODUTOS EXCLUÍDOS!");

				break;
			case 7:
				// Implemente a lógica da operação 7 aqui
				break;
			case 8:
				System.out.println("LISTA DE PEDIDOS:");
				pedidos_repository.listar();
				break;
			case 9:
				pedidos_repository.excluir(pedidos_repository);
				System.out.println("PEDIDOS EXCLUÍDOS!");
				break;
			}
			
			
			
		} while (operacao != 10);
		
		System.out.println("PROGRAMA ENCERRADO!");
		sc.close();
	}
	
	public static int menuPrincipal(Scanner sc) {
		int acao;
		System.out.println("-----MENU PRINCIPAL-----");
		System.out.println("1 - CADASTRAR CATEGORIA");
		System.out.println("2 - LISTAR CATEGORIAS");
		System.out.println("3 - EXCLUIR CATEGORIAS");
		System.out.println("4 - CADASTRAR PRODUTO");
		System.out.println("5 - LISTAR PRODUTO");
		System.out.println("6 - EXCLUIR PRODUTO");
		System.out.println("7 - CADASTRAR PEDIDO");
		System.out.println("8 - LISTAR PEDIDO");
		System.out.println("9 - EXCLUIR PEDIDO");
		System.out.println("10 - SAIR");
		System.out.println("Escolha uma operação: ");
		acao = sc.nextInt();
		if (acao > 0 && acao <= 10)
			return acao;
		else {
			throw new IllegalArgumentException("Operação inválida");
		}
		
		/*
		public static void cadastrarCategoria(Scanner input, List<Categoria> categorias) {

			System.out.println("Informe o nome da categoria :");
			String nome = input.next().toUpperCase();
			System.out.println("Informe a porcentagem da Categorias :");
			double porcent = input.nextDouble();

			Categoria categoriasY = new Categoria(nome, porcent);
			categorias.add(categoriasY);
		}
		*/
	}
	

}
