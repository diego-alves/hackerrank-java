package dfqalves.hackerrank.algorithms.implementation;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by cin_dalves on 3/29/16.
 */
public class LarrysArrayTest {

    @Test
    public void testSort123() throws Exception {
        int[] arr = {3,1,2};
        boolean sort = LarrysArray.sort(arr);
        assertThat(arr, is(equalTo(new int[]{1,2,3})));
        assertThat(sort, is(true));
    }

    @Test
    public void testSort1234() throws Exception {
        int[] arr = {1,3,4,2};
        boolean sort = LarrysArray.sort(arr);
        assertThat(arr, is(equalTo(new int[]{1,2,3,4})));
        assertThat(sort, is(true));
    }

    @Test
    public void testSort12345() throws Exception {
        int[] arr = {1,2,3,5,4};
        boolean sort = LarrysArray.sort(arr);
        assertThat(sort, is(false));
    }

    @Test
    public void testSort() throws Exception {
        int[] arr = {3,1,2};
        boolean sort = LarrysArray.sort(arr);
        assertThat(arr, is(equalTo(new int[]{1,2,3})));
        assertThat(sort, is(true));
    }

    @Test
    public void testRotate123() throws Exception {
        int[] arr = {3,1,2};
        boolean rotate = LarrysArray.rotate(arr, 0);
        assertThat(arr, is(equalTo(new int[]{1,2,3})));
        assertThat(rotate, is(true));
    }

    @Test
    public void testRotate12345() throws Exception {
        int[] arr = {1,4,2,3,5};
        boolean rotate = LarrysArray.rotate(arr, 1);
        assertThat(rotate, is(true));
        assertThat(arr, is(equalTo(new int[]{1,2,3,4,5})));
    }

    @Test
    public void testRotate12345_4() throws Exception {
        int[] arr = {1,4,2,3,5};
        boolean rotate = LarrysArray.rotate(arr, 3);
        assertThat(rotate, is(false));
    }
}