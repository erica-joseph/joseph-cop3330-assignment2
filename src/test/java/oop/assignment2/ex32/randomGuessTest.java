package oop.assignment2.ex32;

import oop.assignment2.ex27.CalDet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class randomGuessTest {

    @Test

        void calculator_returns_the_right_answer() {
            randomGuess play = new randomGuess();
            boolean expected = true;
            boolean actual = play.player(3,1 + (int) (10 * Math.random()));
            assertEquals(expected, actual);

    }
}