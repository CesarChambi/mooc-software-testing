package tudelft.numfinderTest;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumFinderTest {

    @Test
    void pruebaNumerosPositivos() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{4, 25, 7, 9});
        assertEquals(25, nf.getLargest());
        assertEquals(4, nf.getSmallest());
    }

    @Test
    void pruebaNumerosNegativos() {
        NumFinder nf = new NumFinder();
        nf.find(new int[]{-4, -3, -2, -1});
        assertEquals(-1, nf.getLargest());
        assertEquals(-4, nf.getSmallest());
    }
//
}
