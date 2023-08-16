package interfaces;

import java.util.List;

import entidades.Funcionario;
import entidades.Operador;

public interface ISupervisor {
	public List<Operador> buscarOperadores(	List<Funcionario> lista);
	
	
}
