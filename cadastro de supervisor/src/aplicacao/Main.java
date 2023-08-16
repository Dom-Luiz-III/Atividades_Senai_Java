package aplicacao;

import java.util.ArrayList;
import java.util.List;

import entidades.Funcionario;
import entidades.Operador;
import entidades.Supervisor;

public class Main {

	public static void main(String[] args) {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		
		
		Supervisor sp1 = new Supervisor("Luiz",2000.0,"TI");
		funcionarios.add(sp1);
		Supervisor sp2 = new Supervisor("Debora",3000.0,"RH");
		funcionarios.add(sp2);
		
		/*
		funcionarios.add(new Supervisor("Luiz",2000.0,"TI"));
		funcionarios.add(new Supervisor("Debora",3000.0,"RH"));
		*/
		
		funcionarios.add(new Operador("Lucas", 1500.0, sp1));
		funcionarios.add(new Operador("João", 1500.0, sp1));
		funcionarios.add(new Operador("Miguel", 1500.0, sp1));
		funcionarios.add(new Operador("Laura", 1500.0, sp1));
		funcionarios.add(new Operador("Marcos", 1800.0, sp2));
		funcionarios.add(new Operador("Paulo", 1800.0, sp2));
		funcionarios.add(new Operador("Tonho", 1800.0, sp2));


		
		for (Funcionario item : funcionarios) {
			if(item instanceof Supervisor) {
				System.out.println("\n\n" + item);
				System.out.println("\n---OPERADORES---\n");
				
				for(Operador sp : ((Supervisor)item).buscarOperadores(funcionarios)) {
				System.out.println(sp);
				}
			}
		}
	}

}
