package typesPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TextTest {

    @Test
    void testConstructorAndGetSentences() {
        String input = "Hello world! This is a test. Another sentence?";
        Text text = new Text(input);

        Sentence[] sentences = text.getSentences();
        assertEquals(3, sentences.length, "Text should split into 3 sentences");

        assertEquals("Hello world", sentences[0].toString());
        assertEquals("This is a test", sentences[1].toString());
        assertEquals("Another sentence", sentences[2].toString());
    }

    @Test
    void testToString() {
        String input = "Hi there! How are you?";
        Text text = new Text(input);

        String reconstructed = text.toString();
        assertEquals("Hi there How are you", reconstructed,
                "toString should concatenate sentences without punctuation");
    }

    @Test
    void testSetSentences() {
        Text text = new Text("First sentence.");
        Sentence newSentence = new Sentence("Updated sentence");
        text.setSentences(new Sentence[]{newSentence});

        Sentence[] sentences = text.getSentences();
        assertEquals(1, sentences.length, "Text should have 1 sentence after setSentences");
        assertEquals("Updated sentence", sentences[0].toString());
    }
}
