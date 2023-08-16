package application;

import java.net.URL;
import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Pet;


public class PetsController implements Initializable{
	private Pet pets;
	
	//Buttons
	@FXML private TextField TextID;

    @FXML private TextField textDono;

    @FXML private DatePicker textIdade;
    
    @FXML private Label LabelData;
    
    @FXML private TextField textNomeP;

    @FXML private TextField textRaça;
    
    @FXML private Button btCadas;
    
    @FXML private Button bttRemove;
    
    @FXML private TableView<Pet> tablePets;
    
    @FXML private ComboBox<Pet> comboBoxEspecie;
    
    private List<Pet> Pets = new ArrayList<>();
      
    private ObservableList<Pet> obsPet;
    
  //Actions
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		CarregarPet();
		pets = new Pet();
	}
    
    public void getData(ActionEvent event) {
    	LocalDate dataHoje = LocalDate.now();
    	LocalDate dataSelect = textIdade.getValue();
    	
    	
        Period t1 = Period.between(dataSelect, dataHoje);
        
        if(t1.getYears()==0) {
        	LabelData.setText(t1.getMonths() + " Meses");
        }
        else if(t1.getYears()>0) {
        	LabelData.setText(t1.getYears() + " Anos");
        }
    }
    
	public void CarregarPet() {
		
		Pet pets1 = new Pet(1, "Cachorro");
		Pet pets2 = new Pet(2, "Gato");
		
		Pets.add(pets1);
		Pets.add(pets2);
		
		obsPet = FXCollections.observableArrayList(Pets);
		
		comboBoxEspecie.setItems(obsPet);
	}
		
	public void CadastrarButtonAction(ActionEvent event) {	
		Pet pet = new Pet();
		pets.cadastrar(pets);
		System.out.println("Pet cadastrado");
	}
	
	@FXML
	protected void btNovoAction(ActionEvent e) {
		System.out.println("Voltar!!");
		
		Main.changeScreen("main");
	}
	
}