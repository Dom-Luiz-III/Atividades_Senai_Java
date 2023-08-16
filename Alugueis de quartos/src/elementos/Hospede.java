package elementos;

public class Hospede {
	private String nome;
	private Integer idade;
	private String telefone;
	
	public Hospede (String nome,Integer idade,String telefone) {
		this.nome = nome;
		this.idade = idade;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public String toString() {
		return           this.nome
				+ ", " + this.idade
				+ ", " + this.telefone;
	}
}
