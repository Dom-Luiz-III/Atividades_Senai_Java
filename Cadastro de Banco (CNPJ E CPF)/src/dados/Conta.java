package dados;

public class Conta {
	public String nome;
	public String numero;
	public Double saldo;
	
	public Conta() {
	}
	
	public Conta(String nome,String numero) {
		this.nome = nome;
		this.numero = numero;
		this.saldo = 0.0;
	}
	
	public Boolean sacar(Double valor) {
		
		if(valor <= saldo) {
			saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	public Boolean depositar(Double valor) {
		
		if (valor > 0) {
			saldo += valor;
			return true;
		}
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public Double getSaldo() {
		return saldo;
	}
	
	public String toString() {
		return 
			    "\nNOME: " + nome +
				"\nNº CONTA: " + numero +
				"\nSALDO: " + saldo;	
	}
}

/*

*/