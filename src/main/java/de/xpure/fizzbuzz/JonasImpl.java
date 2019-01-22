package de.xpure.fizzbuzz;

/**
 * Created by jherrig on 22.01.19.
 */
public class JonasImpl implements Jonas{
    public String resolveFizzBuzz (int fizzBuzzCandidate) {
        if ((fizzBuzzCandidate % 3 == 0) && (fizzBuzzCandidate % 5 == 0)) {
            return "FizzBuzz";
        }
        return Integer.toString(fizzBuzzCandidate);
    }
}
