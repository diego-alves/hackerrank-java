package dfqalves.hackerrank.jjava.introduction;

import org.testng.annotations.Test;

import static org.testng.internal.junit.ArrayAsserts.assertArrayEquals;

/**
 * Created by diegoalves on 22/12/15.
 */
public class JavaLoopsTest {

    @Test
    public void test(){
        int arr[][] = {
                {0, 2, 10},
                {5, 3,  5}
        };
        int[][] r = JavaLoops.resolve(arr);
        assertArrayEquals(new int[]{2, 6, 14, 30, 62, 126, 254, 510, 1022, 2046}, r[0]);
        assertArrayEquals(new int[]{8, 14, 26, 50, 98}, r[1]);

    }

}