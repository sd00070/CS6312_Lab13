package edu.westga.cs6312.ui.testing.textsample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.ui.model.TextSample;

/**
 * Provides unit tests to verify the expected behavior of TextSample's
 * setFontSize and getFontSize methods.
 *
 * @author Spencer Dent
 * @version 2021-04-20
 */
public class TextSampleWhenSetFontSize {

	/**
	 * Tests getFontSize on a newly created TextSample to make sure it returns the
	 * font size used to create the TextSample.
	 */
	@Test
	public void testTextSampleGetFontSizeOnNewTextSampleShouldReturnFontSizeOfNewlyCreatedTextSample() {
		TextSample testTextSample = new TextSample("The quick brown fox jumps over the lazy dog", "Times New Roman",
				24.0);
		double actualFontSize = testTextSample.getFontSize();

		assertEquals(24.0, actualFontSize);
	}

	/**
	 * Tests setFontSize to make sure it changes the TextSample's font size to the
	 * given value.
	 */
	@Test
	public void testTextSampleSetFontSizeShouldChangeFontSizeToGivenValue() {
		double expectedFontSize = 10.0;

		TextSample testTextSample = new TextSample("Hello, World!", "Courier", 12.0);
		testTextSample.setFontSize(expectedFontSize);
		double actualFontSize = testTextSample.getFontSize();

		assertEquals(expectedFontSize, actualFontSize);
	}

	/**
	 * Tests setFontSize again to prevent the developer from hard-coding the return
	 * value.
	 */
	@Test
	public void testTextSampleSetFontSizeAgainToPreventHardCoding() {
		double expectedFontSize = 32.0;

		TextSample testTextSample = new TextSample("Twas brillig, and the slithy toves", "Garamond", 14.0);
		testTextSample.setFontSize(expectedFontSize);
		double actualFontSize = testTextSample.getFontSize();

		assertEquals(expectedFontSize, actualFontSize);
	}
}
