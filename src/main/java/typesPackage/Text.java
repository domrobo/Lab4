package typesPackage;

/**
 * The Text class represents a text composed of multiple sentences.
 * It splits the input string into sentences and stores them as Sentence objects.
 */
public class Text {

    /** Array of Sentence objects representing the sentences in the text */
    private Sentence[] sentences;

    /**
     * Constructs a Text object from the given string.
     * Normalizes whitespace and splits the text into sentences based on punctuation (.!?).
     *
     * @param text the string representing the text
     */
    public Text(String text) {
        // Normalize tabs and multiple spaces to a single space
        text = text.replaceAll("[\\t ]+", " ");

        // Split text into sentences at ., !, or ? (keeping the punctuation)
        String[] rawSentences = text.split("(?<=[.!?])");

        // Convert each raw sentence into a Sentence object
        sentences = new Sentence[rawSentences.length];
        for (int i = 0; i < rawSentences.length; i++) {
            sentences[i] = new Sentence(rawSentences[i].strip());
        }
    }

    /**
     * Sets the sentences for this text.
     *
     * @param sentences an array of Sentence objects
     */
    public void setSentences(Sentence[] sentences) {
        this.sentences = sentences;
    }

    /**
     * Returns the sentences of this text.
     *
     * @return an array of Sentence objects
     */
    public Sentence[] getSentences() {
        return sentences;
    }

    /**
     * Returns the string representation of the text.
     * Concatenates all sentences into a single string with spaces.
     *
     * @return the full text as a string
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Sentence s : sentences) {
            sb.append(s.toString()).append(" ");
        }
        return sb.toString().strip();
    }
}
