package elementos;

public class Categoria {
	private String nome;
	private Double lucro;
	
	public Double porcentagem = lucro % 100;

	
	public Categoria(String nome, Double lucro) {
		this.nome = nome;
		this.lucro = lucro;
	}
	
	public static Categoria cadastrarCategoria(String nome, Double lucro) {
		
		System.out.println("CADASTRO ADICIONADO!");
		return null;
	}
	
	public static Categoria excluirCategoria() {
		
		System.out.println("CADASTRO EXCLUIDO!");
		return null;
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
	
	public String toString() {
		return 
			"\nCATEGORIA: " + nome;
				
	}
}
