package repositories;

import java.util.List;

public interface IRepository<Object> {
	public boolean cadastrar(Object item);	
	public boolean excluir(Object item);
	public Object buscar(String nome);
	public List<Object> listar();
}
