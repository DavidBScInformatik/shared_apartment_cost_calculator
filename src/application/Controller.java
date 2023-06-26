package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

import javafx.application.Platform;
import javafx.scene.control.MenuItem;

public class Controller {

    @FXML
    private MenuItem cost;

    @FXML
    private MenuItem language;
    
    @FXML
    private MenuItem exit;
    
    @FXML
    void exitProgram(ActionEvent evt) {
    	Platform.exit();
    }
    
    @FXML 
    void changeToEnglish(ActionEvent evt){
    	System.out.println("Sprache auf Englisch");

    	Stage stage = new Stage();
		FXMLLoader fxmlLoader = new FXMLLoader();
		
		Pane root = null;
		try {
			root = (Pane)fxmlLoader.load(getClass().getResource("View_eng.fxml").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
    	
    }
    
    @FXML 
    void changeToGerman(ActionEvent evt){
    	System.out.println("Sprache auf deutsch");

    	Stage stage = new Stage();
		FXMLLoader fxmlLoader = new FXMLLoader();
		
		Pane root = null;
		try {
			root = (Pane)fxmlLoader.load(getClass().getResource("View_de.fxml").openStream());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(root);
		stage.setScene(scene);
		stage.setResizable(false);
		stage.show();
    	
    }
    
}
