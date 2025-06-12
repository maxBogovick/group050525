package lesson21.code.practice.junit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterCounterFromTextTest {

    LetterCounterFromText counter = new LetterCounterFromText();

    @Test
    void testCountLetterEmptyText(){
        assertEquals(0, counter.countLetter(""));
    }

    @Test
    void testCountLetterZero(){
        assertEquals(0, counter.countLetter("Hbntrjwplz"));
    }

    @Test
    void testCountLetterNormalText(){
        assertEquals(3, counter.countLetter("Hello World"));
    }
}