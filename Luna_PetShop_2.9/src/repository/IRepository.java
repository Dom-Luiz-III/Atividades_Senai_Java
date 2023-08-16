package repository;

import java.util.List;

@SuppressWarnings("hiding")
public interface IRepository<Object> {
	public void cadastrar(Object item);	
	public void excluir(int id);
	public Object buscar(String nome);
	public List<Object> listar();
	
}
