module Test_FX_A {
	requires javafx.controls;
	
	opens application to javafx.graphics, javafx.fxml;
}
