package typesPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LetterTest {

    @Test
    void testConstructorAndGetter() {
        Letter letter = new Letter('A');
        assertEquals('A', letter.getMyChar(), "Getter should return the correct character");
    }

    @Test
    void testToString() {
        Letter letter = new Letter('B');
        assertEquals("B", letter.toString(), "toString should return the character as a String");
    }

    @Test
    void testMultipleLetters() {
        Letter[] letters = {
                new Letter('X'),
                new Letter('y'),
                new Letter('1')
        };

        assertEquals('X', letters[0].getMyChar());
        assertEquals('y', letters[1].getMyChar());
        assertEquals('1', letters[2].getMyChar());

        assertEquals("X", letters[0].toString());
        assertEquals("y", letters[1].toString());
        assertEquals("1", letters[2].toString());
    }
}
