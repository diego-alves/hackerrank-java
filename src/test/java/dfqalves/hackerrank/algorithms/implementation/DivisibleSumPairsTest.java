package dfqalves.hackerrank.algorithms.implementation;

import org.testng.annotations.Test;

import static dfqalves.hackerrank.algorithms.implementation.DivisibleSumPairs.divisibleSumPairs;
import static org.testng.Assert.*;

public class DivisibleSumPairsTest {
    @Test
    public void testDivisibleSumPairs() throws Exception {
        assertEquals(divisibleSumPairs(6,3, new int[]{1, 3, 2, 6, 1, 2}), 5);
    }

}