package gui;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Categoria;
import model.Produto;

public class ViewController implements Initializable{

	@FXML
	private TextField txtNome;
	
	@FXML
	private TextField txtCusto;
	
	@FXML
	private TextField txtEstoque;
	
	@FXML
	private TextField txtPreco;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btCadastrar;
	
	@FXML
	private ComboBox<Categoria> cbbCategoria;
	private ObservableList <Categoria> obsLista;
	
	private List<Categoria> categorias = new ArrayList<Categoria>();
	private List<Produto> produtos = new ArrayList<Produto>();
	
	public void onbtnCadastrarAction() {
		String nome = txtNome.getText();
		Double custo = Double.parseDouble(txtCusto.getText());
		Integer estoque = Integer.parseInt(txtCusto.getText());
		Categoria categoria = cbbCategoria.getValue();
		Produto prod = new Produto(nome,categoria,custo,estoque);
		produtos.add(prod);
		
	}
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		categorias.add(new Categoria("Informática", 0.2));
		categorias.add(new Categoria("Papelaria", 0.1));
		categorias.add(new Categoria("Alimentos", 0.25));
		
		obsLista = FXCollections.observableArrayList(categorias);
		cbbCategoria.setItems(obsLista);
		
	}
}