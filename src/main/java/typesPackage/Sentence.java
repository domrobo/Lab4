package typesPackage;


/**
 * The Sentence class represents a sentence as an array of Word objects.
 * It splits a string into words and converts each into a Word object.
 */
public class Sentence {

    /** Array of Word objects representing the words in the sentence */
    private Word[] words;


    /**
     * Constructs a Sentence object from the given string.
     * Splits the string by whitespace and common punctuation, then converts each
     * substring into a Word object.
     *
     * @param sentence the string representing the sentence
     */
    public Sentence(String sentence){
        String[] splitWords = sentence.split("[\\s,.!?]+");
        words = new Word[splitWords.length];
        for (int i = 0; i < splitWords.length; i++)
            words[i] = new Word(splitWords[i]);


    }
    /**
     * Returns the array of Word objects in this sentence.
     *
     * @return an array of Word objects
     */
    public Word[] getWords() {
        return words;
    }

    /**
     * Returns the string representation of the sentence.
     * Concatenates all Word objects with spaces.
     *
     * @return a string representing the sentence
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            sb.append(words[i]);
            if (i < words.length - 1) sb.append(" ");
        }
        return sb.toString();
    }
}
