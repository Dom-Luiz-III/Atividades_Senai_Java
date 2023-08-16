package entidades;

import java.util.ArrayList;
import java.util.List;

import interfaces.IFuncionario;
import interfaces.ISupervisor;

public class Supervisor extends Funcionario implements IFuncionario,ISupervisor{
	protected String setor;
	
	public Supervisor(String nome, Double salarioBase, String setor) {
		super(nome, salarioBase);
		this.setor = setor;
	}

	public String getSetor() {
		return this.setor;
	}
	
	public void alterarSetor(String novoSetor) {
		setor = novoSetor;
	}
	
	@Override
	public String toString() {
		return super.toString() +
				"\nSetor: " + setor;
	}

	
	public double calcularSalario() {
		return salarioBase * 0.95;
	}

	
	public List<Operador> buscarOperadores(List<Funcionario> lista) {
		List<Operador> operadores = new ArrayList<Operador>();
		
		for(Funcionario item : lista) {
			if(item instanceof Operador) {
				if (((Operador) item).supervisor.equals(this)){
				operadores.add((Operador) item);	
				}
			}
		}
		
		/*
		 * for(Funcionario item : lista) { if(item instanceof Operador) { if
		 * (((Operador) item).supervisor.getNome() == this.getNome()){
		 * operadores.add((Operador) item); } } }
		 */
		
		return operadores;
	}
}
