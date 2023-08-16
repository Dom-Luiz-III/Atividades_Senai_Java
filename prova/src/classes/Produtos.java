package classes;

import java.util.ArrayList;

public class Produtos {
	String nome;
	double custCompra;
	int estoque;
	Categoria categorias;
	double precoVendas;

	private Produtos(String nome, double custCompra, Categoria categoria) {
		this.nome = nome;
		this.custCompra = custCompra;
		this.estoque = 0;
		this.categorias = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getCustCompra() {
		return custCompra;
	}

	public void setCustCompra(double custCompra) {
		this.custCompra = custCompra;
	}

	public int getEstoque() {
		return estoque;
	}

	public void setEstoque(int estoque) {
		this.estoque = estoque;
	}

	public double precoVenda(double custo) {
		double precoVendas = custo + (custo * (categorias.getPorcent() / 100));
		return precoVendas;
	}

	public static void cadastrarProduto(Scanner input, List<Produtos> Produtoe, List<Categoria> categoriaL) {

		String Nome;
		String NomeCategoria;
		Double CustCompra;

		boolean categoriaexiste = false;

		System.out.println("Informe o nome do produto:");
		Nome = input.next().toUpperCase();
		System.out.println("Informe o nome da categoria:");
		NomeCategoria = input.next().toUpperCase();

		for (Categoria VerificaK : categoriaL) {
			if (VerificaK.getNome().equals(NomeCategoria)) {
				System.out.println("Informe o valor do produto:");
				CustCompra = input.nextDouble();
				categoriaexiste = true;
				Produtos produtoY = new Produtos(Nome, CustCompra, VerificaK);
				Produtoe.add(produtoY);
				break;
			}
		}

		if (categoriaexiste == false) {

			System.out.println("Não Existe a categoria digitada");

		}
	}

	public static void excluirProduto(Scanner input, List<Produtos> Produtoe) {
		String NomeP;

		boolean produtoexiste = false;
		System.out.println("Informe o nome do produto que deseja excluir:");
		NomeP = input.next().toUpperCase();
		for (Produtos produtoK : Produtoe) {
			if (produtoK.getNome().equals(NomeP)) {
				produtoexiste = true;
				Produtoe.remove(produtoK);
				System.out.println("Produto excluído!");
			}
		}

		if (produtoexiste == false) {

			System.out.println("O produto digitado não existe");

		}
	}

	public static void adEstoque(Scanner input, List<Produtos> adicionarP) {
		String NomeProduto;
		int Estoque;
		
		boolean Produtoexiste = false;
		
		System.out.println("Informe o nome do produto:");
		NomeProduto = input.next().toUpperCase();
		for (Produtos adicionar : adicionarP) {
			if (adicionar.getNome().equals(NomeProduto)) {
				Produtoexiste = true;
				System.out.println("Quanto deseja adicionar ao estoque?");
				Estoque = input.nextInt();
				adicionar.adicionarEstoque(Estoque);

			}

		}
		
		if(Produtoexiste == false) {
			
			System.out.println("Esse produto não Existe.");
			
		}
	}

	public static void RetEstoque(Scanner input, List<Produtos> RetirarP) {
		String NomeProdut;
		int estoque = 0;
		boolean Produtoexiste = false;
		System.out.println("Informe o nome do produto:");
		NomeProdut = input.next().toUpperCase();
		for (Produtos retirar : RetirarP) {
			if (retirar.getNome().equals(NomeProdut)) {
				Produtoexiste = true;
				System.out.println("Quanto deseja remover do estoque?");
				estoque = input.nextInt();
			}
			
			if (estoque < retirar.getEstoque() && retirar.getNome().equals(NomeProdut)) {

				retirar.removerEstoque(estoque);

			}else	if (estoque > retirar.getEstoque() && retirar.getNome().equals(NomeProdut)) {

				System.out.println("Não foi possível remover o produto, estoque insuficiente.");
			}

		}
		
		
		if(Produtoexiste == false) {
			
			System.out.println("Esse produto não existe");
			
		}
	}
	
	

	public void adicionarEstoque(int Estoque) {
		this.estoque += Estoque;
	}

	public void removerEstoque(int Estoque) {

		this.estoque -= Estoque;
	}

	public String toString() {

		return "  Nome  : " + nome + " , Categoria : " + categorias + ",  Estoque :" + estoque + " ,Preço de Vendas :"
				+ precoVenda(custCompra);

	}

	public Categoria getCategoria() {
		return categorias;
	}

	public void setCategoria(Categoria categoria) {
		this.categorias = categoria;
	}

	public static void exibirProdutos(List<Produtos> Exibir) {
		for (Produtos ExibirP : Exibir) {
			System.out.println("Os produtos cadastrados sao:" + ExibirP);

		}

	}

}
