package edu.westga.cs6312.ui.testing.textsample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.ui.model.TextSample;

/**
 * Provides unit tests to verify the expected behavior of TextSample's
 * constructor.
 *
 * @author Spencer Dent
 * @version 2021-04-20
 */
public class TextSampleWhenCreateTextSample {

	/**
	 * Tests the constructor to make sure it creates a new TextSample with the given
	 * values.
	 */
	@Test
	public void testTextSampleConstructorShouldCreateNewTextSampleWithProvidedValues() {
		TextSample testTextSample = new TextSample("Hello, World!", "Courier", 12.0);
		String actualOutput = testTextSample.toString();

		assertEquals("message: \"Hello, World!\" font: Courier 12.0", actualOutput);
	}

	/**
	 * Tests the constructor again to prevent the developer from hard-coding the
	 * return values.
	 */
	@Test
	public void testTextSampleConstructorAgainToPreventHardCoding() {
		TextSample testTextSample = new TextSample("Twas brillig, and the slithy toves", "Garamond", 14.0);
		String actualOutput = testTextSample.toString();

		assertEquals("message: \"Twas brillig, and the slithy toves\" font: Garamond 14.0", actualOutput);
	}
}
