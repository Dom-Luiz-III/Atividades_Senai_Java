package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController {

	@FXML
	private TextField txtNumber1;
	
	@FXML
	private TextField txtNumber2;
	
	@FXML
	private TextField txtNumber3;
	
	@FXML
	private Label labelResult;
	
	@FXML
	private Button btSum;
	
 	@FXML
	public void onBtSumClick() {
		try {
			Double nota1 = Double.parseDouble(txtNumber1.getText());
			Double nota2 = Double.parseDouble(txtNumber2.getText());
			Double nota3 = Double.parseDouble(txtNumber3.getText());

			Double sum = 7 - ((nota1 * 0.25) + (nota2 * 0.25) + (nota3 * 0.25));
			
			if (sum > 0) {
			labelResult.setText("Falta " + sum + " pontos para passar");
			}
			else {
				labelResult.setText("APROVADO!!!");
			}
		}
		catch (NumberFormatException e) {
			Alerts.showAlert("ERRO!", "Erro de digitação!", e.getMessage(), AlertType.ERROR);
		}
	}
}

/* 
	labelResult.setText(String.format("%.2f", sum));
*/