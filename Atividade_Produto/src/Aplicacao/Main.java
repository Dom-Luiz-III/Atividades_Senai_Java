package Aplicacao;

import java.util.Scanner;
import Elementos.Produto;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		String nome;
		double preco;
		System.out.println("Informe quantos produtos deseja cadastrar:");
		int N = sc.nextInt();
		Produto[] produtos_vet = new Produto[N];
		for(int i = 0; i < N; i++) {
			sc.nextLine();
			System.out.println("Informe o nome:");
			nome = sc.nextLine();
			System.out.println("Informe o preco:");
			preco = sc.nextDouble();
			produtos_vet[i] = new Produto(nome, preco);
		}
		System.out.println("Produtos cadastrados:");
		for(Produto item : produtos_vet) {
			System.out.println(item);
		}
		sc.close();
	}
}
