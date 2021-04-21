package edu.westga.cs6312.ui.controller;

import edu.westga.cs6312.ui.model.TextSample;
import edu.westga.cs6312.ui.view.TextSamplePane;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * Acts as the primary controller for the application. This class creates the
 * start-off point for the JavaFX application, instantiates the view, and
 * launches the GUI.
 *
 * @author Spencer Dent
 * @version 2021-04-12
 */
public class TextSampleDriver extends Application {

	/**
	 * Is called by the JavaFX application at the start of its run. Sets up the
	 * needed nodes, configures the stage, and shows the stage.
	 */
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("CS6312 TextSample UI");
		
		TextSample textSampleModel = new TextSample("Hello, World!", "System", 24.0);

		TextSamplePane primaryPane = new TextSamplePane(textSampleModel);
		
		Scene rootScene = new Scene(primaryPane);

		primaryStage.setScene(rootScene);

		primaryStage.show();
	}

	/**
	 * Launches the JavaFX application.
	 * 
	 * @param args - command line arguments; not used in this application
	 */
	public static void main(String[] args) {
		launch(args);
	}
}
