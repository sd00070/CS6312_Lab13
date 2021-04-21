package edu.westga.cs6312.ui.view;

import edu.westga.cs6312.ui.model.TextSample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

/**
 * Provides the GUI view of the TextSample application. Creates the sub-panes
 * and lays them out.
 *
 * @author Spencer Dent
 * @version 2021-04-20
 */
public class TextSamplePane extends GridPane {

	private TextSample textSampleModel;

	private MessageDisplayPane messageDisplayPane;

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

		this.textSampleModel = newTextSample;

		this.setAlignment(Pos.CENTER);
		this.setPadding(new Insets(10.0));
		this.setHgap(10.0);
		this.setVgap(10.0);

		FontFamilySelectionVBox fontFamilySelectionVBox = new FontFamilySelectionVBox();
		TextSamplePane.setConstraints(fontFamilySelectionVBox, 0, 0, 1, 1);

		TextSelectionVBox textSelectionVBox = new TextSelectionVBox();
		TextSamplePane.setConstraints(textSelectionVBox, 1, 0, 1, 1);

		FontSizeSliderVBox fontSizeSliderVBox = new FontSizeSliderVBox();
		TextSamplePane.setConstraints(fontSizeSliderVBox, 0, 1, 2, 1);

		this.messageDisplayPane = new MessageDisplayPane();
		TextSamplePane.setConstraints(this.messageDisplayPane, 0, 2, 2, 2);

		this.getChildren().addAll(fontFamilySelectionVBox, textSelectionVBox, fontSizeSliderVBox,
				this.messageDisplayPane);
	}

	/**
	 * Serves as the sub-view that displays the font family selection ListView and
	 * its Label. Configures them, and neatly packages them into a single object.
	 *
	 * @author Spencer Dent
	 * @version 2021-04-20
	 */
	private class FontFamilySelectionVBox extends VBox {
		private Label fontFamilySelectionLabel;
		private ListView<String> fontFamilySelectionListView;

		/**
		 * Creates the elements, fills them with the proper data, and adds them to the
		 * VBox.
		 */
		protected FontFamilySelectionVBox() {
			this.fontFamilySelectionLabel = new Label("Font:");

			this.fontFamilySelectionListView = new ListView<String>();
			this.fontFamilySelectionListView.getItems().addAll("Courier New", "Helvetica", "Garamond", "Trebuchet MS");
			this.fontFamilySelectionListView.getSelectionModel()
					.select(TextSamplePane.this.textSampleModel.getFontFamilyName());
			this.fontFamilySelectionListView.getSelectionModel().selectedItemProperty()
					.addListener(fontFamilySelectedEvent -> {
						String selectedFontFamily = this.fontFamilySelectionListView.getSelectionModel()
								.getSelectedItem();
						TextSamplePane.this.textSampleModel.setFontFamilyName(selectedFontFamily);

						TextSamplePane.this.messageDisplayPane.refreshDisplay();
					});

			this.getChildren().addAll(this.fontFamilySelectionLabel, this.fontFamilySelectionListView);
		}
	}

	/**
	 * Serves as the sub-view that displays the text selection ComboBox and its
	 * Label. Configures them, and neatly bundles them into a single object.
	 *
	 * @author Spencer Dent
	 * @version 2021-04-20
	 */
	private class TextSelectionVBox extends VBox {
		private Label textSelectionLabel;
		private ComboBox<String> textSelectionComboBox;

		/**
		 * Creates the elements, fills them with the proper data, and adds them to the
		 * VBox.
		 */
		protected TextSelectionVBox() {
			this.textSelectionLabel = new Label("Text:");

			this.textSelectionComboBox = new ComboBox<String>();
			String[] textSelectionArray = { "Hello, World!", "Twas brillig, and the slithy toves",
				"The quick brown fox jumps over the lazy dog" };
			ObservableList<String> textSelectionItems = FXCollections.observableArrayList(textSelectionArray);
			this.textSelectionComboBox.getItems().addAll(textSelectionItems);
			this.textSelectionComboBox.setValue(TextSamplePane.this.textSampleModel.getMessage());
			this.textSelectionComboBox.setOnAction(textSelectedEvent -> {
				String selectedMessage = this.textSelectionComboBox.getValue();
				TextSamplePane.this.textSampleModel.setMessage(selectedMessage);

				TextSamplePane.this.messageDisplayPane.refreshDisplay();
			});

			this.getChildren().addAll(this.textSelectionLabel, this.textSelectionComboBox);
		}
	}

	/**
	 * Serves as the sub-view that displays the font size slider and its Label.
	 * Configures them, and neatly combines them into a single object.
	 *
	 * @author Spencer Dent
	 * @version 2021-04-20
	 */
	private class FontSizeSliderVBox extends VBox {
		private Label fontSizeSliderLabel;
		private Slider fontSizeSlider;

		/**
		 * Creates the elements, fills them with the proper data, and adds them to the
		 * VBox.
		 */
		protected FontSizeSliderVBox() {
			this.fontSizeSliderLabel = new Label("Font Size:");

			this.fontSizeSlider = new Slider();
			this.fontSizeSlider.setMin(10.0);
			this.fontSizeSlider.setMax(48.0);
			this.fontSizeSlider.setValue(TextSamplePane.this.textSampleModel.getFontSize());
			this.fontSizeSlider.setMinorTickCount(4);
			this.fontSizeSlider.setMajorTickUnit(10.0);
			this.fontSizeSlider.setSnapToTicks(true);
			this.fontSizeSlider.showTickMarksProperty().set(true);
			this.fontSizeSlider.showTickLabelsProperty().set(true);

			this.fontSizeSlider.valueProperty().addListener(thumbPositionChangeEvent -> {
				double selectedFontSize = this.fontSizeSlider.valueProperty().get();
				TextSamplePane.this.textSampleModel.setFontSize(selectedFontSize);
				
				TextSamplePane.this.messageDisplayPane.refreshDisplay();
			});

			this.getChildren().addAll(this.fontSizeSliderLabel, this.fontSizeSlider);
		}
	}

	/**
	 * Serves as the sub-view that displays the message with the selected font size
	 * and family.
	 *
	 * @author Spencer Dent
	 * @version 2021-04-20
	 */
	private class MessageDisplayPane extends BorderPane {
		private Label textSampleDisplayLabel;

		/**
		 * Creates the label and places it in the center of the Pane.
		 */
		protected MessageDisplayPane() {
			this.paddingProperty().set(new Insets(20.0));

			this.textSampleDisplayLabel = new Label();
			this.refreshDisplay();

			this.setCenter(this.textSampleDisplayLabel);
		}

		/**
		 * Makes the label display the current state of the TextSample model.
		 */
		public void refreshDisplay() {
			this.textSampleDisplayLabel.textProperty().set(TextSamplePane.this.textSampleModel.getMessage());
			this.textSampleDisplayLabel.fontProperty()
					.set(new Font(TextSamplePane.this.textSampleModel.getFontFamilyName(),
							TextSamplePane.this.textSampleModel.getFontSize()));
		}
	}
}
