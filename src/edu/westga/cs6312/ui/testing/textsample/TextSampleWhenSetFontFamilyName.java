package edu.westga.cs6312.ui.testing.textsample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.ui.model.TextSample;

/**
 * Provides unit tests to verify the expected behavior of TextSample's
 * setFontFamilyName and getFontFamilyName methods.
 *
 * @author Spencer Dent
 * @version 2021-04-20
 */
public class TextSampleWhenSetFontFamilyName {

	/**
	 * Tests getFontFamilyName on a newly created TextSample to make sure it returns
	 * the font family name used to create the TextSample.
	 */
	@Test
	public void testTextSampleGetFontFamilyNameOnNewTextSampleShouldReturnFontFamilyNameOfNewlyCreatedTextSample() {
		TextSample testTextSample = new TextSample("The quick brown fox jumps over the lazy dog", "Times New Roman",
				24.0);
		String actualFontFamilyName = testTextSample.getFontFamilyName();

		assertEquals("Times New Roman", actualFontFamilyName);
	}

	/**
	 * Tests setFontFamilyName to make sure it changes the TextSample's font family
	 * name to the given String.
	 */
	@Test
	public void testTextSampleSetFontFamilyNameShouldChangeFontFamilyNameToGivenString() {
		String expectedFontFamilyName = "Courier New";

		TextSample testTextSample = new TextSample("Hello, World!", "Courier", 12.0);
		testTextSample.setFontFamilyName(expectedFontFamilyName);
		String actualFontFamilyName = testTextSample.getFontFamilyName();

		assertEquals(expectedFontFamilyName, actualFontFamilyName);
	}

	/**
	 * Tests setFontFamilyName again to prevent the developer from hard-coding the returned
	 * String.
	 */
	@Test
	public void testTextSampleSetFontFamilyNameAgainToPreventHardCoding() {
		String expectedFontFamilyName = "Trebuchet MS";

		TextSample testTextSample = new TextSample("Twas brillig, and the slithy toves", "Garamond", 14.0);
		testTextSample.setFontFamilyName(expectedFontFamilyName);
		String actualFontFamilyName = testTextSample.getFontFamilyName();

		assertEquals(expectedFontFamilyName, actualFontFamilyName);
	}
}
