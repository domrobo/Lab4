package typesPackage;

/**
 * The Punctuation class represents a single punctuation character.
 * Each Punctuation object stores one character and provides methods to access it.
 */
public class Punctuation {

    /** The punctuation character stored in this object */
    private char value;

    /**
     * Constructs a Punctuation object with the given character.
     *
     * @param value the punctuation character to store
     */
    public Punctuation(char value) {
        this.value = value;
    }

    /**
     * Returns the punctuation character stored in this object.
     *
     * @return the punctuation character
     */
    public char getValue() {
        return value;
    }

    /**
     * Returns the string representation of this punctuation.
     * Essentially converts the character to a String.
     *
     * @return a String containing the punctuation character
     */
    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
