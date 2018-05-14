package pksoftFX;
import javafx.event.ActionEvent;
import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class first extends Application { // inherits from Application
	
	
	Stage window;
	public static void main(String[]args) {
		launch(args);
		
	}
	public void start(Stage primaryStage) {
		window = primaryStage;
		window.setTitle("First Window or Scene");
        
		GridPane grid = new GridPane();
		grid.setPadding(new Insets(10,10,10,10));
		grid.setVgap(8);
		grid.setHgap(9);
		// all set
		// now
		Label nameLabel = new Label("Username: ");
		GridPane.setConstraints(nameLabel, 0,0);
		// end of username and locations
		
		TextField nameinput = new TextField("kidpk");
		GridPane.setConstraints(nameinput, 1,  0);

		// for password
		Label passLabel = new Label("Password:");
		GridPane.setConstraints(passLabel, 0,1);
		
		TextField passinput = new TextField();
		passinput.setPromptText("password"); // password hints
		GridPane.setConstraints(passinput, 1,  1);
		
		Button loginbutton = new Button("Login");
		GridPane.setConstraints(loginbutton, 1,  2);

		grid.getChildren().addAll(nameLabel, nameinput, passLabel, passinput, loginbutton);
		Scene scene = new Scene(grid, 300,200);
		window.setScene(scene);
		
		window.show();
	}
	
	
}
