package dados;

public class ContaEmpresarial extends Conta {

	public Double limiteEmprestimo;
	
	public ContaEmpresarial() {
		super();
	}
	
	public ContaEmpresarial(String nome, String numero) {
		super(nome, numero);
		limiteEmprestimo = 1000.0;
	}
	
	public Boolean solicitarEmprestimo(Double valor) {
		if (valor <= limiteEmprestimo) {
			limiteEmprestimo -= valor;
			super.depositar(valor);
			return true;
		}
		return false;
	}

	public String toString() {
		return 
			    "\nNOME: " + nome +
				"\nNº CONTA: " + numero +
				"\nSALDO: " + saldo +
				"\nLIMITE DE EMPRESTIMO: " + limiteEmprestimo;	
	}

	public Double getLimiteEmprestimo() {
		return limiteEmprestimo;
	}

	public void setLimiteEmprestimo(Double limiteEmprestimo) {
		this.limiteEmprestimo = limiteEmprestimo;
	}
}
