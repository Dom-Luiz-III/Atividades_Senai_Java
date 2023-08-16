package elementos;

public class Produto {
	private String nome_produto;
	private Double custos;
	private Integer qtd_Estoque;
	private Categoria categoria;
	
	public Double valor_venda;
	
	public Produto(String nome_produto, Double custos, Integer qtd_Estoque,Categoria nome_categoria) {
		this.nome_produto = nome_produto;
		this.custos = custos;
		this.qtd_Estoque = qtd_Estoque;
		this.categoria = nome_categoria;
	}
	
	public Double precoVenda() {
	valor_venda = custos * categoria.porcentagem;
		return valor_venda;
	}
	
	public static Produto cadastrarProduto() {
		
		return null;
	}
	
	public static Produto excluirProduto() {
		return null;
	}
	
	public static Produto exibirProduto() {
		return 	System.out.println(toString());
	}
	
	public String getNome_produto() {
		return nome_produto;
	}
	public void setNome_produto(String nome_produto) {
		this.nome_produto = nome_produto;
	}
	public Double getCustos() {
		return custos;
	}
	public void setCustos(Double custos) {
		this.custos = custos;
	}
	public Integer getQtd_Estoque() {
		return qtd_Estoque;
	}
	public void setQtd_Estoque(Integer qtd_Estoque) {
		this.qtd_Estoque = qtd_Estoque;
	}
	public Categoria getcategoria() {
		return getcategoria();
	}
	public void setNome_categoria(Categoria nome_categoria) {
		this.categoria = nome_categoria;
	}
	
	public String toString() {
		return 
			"\nPRODUTO: " + nome_produto  +
				categoria.toString() +
				qtd_Estoque + "\nEM ESTOQUE" +
				"PREÇO DE VENDA" + valor_venda;	
	}
}
