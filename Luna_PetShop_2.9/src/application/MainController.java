package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {
	
	
	@FXML
	protected void btNovoAction(ActionEvent e) {
		System.out.println("Avançar!!");
		
		Main.changeScreen("clientes");
	}
	
	@FXML
	protected void btNovoAction2(ActionEvent e) {
		System.out.println("Avançar!!");
		
		Main.changeScreen("vet");
	}
}
