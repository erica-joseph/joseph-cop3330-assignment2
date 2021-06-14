package oop.assignment2.ex27;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalDetTest {

    @Test
    void calculator_returns_the_right_answer() {
        CalDet calc = new CalDet();
        boolean expected = true;
        boolean actual = calc.calculator(4);
        assertEquals(expected, actual);
    }

    @Test
    void calculator_returns_the_true_again_answer() {
        CalDet calc = new CalDet();
        boolean expected = true;
        boolean actual = calc.calculator(16);
        assertEquals(expected, actual);
    }
}