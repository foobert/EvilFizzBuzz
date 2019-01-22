package de.xpure.fizzbuzz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RobertImpl implements Robert {
    public List<Integer> generateNumbers(int limit) {
        if (limit <= 0) {
            return Collections.emptyList();
        }
        List<Integer> numbers = new ArrayList<>(limit);
        for (int i = 1; i <= limit; i++) {
            numbers.add(i);
        }
        return numbers;
    }
}
