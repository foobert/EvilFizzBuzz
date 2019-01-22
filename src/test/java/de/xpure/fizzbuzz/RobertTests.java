package de.xpure.fizzbuzz;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RobertTests {
    @Test
    public void testGenerateNumbers() {
        Robert robert = new RobertImpl();
        List<Integer> numbers = robert.generateNumbers(0);
        Assertions.assertTrue(numbers.isEmpty());
    }
}
