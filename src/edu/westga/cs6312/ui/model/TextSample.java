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
	 * Gets the current message.
	 * 
	 * @return - the message of the sample text
	 */
	public String getMessage() {
		return this.message;
	}

	/**
	 * Changes the message to the provided String.
	 * 
	 * @param newMessage - the String to set as the message
	 */
	public void setMessage(String newMessage) {
		this.message = newMessage;
	}

	/**
	 * Gets the name of the current font family.
	 * 
	 * @return the name of the font's family
	 */
	public String getFontFamilyName() {
		return this.fontFamilyName;
	}

	/**
	 * Changes the font family name to the provided String.
	 * 
	 * @param newFontFamilyName - the name of the new font family
	 */
	public void setFontFamilyName(String newFontFamilyName) {
		this.fontFamilyName = newFontFamilyName;
	}

	/**
	 * Gets the current size of the font.
	 * 
	 * @return the current font size
	 */
	public double getFontSize() {
		return this.fontSize;
	}

	/**
	 * Changes the font size to the given value.
	 * 
	 * @param newFontSize - the new value to set the font size to
	 */
	public void setFontSize(double newFontSize) {
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
