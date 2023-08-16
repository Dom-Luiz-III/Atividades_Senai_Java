package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;


public class Main extends Application {
	
	private static Stage stage;
	
	private static Scene mainScene;
	private static Scene ClientesScene;
	private static Scene PetsScene;
	private static Scene VetScene;
	
	
	@Override
	public void start(Stage primaryStage) {
		try {
			primaryStage.setTitle("Luna Pet Shop");
			stage = primaryStage;
			
			Parent fxmlMain = FXMLLoader.load(getClass().getResource("/application/Main.fxml"));
			mainScene = new Scene(fxmlMain);
			
			Parent fxmlClientes = FXMLLoader.load(getClass().getResource("/application/Clientes.fxml"));
			ClientesScene = new Scene(fxmlClientes);
			
			Parent fxmlPet = FXMLLoader.load(getClass().getResource("/application/Pets.fxml"));
			PetsScene = new Scene(fxmlPet);
			
			Parent fxmlVet = FXMLLoader.load(getClass().getResource("/application/Vet.fxml"));
			VetScene = new Scene(fxmlVet);
			
			primaryStage.setScene(mainScene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void changeScreen(String scr) {
		switch(scr) {
		case "main":
			stage.setScene(mainScene);
			break;
		case "clientes":
			stage.setScene(ClientesScene);
			break;
		case "pets":
			stage.setScene(PetsScene);
			break;
		case "vet":
			stage.setScene(VetScene);
		}
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
