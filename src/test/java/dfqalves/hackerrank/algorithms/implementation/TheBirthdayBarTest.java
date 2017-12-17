package dfqalves.hackerrank.algorithms.implementation;

import org.testng.annotations.Test;

import static dfqalves.hackerrank.algorithms.implementation.TheBirthdayBar.solve;
import static org.testng.Assert.*;

public class TheBirthdayBarTest {
    @Test
    public void testSolve() throws Exception {
        assertEquals(solve(5, new int[] {1, 2, 1, 3, 2}, 3, 2), 2);
    }

    @Test
    public void testSolveOneElement() throws Exception {
        assertEquals(solve(1, new int[] {4}, 4, 1), 1);
    }

}