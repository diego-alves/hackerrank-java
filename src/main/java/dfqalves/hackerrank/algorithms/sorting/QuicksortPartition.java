package dfqalves.hackerrank.algorithms.sorting;

import java.util.Scanner;

/**
 * Created by cin_dalves on 4/4/16.
 */
public class QuicksortPartition {

     interface Oper {
        boolean solve(int p, int v);
    }

    public static void main(String[] args) {
        int[] arr = readArray();
        int p = arr[0];

        String out = print(p, arr,
                (p1, v1) -> v1 < p1,
                (p1, v1) -> v1 == p1,
                (p1, v1) -> v1 > p1
        );

        System.out.print(out);

    }

    static String print(int p, int[] arr, Oper... opers){
        StringBuilder sb = new StringBuilder();

        for(Oper oper : opers) {
            for (int n : arr) {
                if (oper.solve(p, n)) {
                    sb.append(n).append(" ");
                }
            }
        }

        return sb.toString();

    }

    static int[] readArray() {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        return arr;
    }
}
