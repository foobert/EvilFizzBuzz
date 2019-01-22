package de.xpure.fizzbuzz;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class RobertTests {
    @Test
    void testEmptyList() {
        Robert robert = new RobertImpl();
        List<Integer> numbers = robert.generateNumbers(0);
        Assertions.assertTrue(numbers.isEmpty());
    }

    @Test
    void testNegativeLimit() {
        Robert robert = new RobertImpl();
        List<Integer> numbers = robert.generateNumbers(-1);
        Assertions.assertTrue(numbers.isEmpty());
    }

    @Test
    void testGeneratesNumbersUpTo5() {
        Robert robert = new RobertImpl();
        List<Integer> numbers = robert.generateNumbers(5);
        Assertions.assertEquals(5, numbers.size());

        Assertions.assertEquals(1, (int) numbers.get(0));
        Assertions.assertEquals(2, (int) numbers.get(1));
        Assertions.assertEquals(3, (int) numbers.get(2));
        Assertions.assertEquals(4, (int) numbers.get(3));
        Assertions.assertEquals(5, (int) numbers.get(4));

    }
}
