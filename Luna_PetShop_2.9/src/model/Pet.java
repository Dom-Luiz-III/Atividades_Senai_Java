package model;

import java.util.ArrayList;
import java.util.List;

import repository.IRepository;

public class Pet extends AbstractEntity implements IRepository<Pet>{
	public List <Pet> pets;
	
	public Pet() {
		this.pets = new ArrayList<>();
	}
	
		private String especie;
		private String nomePet;
		private String idade;
		private String raca;
		private int id;
		Cliente cliente;
		
		public Pet(int id, String especie) {
			this.id = id;
			this.especie = especie;
		}
	
	public Pet(String nomePet, String especie, String idade, String raca, int id) {
		this.nomePet = nomePet;
		this.especie = especie;
		this.idade = idade;
		this.raca = raca;
		this.id = id;
	}
	public int getId(){
		return id;
	}
	public String getNomePet() {
		return nomePet;
	}
	public void setNomePet(String nomePet) {
		this.nomePet = nomePet;
	}
	public String getEspecie() {
		return especie;
	}
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getIdade() {
		return idade;
	}
	public void setIdade(String idade) {
		this.idade = idade;
	}
	public String getRaca() {
		return raca;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	@Override
	public String toString() {
		return getEspecie();
	}
	
	/*@Override
	public String toString() {
		return 
				"\n////////////////////////////////////" +
				"\nNome do Pet: " + nomePet + 
				"\nEspecie: " + especie + 
				"\nIdade: " + idade + 
				"\nRaça: " + raca+ 
				"\nId do Cliente: " + id +
				"\n////////////////////////////////////\n";
	}*/
	
	@Override
	public void cadastrar(Pet item) {
		pets.add(item);
		
	}

	@Override
	public void excluir(int id) {
		for (int i = 0; i < pets.size(); i++) {
            Pet pet = pets.get(i);
            if (pet.getId() == id) {
                pets.remove(i);
                return;
            }
		}
		
	}

	@Override
	public Pet buscar(String nome) {
		for (Pet item: pets) {
			if (item.getNomePet().equals(nome.toUpperCase())) {
				return item;
			}
		}
		throw new IllegalArgumentException("Não foi possível localizar  o Pet!");
	}

	@Override
	public List<Pet> listar() {	
		return pets;
	}
}
