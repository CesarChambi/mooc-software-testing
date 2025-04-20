package tudelft.blackjack;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackJackLineCoverageTest {
    // Cuando solo se ejecuta el primer metodo, se cubren los if(ln > 21) y if(rn > 21)
    // y el else, pero no el if(ln > rn) -> cobertura parcial.
    @Test
    public void bothPlayersGoTooHigh() {
        int result = new BlackJack().play(30, 30);
        Assertions.assertEquals(0, result);
    }


    // Cuando solo se ejecuta el segundo metodo, se cubren las comparaciones normales donde
    // ninguno excede 21 y ln > rn se cumple -> tambien cobertura parcial.
    @Test
    public void leftPlayerWins() {
        int result = new BlackJack().play(10, 9);
        Assertions.assertEquals(10, result);
    }

}
