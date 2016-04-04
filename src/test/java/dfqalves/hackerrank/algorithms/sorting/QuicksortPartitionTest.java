package dfqalves.hackerrank.algorithms.sorting;

import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by cin_dalves on 4/4/16.
 */
public class QuicksortPartitionTest {
    @Test
    public void testPrint() throws Exception {
        int[] in = {4,5,3,7,2};

        String out = QuicksortPartition.print(4, in,
                (p1, v1) -> v1 < p1,
                (p1, v1) -> v1 == p1,
                (p1, v1) -> v1 > p1
        );

        assertThat(out, is(equalTo("3 2 4 5 7 ")));

    }

}