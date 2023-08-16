package dados;

public class ContaSalario extends Conta {
	public Double limiteChequeEspecial;
	
	public ContaSalario(String nome, String numero) {
		super(nome, numero);
		
		limiteChequeEspecial = 200.0;
	}
	
	public ContaSalario(String nome, String numero, Double limiteChequeEspecial) {
		super(nome, numero);
		
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	public Boolean sacar(Double valor) {
		
		if(valor <= saldo + limiteChequeEspecial) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public String toString() {
		return 
			    super.toString() +
				"\nLIMITE DE CHEQUE ESPECIAL: " + limiteChequeEspecial;	
	}
}
/*
	public ContaSalario() {
		super(nome, numero);
		
	
	}
*/
