package tudelft.mirror;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Ejercicio 4:
// Cadenas Mirror

public class MirrorTest {

    @Test
    public void prueba1() {
        Mirror m = new Mirror();
        assertEquals("aba", m.mirrorEnds("aba"));
    }

    @Test
    public void prueba2() {
        Mirror m = new Mirror();
        assertEquals("ab", m.mirrorEnds("abXYZba"));
    }

    @Test
    public void prueba3() {
        Mirror m = new Mirror();
        assertEquals("a", m.mirrorEnds("abca"));
    }

    @Test
    public void prueba4() {
        Mirror m = new Mirror();
        assertEquals("", m.mirrorEnds("abcdefg"));
    }

    @Test
    public void prueba5() {
        Mirror m = new Mirror();
        assertEquals("racecar", m.mirrorEnds("racecar"));
    }
}
