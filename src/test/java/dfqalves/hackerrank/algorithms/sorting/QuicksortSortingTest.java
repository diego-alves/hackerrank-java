package dfqalves.hackerrank.algorithms.sorting;

import dfqalves.hackerrank.algorithms.sorting.QuicksortSorting.Node;
import org.testng.annotations.Test;

import static dfqalves.hackerrank.algorithms.sorting.QuicksortSorting.sort;
import static org.testng.Assert.*;

/**
 * Created by cin_dalves on 4/4/16.
 */
public class QuicksortSortingTest {
    @Test
    public void testSort() throws Exception {

        Node n = new Node(5);

        for(int i : new int[]{8, 1, 3, 7, 9, 2})
            n.setNext(new Node(i));

        sort(n);

        //System.out.println();

    }



}