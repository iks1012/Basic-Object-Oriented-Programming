package Main;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import java.io.IOException;
import javafx.fxml.FXMLLoader;
import javafx.geometry.*;






public class CardsNotSelected extends MainApp {
		public static void display(String title, String message) {
	        Stage window = new Stage();

	        //Block events to other windows
	        window.initModality(Modality.APPLICATION_MODAL);
	        window.setTitle(title);
	        window.setMinWidth(500);
	        window.setMinHeight(250);

	        Label label = new Label();
	        label.setText(message);
	        Button closeButton = new Button("Ok - Continue selecting Cards");
	        closeButton.setOnAction(e -> window.close());

	        VBox layout = new VBox(10);
	        layout.getChildren().addAll(label, closeButton);
	        layout.setAlignment(Pos.CENTER);

	        //Display window and wait for it to be closed before returning
	        Scene scene = new Scene(layout);
	        window.setScene(scene);
	        window.showAndWait();
	    }

	}

