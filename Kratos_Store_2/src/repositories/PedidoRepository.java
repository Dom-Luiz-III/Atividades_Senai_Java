package repositories;

import java.util.ArrayList;
import java.util.List;

import entities.Pedido;

public class PedidoRepository implements IRepository<Pedido>{
	public List<Pedido> pedidos;

	public PedidoRepository() {
		this.pedidos = new ArrayList<Pedido>();
	}
	
	@Override
	public Pedido buscar(String codigo) {
		for (Pedido item: pedidos) {
			  if (item.getCodigo().equals(codigo)) {
				return item;
			}
		}
		throw new IllegalArgumentException("Não foi possível localizar o código");
	}

	@Override
	public List<Pedido> listar() {
		return pedidos;
	}

	@Override
	public boolean cadastrar(Pedido item) {
		pedidos.add(item);
		return false;
	}

	@Override
	public boolean excluir(Pedido item) {
		pedidos.add(item);
		return false;
	}

}
