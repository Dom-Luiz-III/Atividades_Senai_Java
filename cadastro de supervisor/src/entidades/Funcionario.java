package entidades;

public abstract class Funcionario {
	protected String nome;
	protected Double salarioBase;
	
	public Funcionario(String nome, Double salarioBase) {
		this.nome = nome;
		this.salarioBase = salarioBase;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalarioBase() {
		return salarioBase;
	}

	public void setSalarioBase(Double salarioBase) {
		this.salarioBase = salarioBase;
	}
	
	@Override
	public String toString() {
		return "\nNome: " + nome +
				"\nSalario: " + salarioBase;
	}
}


