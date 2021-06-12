package oop.assignment2.ex24.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnaDetTest {

    @Test
    void isAnagram_returns_true_for_anagrams(){
        AnaDet detector = new AnaDet();

        boolean actual = detector.isAna("note","tone");
        boolean expected = true;

        assertTrue(actual);
    }

    @Test
    void isAnagram_returns_false_for_anagrams(){
        AnaDet detector = new AnaDet();

        boolean actual = detector.isAna("note","done");
        boolean expected = true;

        assertFalse(actual);
    }

}