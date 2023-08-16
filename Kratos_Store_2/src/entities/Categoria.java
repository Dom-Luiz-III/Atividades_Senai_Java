package entities;

public class Categoria extends AbstractEntity{
	private String nome;
	private Double adicional;
	
	public Categoria(String nome, Double adicional) {
		this.nome = nome.toUpperCase();
		this.adicional = adicional;
	}
	
	@Override
	public String toString() {
		return "Categoria: " + nome + " - Adicional da categoria: R$ " + (adicional * 100) + " %";
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome.toUpperCase();
	}
	public Double getAdicional() {
		return adicional;
	}
	public void setAdicional(Double adicional) {
		if (adicional > 0 && adicional < 1) {
			this.adicional = adicional;
		}
		else {
			throw new IllegalArgumentException("O adicional da categoria deve ser um número decimal entre 0 e 1");
		}
	}
}
