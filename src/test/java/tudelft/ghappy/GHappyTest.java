package tudelft.ghappy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GHappyTest {
    //EJERCICIO 2:
    @ParameterizedTest(name = "input={0}, expected={1}")
    @CsvSource({
            "xxggxx, true", // caso básico donde todas las "g" son felices
            "xxgxx, false", // "g" solitaria, no es feliz
            "xxggyygxx, false", // "g" solitaria al final
            "xggx, true", // "g" en pareja en el centro
            "xgggx, true", // tres "g" juntas, todas son felices
            "xxggxggxx, true", // varias "g" en pareja
            "xggxggx, true", // "g" en parejas separadas por otra letra
            "gg, true",  // solo dos "g" deberían ser felices
            "g, false",  // una sola "g" no es feliz
            "ggg, true", // tres "g" seguidas todas son felices
            "gggg, true", // cuatro "g" todas felices
    })
    public void testGHappy(String input, boolean expected) {
        GHappy gHappy = new GHappy();
        boolean result = gHappy.gHappy(input);
        Assertions.assertEquals(expected, result);
    }
}