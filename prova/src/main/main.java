package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import classes.Categoria;
import classes.Produtos;

public class main {
	public static void main(String[] args) {

	Scanner input = new Scanner (System.in);
	List<Produtos> produtolista = new ArrayList< Produtos>(); 
	List<Categoria> categorialista = new ArrayList<Categoria>(5);
		int opcao = 0 ; 		
			do { 	
				System.out.println("1. Cadastrar categoria");
				System.out.println("2. Excluir categoria");
				System.out.println("3. Cadastrar produto"); 		
				System.out.println("4. Excluir produto"); 		
				System.out.println("5. Exibir produtos cadastrados"); 	
				System.out.println("6. Adicionar estoque em um produto"); 		
				System.out.println("7. Remover estoque de um produto"); 		
				System.out.println("8. Sair"); 		
				System.out.print("Digite uma opção: "); 		
			    	opcao = input.nextInt(); 	
			    		switch (opcao) { 		
			    		case 1 : Categoria.cadastrarCategoria(input, categorialista);
			    			break;
			    		case 2:
			    				Categoria.excluirCategoria(input, categorialista, produtolista);
			    				break;
			    		case 3:
			    				Produtos.cadastrarProduto(input, produtolista, categorialista);
			    			break;
			    		case 4:
			    				Produtos.excluirProduto(input, produtolista);
			    			break;
			    		case 5:
			    			
			    				Produtos.exibirProdutos(produtolista);
			    			break;
			    		case 6:	
			    				Produtos.adEstoque(input, produtolista);
			    			break;
			    		case 7:
			    				Produtos.RetEstoque(input, produtolista);
			    			break;
			    		case 8:	
			    			System.out.println("Saindo"); 
			    			break;
			    		default: 
			    			System.out.println("Digite um número errado"); 
			    	
			    		}
			}while(opcao!=8);
	}
}
