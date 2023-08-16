package model;

import java.util.ArrayList;
import java.util.List;

import repository.IRepository;

public class Cliente extends AbstractEntity implements IRepository<Cliente>{
	public List<Cliente> clientes;
	public Cliente() {
        this.clientes = new ArrayList<>();
    }
	
		private String nome;
		private String endere;
		private String email;
		private String telefone;
		private int id;
	
	
	public Cliente(String nome, String endere, String email, String telefone, int id) {
		this.nome = nome;
		this.endere = endere;
		this.email = email;
		this.telefone = telefone;
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndere() {
		return endere;
	}
	public void setEndere(String endere) {
		this.endere = endere;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	@Override
	public String toString() {
		
		return "\n////////////////////////////////////" +
				"\nNome do Cliente: " + nome + 
				"\n Endereço: " + endere + 
				"\n Email: " + email + 
				"\n Telefone: " + telefone + 
				"\n Id: " + id+
			"\n////////////////////////////////////\n";
	}

	@Override
	public void cadastrar(Cliente item) {
		clientes.add(item);
		
	}

	@Override
	public void excluir(int id) {
		for (int i = 0; i < clientes.size(); i++) {
            Cliente cliente = clientes.get(i);
            if (cliente.getId() == id) {
                clientes.remove(i);
                return;
            }
		}
	}
	@Override
	public Cliente buscar(String nome) {
		for (Cliente item: clientes) {
			if (item.getNome().equals(nome.toUpperCase())) {
				return item;
			}
		}
		throw new IllegalArgumentException("Não foi possível localizar  o cliente!");
		
	}

	@Override
	public List<Cliente> listar() {
		return clientes;
	}
}
