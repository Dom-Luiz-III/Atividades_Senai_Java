package Elementos;

public class Produto {
	private String nome;
	private double preco;
	private int quantidade;
	
	public Produto(String nome, double preco, int quantidade) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = quantidade;
	}
	public Produto(String nome, double preco) {
		this.nome = nome;
		this.preco = preco;
		this.quantidade = 0;
	}
	
	
	public double ValorTotalEstoque() {
		double valorTotal = preco * quantidade;
		return valorTotal;
	}
	
	public void AdicionarProduto (int Quantidade) {
		this.quantidade += quantidade;
	}
	
	public boolean RemoverProduto (int Quantidade) {
		if (Quantidade > quantidade) {
			System.out.println("Não foi possível cadastrar a quantidade de produto!");
			return false;
		} else {
			System.out.printf("Foi removido %d %s do estoque.", Quantidade, nome);
			quantidade -= Quantidade; //this.quantidade -= quantidade;
			
			return true;
		}
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidade() {
		return quantidade;
	}

}
