package repositories;

import java.util.ArrayList;
import java.util.List;


import entities.Produto;

public class ProdutoRepository implements IRepository<Produto>{
	public List<Produto> produtos;
	
	@Override
	public Produto buscar(String nome) {
		for (Produto item: produtos) {
			if (item.getNome().equals(nome)) {
				return item;
			}
		}
		throw new IllegalArgumentException("Não foi possível localizar o nome do produto!");
	}
	
	public ProdutoRepository() {
		this.produtos = new ArrayList<Produto>();
	}

	@Override
	public List<Produto> listar() {
		return produtos;
	}

	@Override
	public boolean cadastrar(Produto item) {
		produtos.add(item);
		return false;
	}

	@Override
	public boolean excluir(Produto item) {
		produtos.remove(item);
		return false;
	}

}
