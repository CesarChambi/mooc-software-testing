package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    // Se agrega ese test para asegurar que las palabras que terminan en 'r' tambien se cuenten
    // correctamente al final de la cadena
    @Test
    public void lastWordEndsInR() {
        int words = new CountLetters().count("car");
        Assertions.assertEquals(1, words);
    }

}