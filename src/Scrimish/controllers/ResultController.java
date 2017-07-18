package controllers;

import java.net.URL;
import java.util.ResourceBundle;

import Main.MainApp;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;

public class ResultController extends MainApp implements Initializable{
	
	@FXML
	private Button exitButton;
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		exitButton.setOnAction(e -> {
			Platform.exit();
		});
	}

}

