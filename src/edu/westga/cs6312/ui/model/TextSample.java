package edu.westga.cs6312.ui.model;

/**
 * Provides a model to store a message and its display data (its font and text
 * size).
 *
 * @author Spencer Dent
 * @version 2021-04-19
 */
public class TextSample {
	private String message;
	private String fontFamilyName;
	private double fontSize;

	/**
	 * Creates a new TextSample with the given parameters.
	 * 
	 * @param newMessage        - the message to display
	 * @param newFontFamilyName - the name of the font family to use
	 * @param newFontSize       - the font size to use
	 */
	public TextSample(String newMessage, String newFontFamilyName, double newFontSize) {
		this.message = newMessage;
		this.fontFamilyName = newFontFamilyName;
		this.fontSize = newFontSize;
	}

	/**
	 * Primarily used for testing, returns a String that describes the object and
	 * it's instance variables.
	 * 
	 * @return the String representation of the object
	 */
	@Override
	public String toString() {
		return "message: \"" + this.message + "\" font: " + this.fontFamilyName + " " + this.fontSize;
	}
}
