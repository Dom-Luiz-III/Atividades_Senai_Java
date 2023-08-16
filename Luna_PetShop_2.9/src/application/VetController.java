package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import model.Cliente;
import model.Pet;

public class VetController implements Initializable{
	@FXML private Cliente cliente;
	@FXML private Pet pets;
	@FXML private Button bttRemove;
	
	@FXML private TableView<Cliente> tableClientes;

    @FXML private TableColumn<Cliente, String> colEnd;

    @FXML private TableColumn<Cliente, Integer> colId;
    
    @FXML private TableColumn<Cliente, String> textEmail;

    @FXML private TableColumn<Cliente, String> colNome;

    @FXML private TableColumn<Cliente, String> colTel;
    
    @FXML  private TableView<Pet> tablePets;

    @FXML  private TableColumn<Pet, String> textDono;

    @FXML  private TableColumn<Pet, String> textEspe;

    @FXML  private TableColumn<Pet, Integer> textID;

    @FXML private TableColumn<Pet, Integer> textIdade;

    @FXML private TableColumn<Pet, String> textNomePet;

    @FXML  private TableColumn<Pet, String> textRaca;
    
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		cliente = new Cliente();
		pets = new Pet();
	}	
	
	@FXML
	public void ExcluirClienteButtonAction(ActionEvent event) {
		cliente.excluir(0);
		
		System.out.println("cliente excluido!!");
	}
	
	@FXML
	public void ExcluirPetButtonAction(ActionEvent e) {
		pets.excluir(0);
		
		System.out.println("pet excluido!!");
	}
	
	@FXML
	protected void btNovoAction(ActionEvent e) {
		System.out.println("Voltar!!");
		
		Main.changeScreen("main");
	}
}