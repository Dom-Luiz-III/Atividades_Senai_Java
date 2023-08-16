package Aplicação;

import java.util.Scanner;

import Elemento.Estoque;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Estoque produto = new Estoque();
		
		System.out.println("Informe o nome do produto:\n");
		produto.nome = sc.nextLine();
		System.out.println("Agora, informe o seu preço:\n");
		produto.preco = sc.nextDouble();
		System.out.println("E agora, o quanto de estoque ele tem:\n");
		produto.quantidade = sc.nextInt();
		sc.close();
		
		System.out.println("Nome: " + produto.nome);
		System.out.println("Preço: R$" + produto.preco);
		System.out.println("Quantidade: " + produto.quantidade);
		System.out.println("Valor TOTAL: R$" + produto.ValorTotalEstoque());

		System.out.println("Informe a quantidade para adicionar:\n");
		produto.AdicionarProduto(sc.nextInt());
		System.out.println("Informe a quantidade para remover:\n");
		produto.RemoverProduto(sc.nextInt());
	}
}