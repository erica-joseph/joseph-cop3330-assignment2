package oop.assignment2.ex31;

import oop.assignment2.ex24.base.AnaDet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class bpmTest {

    @Test
    void bpmRate_returns_true_statement() {
        bpm beep = new bpm();

        boolean actual = beep.bpmRate(35,72);
        boolean expected = true;
    }

    @Test
    void bpmRate_returns_true_again_statement() {
        bpm beep = new bpm();

        boolean actual = beep.bpmRate(10,82);
        assertTrue(actual);
    }
}