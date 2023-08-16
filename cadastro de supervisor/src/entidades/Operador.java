package entidades;

public class Operador extends Funcionario {
	protected Supervisor supervisor;
	
	public Operador(String nome, Double salarioBase,Supervisor supervisor) {
		super(nome, salarioBase);
		this.supervisor = supervisor;
	}
	
	public void alterarSupervisor(Supervisor novoSuper) {
		this.supervisor = novoSuper;
	}
	
	public Supervisor getSupervisor() {
		return this.supervisor;
	}
}
