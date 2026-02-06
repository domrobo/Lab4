package typesPackage;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PunctuationTest {

    @Test
    void testConstructorAndGetter() {
        Punctuation p = new Punctuation('!');
        assertEquals('!', p.getValue(), "Getter should return the correct punctuation character");
    }

    @Test
    void testToString() {
        Punctuation p = new Punctuation('.');
        assertEquals(".", p.toString(), "toString should return the punctuation character as a String");
    }


}
