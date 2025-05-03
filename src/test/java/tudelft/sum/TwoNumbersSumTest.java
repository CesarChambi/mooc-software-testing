package tudelft.sum;

import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;

// Ejercicio 2:
// Sumar dos números

public class TwoNumbersSumTest {

    @Test
    public void Prueba1() {
        TwoNumbersSum suma = new TwoNumbersSum();
        ArrayList<Integer> resultado = suma.addTwoNumbers(
                new ArrayList<>(Arrays.asList(4, 3)), // 43
                new ArrayList<>(Arrays.asList(5, 2)) // 52
        );
        assertEquals(Arrays.asList(9, 5), resultado); // 43 + 52 = 95
    }

    @Test
    public void Prueba2() {
        TwoNumbersSum suma = new TwoNumbersSum();
        ArrayList<Integer> resultado = suma.addTwoNumbers(
                new ArrayList<>(Arrays.asList(8, 9)), // 89
                new ArrayList<>(Arrays.asList(2, 1)) // 21
        );
        assertEquals(Arrays.asList(1, 1, 0), resultado); // 89 + 21 = 110
    }

    @Test
    public void Prueba3() {
        TwoNumbersSum suma = new TwoNumbersSum();
        ArrayList<Integer> resultado = suma.addTwoNumbers(
                new ArrayList<>(Arrays.asList(7, 1, 4)), // 714
                new ArrayList<>(Arrays.asList(5, 6))  // 56
        );
        assertEquals(Arrays.asList(7, 7, 0), resultado); // 714 + 56 = 770
    }

    @Test
    public void Prueba4() {
        TwoNumbersSum suma = new TwoNumbersSum();
        ArrayList<Integer> resultado = suma.addTwoNumbers(
                new ArrayList<>(Arrays.asList(6)), // 6
                new ArrayList<>(Arrays.asList(7)) // 7
        );
        assertEquals(Arrays.asList(1, 3), resultado); // 6 + 7 = 13
    }

    @Test
    public void Prueba5() {
        TwoNumbersSum suma = new TwoNumbersSum();
        ArrayList<Integer> resultado = suma.addTwoNumbers(
                new ArrayList<>(Arrays.asList(9, 9, 9)), // 999
                new ArrayList<>(Arrays.asList(1))  // 1
        );
        assertEquals(Arrays.asList(1, 0, 0, 0), resultado); // 999 + 1 = 1000
    }
}
