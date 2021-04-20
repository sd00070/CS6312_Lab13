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
	 * @precondition newMessage != null && newFontFamilyName != null && newFontSize
	 *               > 0.0
	 * @throws IllegalArgumentException if newMessage == null || newFontFamily ==
	 *                                  null || newFontSize <= 0.0
	 */
	public TextSample(String newMessage, String newFontFamilyName, double newFontSize) {
		if (newMessage == null) {
			throw new IllegalArgumentException("Invalid message, message cannot be null.");
		}
		if (newFontFamilyName == null) {
			throw new IllegalArgumentException("Invalid font family name, font family name cannot be null.");
		}
		if (newFontSize <= 0.0) {
			throw new IllegalArgumentException("Invalid font size, font size must be greater than zero (0.0).");
		}

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
	 * @precondition newMessage != null
	 * @throws IllegalArgumentException if newMessage == null
	 */
	public void setMessage(String newMessage) {
		if (newMessage == null) {
			throw new IllegalArgumentException("Invalid message, message cannot be null.");
		}

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
	 * @precondition newFontFamilyName != null
	 * @throws IllegalArgumentException if newFontFamilyName == null
	 */
	public void setFontFamilyName(String newFontFamilyName) {
		if (newFontFamilyName == null) {
			throw new IllegalArgumentException("Invalid font family name, font family name cannot be null.");
		}

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
	 * @precondition newFontSize > 0.0
	 * @throws IllegalArgumentException if newFontSize <= 0.0
	 */
	public void setFontSize(double newFontSize) {
		if (newFontSize <= 0.0) {
			throw new IllegalArgumentException("Invalid font size, font size must be greater than zero (0.0).");
		}
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
