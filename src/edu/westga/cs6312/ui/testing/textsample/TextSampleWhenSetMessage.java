package edu.westga.cs6312.ui.testing.textsample;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import edu.westga.cs6312.ui.model.TextSample;

/**
 * Provides unit tests to verify the expected behavior of TextSample's
 * setMessage and getMessage methods.
 *
 * @author Spencer Dent
 * @version 2021-04-20
 */
public class TextSampleWhenSetMessage {

	/**
	 * Tests getMessage on a newly created TextSample to make sure it returns the
	 * message used to create the TextSample.
	 */
	@Test
	public void testTextSampleGetMessageOnNewTextSampleShouldReturnMessageOfNewlyCreatedTextSample() {
		TextSample testTextSample = new TextSample("The quick brown fox jumps over the lazy dog", "Times New Roman",
				24.0);
		String actualMessage = testTextSample.getMessage();

		assertEquals("The quick brown fox jumps over the lazy dog", actualMessage);
	}

	/**
	 * Tests setMessage to make sure it changes the TextSample's message to the given
	 * String.
	 */
	@Test
	public void testTextSampleSetMessageShouldChangeMessageToGivenString() {
		String expectedMessage = "Goodbye, World...";

		TextSample testTextSample = new TextSample("Hello, World!", "Courier", 12.0);
		testTextSample.setMessage(expectedMessage);
		String actualMessage = testTextSample.getMessage();

		assertEquals(expectedMessage, actualMessage);
	}

	/**
	 * Tests setMessage again to prevent the developer from hard-coding the returned
	 * String.
	 */
	@Test
	public void testTextSampleSetMessageAgainToPreventHardCoding() {
		String expectedMessage = "Did gyre and gimble in the wabe:";

		TextSample testTextSample = new TextSample("Twas brillig, and the slithy toves", "Garamond", 14.0);
		testTextSample.setMessage(expectedMessage);
		String actualMessage = testTextSample.getMessage();

		assertEquals(expectedMessage, actualMessage);
	}
}
