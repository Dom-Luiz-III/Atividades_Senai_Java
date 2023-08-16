package model;

public class Categoria {
	private String nome;
	private Double lucro;
	
	public Categoria() {
		
	}
	
	public Categoria(String nome, Double lucro) {
		this.nome = nome;
		this.lucro = lucro;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getLucro() {
		return lucro;
	}

	public void setLucro(Double lucro) {
		this.lucro = lucro;
	}
	
	@Override
	public String toString() {
		return this.nome;
	}

}
