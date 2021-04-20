package edu.westga.cs6312.ui.view;

import edu.westga.cs6312.ui.model.TextSample;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

/**
 * Provides the GUI view of the TextSample application. Creates the sub-panes
 * and lays them out.
 *
 * @author Spencer Dent
 * @version 2021-04-20
 */
public class TextSamplePane extends GridPane {

	/**
	 * Uses the provided TextSample as a model skeleton to create the main pane for
	 * the view. Configures the pane's properties, and calls the methods to create
	 * and place the sub-panes.
	 * 
	 * @param newTextSample - the TextSample object to use as the model
	 * @precondition newTextSample != null
	 * @throws IllegalArgumentException if newTextSample is null
	 */
	public TextSamplePane(TextSample newTextSample) {
		if (newTextSample == null) {
			throw new IllegalArgumentException("Invalid TextSample, TextSample cannot be null.");
		}

		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(10.0));
		this.setHgap(10.0);
		this.setVgap(10.0);

		this.addFontFamilySelectionListViewPane();
		this.addMessageSelectionComboBoxPane();
		this.addFontSizeSliderPane();
		this.addMessageLabelDisplayPane();
	}

	/**
	 * Creates and attaches a Pane to display the ListView containing the selection
	 * of available font families, and labels the ListView appropriately.
	 */
	private void addFontFamilySelectionListViewPane() {

	}

	/**
	 * Creates and attaches a Pane to display the ComboBox containing the selection
	 * of available messages, and labels the ComboBox appropriately.
	 */
	private void addMessageSelectionComboBoxPane() {

	}

	/**
	 * Creates and attaches a Pane to display the font size Slider, and labels the
	 * Slider appropriately.
	 */
	private void addFontSizeSliderPane() {

	}

	/**
	 * Creates and attaches a Pane to display the selected message generated in the
	 * chosen font and size.
	 */
	private void addMessageLabelDisplayPane() {

	}
}
