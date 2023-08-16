package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Cliente;
import model.Pet;


public class ClientesController implements Initializable{
	private Cliente cliente;
	
	
	
	@FXML private Button bttCada;

    @FXML private TextField textEnd;

    @FXML private TextField textId;

    @FXML private TextField textEmail;
    
    @FXML private TextField textNome;

    @FXML private TextField textTel;
	
    @FXML private Button bttRemove;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		cliente = new Cliente();
	}
	

	
	@FXML
	public void handleButtonAction(ActionEvent event) {
		cliente.cadastrar(cliente);
		
		System.out.println("Cliente Cadastrado!!");
		
	}
	
	@FXML
	protected void btNovoAction(ActionEvent e) {
		System.out.println("Avançar");
		
		Main.changeScreen("pets");
	}
	
	@FXML
	protected void btNovoAction2(ActionEvent e) {
		System.out.println("Voltar");
		
		Main.changeScreen("main");
	}
}

