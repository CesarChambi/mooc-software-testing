package tudelft.sum;

import java.util.ArrayList;
import java.util.Collections;

// Ejercicio 2:
// Sumar dos números

class TwoNumbersSum {

    public ArrayList<Integer> addTwoNumbers(ArrayList<Integer> first, ArrayList<Integer> second) {
        Collections.reverse(first);
        Collections.reverse(second);

        int complement = 0;
        ArrayList<Integer> result = new ArrayList<>();

        for(int i = 0; i < Math.max(first.size(), second.size()); i++){
            int firstVal = i < first.size() ? first.get(i) : 0;
            int secondVal = i < second.size() ? second.get(i) : 0;
            int total = firstVal + secondVal + complement;
            complement = total >= 10 ? 1 : 0;
            result.add(total % 10);
        }

        // agregar el acarreo final si queda pendiente
        if (complement == 1) {
            result.add(complement);
        }

        Collections.reverse(result);
        return result;
    }
}
