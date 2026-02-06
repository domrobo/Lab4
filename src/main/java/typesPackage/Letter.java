package typesPackage;

/**
 * The Letter class represents a single character.
 * Each Letter object stores one character and provides methods to access it.
 */
public class Letter {
    /** The character stored in this Letter */
    private char myChar;

    /**
     * Constructs a Letter object with the given character.
     *
     * @param myChar the character to store in this Letter
     */
    public Letter(char myChar){
        this.myChar = myChar;
    }

    /**
     * Returns the character stored in this Letter.
     *
     * @return the character
     */
    public char getMyChar(){
       return myChar;
    }

    /**
     * Returns the string representation of this Letter.
     * Essentially converts the character to a String.
     *
     * @return a String containing the character
     */
    @Override
    public String toString() {
        return String.valueOf(myChar);
    }



}
