package entities;

public class Produto extends AbstractEntity{
	private String nome;
	private Double custo;
	Categoria categoria;
	
	
	public Produto(String nome, Double custo, Categoria categoria) {
		this.nome = nome.toUpperCase();
		this.custo = custo;
		this.categoria = categoria;
	}

	public Double CalcularValorVenda() {
		
		Double valor = custo + categoria.getAdicional();
		custo = custo + valor;
		return custo;
	}
	
	public String getNome() {
		return nome.toUpperCase();
	}

	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}

	public Double getCusto() {
		return custo;
	}

	public void setCusto(Double custo) {
		
		if(custo > 0) {
			this.custo = custo;
		} 
		else {
			throw new IllegalArgumentException("O custo não pode ser no valor negativo!");
		}
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		
		return 
				  "Nome: " + nome +
				"\nCusto: " + custo +
				"\nCategoria: " + categoria +
				   CalcularValorVenda() +
				"\nValor de venda do produto: " + custo;
	}

}