package typesPackage;
/**
 * The Word class represents a word composed of an array of Letter objects.
 * Implements the Comparable interface to allow comparison of words.
 */
public class Word implements Comparable<Word> {
    /** Array of letters that make up the word */
    private Letter[] letters;

    /**
     * Returns the array of letters that make up the word.
     *
     * @return an array of Letter objects
     */
    public Letter[] getLetters() {
        return letters;
    }

    /**
     * Constructs a Word object from the given string.
     * Each character of the string is converted into a Letter object.
     *
     * @param word the string repred intosenting the word
     */
    public Word(String word){
        letters = new Letter[word.length()];
        for (int i = 0; i < word.length(); i++){
            letters[i] = new Letter(word.charAt(i));
        }
    }
    /**
     * Returns the string representation of the word.
     * Concatenates all letters in the letters array into a single string.
     *
     * @return a string representing the word
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Letter l : letters) {
            sb.append(l);
        }
        return sb.toString();
    }
    /**
     * Compares this word with another word lexicographically.
     * Used for sorting and other operations that require comparison.
     *
     * @param o the other Word to compare with
     * @return a negative integer if this &lt; o, zero if this == o, a positive integer if this &gt; o
     */
    @Override
    public int compareTo(Word o) {
        return this.toString().compareTo(o.toString());
    }

    /**
     * Compares this Word object with another object for equality.
     * Two Word objects are considered equal if their string representations are equal.
     *
     * @param obj the object to compare with
     * @return true if this Word is equal to the given object, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Word other = (Word) obj;
        return this.toString().equals(other.toString());
    }

    /**
     * Returns the hash code value for this Word object.
     * The hash code is computed based on the string representation of the Word.
     *
     * @return the hash code of this Word
     */
    @Override
    public int hashCode() {
        return toString().hashCode();
    }

}
