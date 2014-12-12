package my.ilya.jsf;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import my.ilya.jsf.random.RandomTextAPI;
import my.ilya.jsf.random.RandomTextAPI.OutputTag;
import my.ilya.jsf.random.RandomTextAPI.TextType;
import static org.junit.Assert.*;

public class RandomTextAPITest {
	
	int outputCount = 10;
	int wordCountLower = 3;
	int wordCountUpper = 15;
	
	@Test
	public void testListRandomText() throws Exception {
		RandomTextAPI.TextType type = TextType.gibberish;
		RandomTextAPI.OutputTag output = OutputTag.ul;
		
		RandomTextAPI instance = new RandomTextAPI();
		String result = instance.getRandomText(type, output, outputCount, wordCountLower, wordCountUpper);
		
		int paragraphCount = StringUtils.countMatches(result, "<li>");
		
		assertEquals("Incorrect number of items in the list", outputCount, paragraphCount);
	}
	
	@Test
	public void testGibberishParagraphsRandomText() throws Exception {
		RandomTextAPI.TextType type = TextType.gibberish;
		RandomTextAPI.OutputTag output = OutputTag.p;
		
		RandomTextAPI instance = new RandomTextAPI();
		String result = instance.getRandomText(type, output, outputCount, wordCountLower, wordCountUpper);
		
		int paragraphCount = StringUtils.countMatches(result, "<p>");
		
		assertEquals("Incorrect number of paragraphs", outputCount, paragraphCount);
	}
	
	@Test
	public void testLoremIpsumParagraphsRandomText() throws Exception {
		RandomTextAPI.TextType type = TextType.lorem;
		RandomTextAPI.OutputTag output = OutputTag.p;
		
		RandomTextAPI instance = new RandomTextAPI();
		String result = instance.getRandomText(type, output, outputCount, wordCountLower, wordCountUpper);
		
		int paragraphCount = StringUtils.countMatches(result, "<p>");
		boolean containsLoremIpsum = result.contains("Lorem ipsum");
		
		assertEquals("Incorrect number of paragraphs", outputCount, paragraphCount);
		assertTrue("Lorem Ipsum was not found in the result", containsLoremIpsum);
	}
	
}
