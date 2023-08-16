package Elemento;

public class Estoque {
	public String nome;
	public double preco;
	public int quantidade;

	public double ValorTotalEstoque() {
	
		double valorTotal = preco * quantidade;
		return valorTotal;
		
	}
	
	public void AdicionarProduto(int quantidade) {

		this.quantidade += quantidade;

	}
	
	public boolean RemoverProduto(int quantidade) {
		if (quantidade > this.quantidade) {
			
			System.out.println("Não foi possível cadastrar a quantidade do produto!");
			
			return false;
		}else {
			
			System.out.printf("Foi removido %d do estoque", quantidade, nome);
			
			this.quantidade -= quantidade;
			
			return true;
		}
	}
}

/*
		System.out.println("Informe o nome do produto:\n");
		Estoque.Nome = sc.next();
		System.out.println("Agora, informe o seu preço:\n");
		produto.Preco = sc.nextDouble();
		System.out.println("E agora, o quanto de estoque ele tem:\n");
		produto.Quantidade = sc.hashCode();
		
				System.out.println("======================================");
		System.out.println("       PROGRAMA DE ESTOQUE:");
		System.out.println("\n1 - Novo Estoque");
		System.out.println("\n2 - Remover Estoque");
		System.out.println("\n3 - Mostrar Estoque e valor total");
		System.out.println("======================================");
*/