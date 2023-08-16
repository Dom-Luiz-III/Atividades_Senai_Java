package Aplicacao;

import java.util.Scanner;
import Elementos.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N;
		String nome;
		double preco;
		
		System.out.println("Informe a quantidade de produtos: ");
		N = sc.nextInt();
		
		Produto[] produtos_vet = new Produto[N];
			for(int i = 0;i < N;i++) {
				System.out.println("Informe o nome: ");
				nome = sc.nextLine();
				sc.nextLine();
				System.out.println("Informe o preço: ");
				preco = sc.nextDouble();
				produtos_vet[i] = new Produto(nome,preco);
			}
			double soma = 0;
			for(Produto item : produtos_vet) {
				soma += item.getPreco();
			}
			soma /= N;
			System.out.printf("Valor médio: %.2f" , soma);
			sc.close();
		}
	}
	
	
	/*
	System.out.println("Informe a quantidade para adicionar:");
	produtoX.AdicionarProduto(sc.nextInt());
	System.out.println("Nome: "+ produtoX.nome);
	System.out.println("Preço: R$ "+ produtoX.preco);
	System.out.println("Quantidade: "+ produtoX.quantidade + "unidades");
	System.out.println("O valor TOTAL: R$ "+ produtoX.ValorTotalEstoque());
	
	System.out.println("Informe a quantidade para remover:");
	produtoX.RemoverProduto(sc.nextInt());
	System.out.println("Nome: "+ produtoX.nome);
	System.out.println("Preço: R$ "+ produtoX.preco);
	System.out.println("Quantidade: "+ produtoX.quantidade + "unidades");
	System.out.println("O valor TOTAL: R$ "+ produtoX.ValorTotalEstoque());
	
	-----------------------------------------------------------------------------------
			Scanner sc = new Scanner (System.in);
	String nomeP;
	double precoP;
	int quantidadeP;
	Produto produtoX;
	
	
	System.out.println("Informe o nome do produto a ser adicionado:");
	nomeP = sc.nextLine();
	System.out.println("Informe o preço do produto:");
	precoP = sc.nextDouble();
	System.out.println("Informe a quantidade do produto:");
	quantidadeP = sc.nextInt();
	produtoX = new Produto(nomeP, precoP, quantidadeP);
	sc.nextLine();
	System.out.println("Informe o novo nome do produto:");
	produtoX.setNome(sc.nextLine());
	
	System.out.println("Nome: "+ produtoX.getNome());
	System.out.println("Preço: R$ "+ produtoX.getPreco());
	System.out.println("Quantidade: "+ produtoX.getQuantidade() + "unidades");
	System.out.println("O valor TOTAL: R$ "+ produtoX.ValorTotalEstoque());
	
	----------------------------------------------------------------------------------
			
		Produto[] produto = new Produto[4];
		
		produto[0] = new Produto("Beterraba",6,62);
		produto[1] = new Produto("Café",9.5,100);
		produto[2] = new Produto("Whisky",120,22);
		produto[3] = new Produto("Charuto",210,100);

		
		for(Produto lista : produto) {
			
			System.out.printf("Nome: %s   Preço: %.2f\n" , lista.getNome() , lista.getPreco());
		
	*/
