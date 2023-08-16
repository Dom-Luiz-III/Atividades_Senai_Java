package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Categoria;

public class CategoriaRepository implements IRepository<Categoria>{
	public List<Categoria> categorias;
	
	public CategoriaRepository() {
		this.categorias = new ArrayList<Categoria>();
	}

	
	@Override
	public boolean cadastrar(Categoria item) {
		categorias.add(item);
		return true;
	}

	@Override
	public boolean excluir(Categoria item) {
		categorias.remove(item);
		return true;
	}

	@Override
	public Categoria buscar(String nome) {
		for (Categoria item: categorias) {
			if (item.getNome().equals(nome)) {
				return item;
			}
		}
		throw new IllegalArgumentException("Não foi possível localizar categoria");
	}
	
	@Override
	public List<Categoria> listar() {
		return categorias;
	}


}
