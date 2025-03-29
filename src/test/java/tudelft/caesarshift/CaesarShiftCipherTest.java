package tudelft.caesarshift;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//EJERCICIO 3:

public class CaesarShiftCipherTest {

    public class Wrapper extends CaesarShiftCipher {
        public String callCipher(String message, int shift) {
            return super.CaesarShiftCipher(message, shift);
        }
    }

    @Test
    public void testBasicShift() {
        Wrapper cipher = new Wrapper();
        assertEquals("def", cipher.callCipher("abc", 3));
        assertEquals("abc", cipher.callCipher("xyz", 3));
    }
}
