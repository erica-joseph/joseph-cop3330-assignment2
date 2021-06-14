package oop.assignment2.ex33;

import oop.assignment2.ex27.CalDet;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConchDetTest {

    @Test
    void response_conch_true() {
        ConchDet conch = new ConchDet();
        boolean expected = true;
        boolean actual = conch.response("Is Squidward the best character in Spongebob?");
        assertEquals(expected, actual);
    }
}