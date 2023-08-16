package entities;

public class Pedido extends AbstractEntity{
	private String codigo;
	private int quantidade;
	Produto produto;
	
	
	public Pedido(String codigo, int quantidade, Produto produto) {
		super();
		this.codigo = codigo;
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	
	public Double CalcularValorPedido() {
		Double valor = quantidade * produto.CalcularValorVenda();
		valor = quantidade + valor;
		
		return valor;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		if(quantidade > 0) {
		this.quantidade = quantidade;
		}
		else {
			throw new IllegalArgumentException("A quantidade não pode ter valor negativo!");
		}
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	@Override
	public String toString() {

		return 
				  "Código: " + codigo +
				"\nQuantidade: " + quantidade +
				"\nProduto: " + produto +
				CalcularValorPedido() +
				"\nValor total do pedido: ";
	}
	
}
