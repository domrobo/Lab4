package typesPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SentenceTest {

    @Test
    void testConstructorAndGetWords() {
        Sentence sentence = new Sentence("Hello world!");
        Word[] words = sentence.getWords();

        assertEquals(2, words.length, "Sentence should have 2 words");
        assertEquals("Hello", words[0].toString());
        assertEquals("world", words[1].toString());
    }

    @Test
    void testToString() {
        Sentence sentence = new Sentence("This is a test.");
        String reconstructed = sentence.toString();
        assertEquals("This is a test", reconstructed, "toString should concatenate all words with spaces");
    }

    @Test
    void testSentenceWithPunctuation() {
        Sentence sentence = new Sentence("Hi, there! How are you?");
        Word[] words = sentence.getWords();

        assertEquals(5, words.length, "Sentence should split words correctly ignoring punctuation");
        assertEquals("Hi", words[0].toString());
        assertEquals("there", words[1].toString());
        assertEquals("How", words[2].toString());
        assertEquals("are", words[3].toString());
        assertEquals("you", words[4].toString());
    }
}
