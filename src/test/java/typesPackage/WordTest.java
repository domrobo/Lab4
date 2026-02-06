package typesPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class WordTest {

    @Test
    void testConstructorAndToString() {
        Word word = new Word("Hello");
        assertEquals("Hello", word.toString(), "Word should convert letters to correct string");
    }

    @Test
    void testCompareTo() {
        Word word1 = new Word("Apple");
        Word word2 = new Word("Banana");
        Word word3 = new Word("Apple");

        assertTrue(word1.compareTo(word2) < 0, "Apple should be less than Banana");
        assertEquals(0, word1.compareTo(word3), "Apple should be equal to Apple");
    }


}
