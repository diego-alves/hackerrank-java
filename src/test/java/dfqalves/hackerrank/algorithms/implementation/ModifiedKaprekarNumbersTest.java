package dfqalves.hackerrank.algorithms.implementation;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

import static dfqalves.hackerrank.algorithms.implementation.ModifiedKaprekarNumbers.isKaprekar;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

/**
 * Created by cin_dalves on 3/29/16.
 */
public class ModifiedKaprekarNumbersTest {


    @Test
    public void testIsKaprekar() throws Exception {
        List<Integer> r = Arrays.asList(1, 9, 45, 55, 99, 297, 703, 999, 2223, 2728, 4950, 5050, 7272,
                7777, 9999, 17344, 22222, 77778, 82656, 95121, 99999);

        for (int i = 1; i < 99999; i++) {
            assertThat("i="+i, isKaprekar(i), is(r.contains(i)));
        }

    }

    @Test public void test10IsKaprekar() {
        assertThat(isKaprekar(77778), is(true));
    }
}