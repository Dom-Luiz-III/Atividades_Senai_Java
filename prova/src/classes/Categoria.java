package classes;

import java.util.List;
import java.util.Scanner;

public class Categoria {
	private String nome;
	private double porcent;

	private Categoria(String nome, double porcent) {
		this.nome = nome;
		this.porcent = porcent;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPorcent() {
		return porcent;
	}

	public void setPorcent(double porcent) {
		this.porcent = porcent;
	}

	public String toString() {
		return nome;
	}

	public static void cadastrarCategoria(Scanner input, List<Categoria> categorias) {

		System.out.println("Informe o nome da categoria :");
		String nome = input.next().toUpperCase();
		System.out.println("Informe a porcentagem da Categorias :");
		double porcent = input.nextDouble();

		Categoria categoriasY = new Categoria(nome, porcent);
		categorias.add(categoriasY);
	}

	public static void excluirCategoria(Scanner input, List<Categoria> categoriasE, List<Produtos> produtoE) {

		String NomeC;

		System.out.println("Informe o nome da categoria que deseja excluir :");
		NomeC = input.next().toUpperCase();

		boolean VerificarCat = false;
		boolean VerificarProd = false;

		for (Categoria Verifica : categoriasE) {
			if (Verifica.getNome().equals(NomeC)) {
				VerificarCat = true;
				break;
			}

		}
		for (Produtos VerificaP : produtoE) {

			if (VerificaP.getCategoria().getNome().equals(NomeC)) {
				VerificarProd = true;
				break;
			}

		}
		for (Categoria VerificaC : categoriasE) {
			if (VerificaC.getNome().equals(NomeC) && VerificarProd == false && VerificarCat == true) {
				categoriasE.remove(VerificaC);
				break;
			}
		}

		if (VerificarCat == false) {

			System.out.println("Essa categoria não existe");
		}

		for(Produtos VerificarH : produtoE) {
		
		if (VerificarProd == true && VerificarH.getCategoria().getNome().equals(NomeC)) {
			
			System.out.println("\nEssa categoria contém um produto: ");
			
			System.out.println("\nProdutos : " + VerificarH);
			
			
			
			}
		}

	}
	
	

}
	
