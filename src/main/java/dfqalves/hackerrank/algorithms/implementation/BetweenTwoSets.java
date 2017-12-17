package dfqalves.hackerrank.algorithms.implementation;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class BetweenTwoSets {

    private static int getTotalX(List<Integer> aList, List<Integer> bList) {
        Integer maxA = aList.stream().max(Integer::compare).get();
        Integer minB = bList.stream().min(Integer::compare).get();

        int n = 1;
        int total = 0;
        while (maxA*n <= minB) {
            if(validate(maxA*n, aList, bList)) {
                total++;
            }
            n++;
        }

        int[] a = new int[] { 1, 2 };

        return total;



    }

    private static boolean validate(Integer n, List<Integer> a, List<Integer> b) {
        for (int anA : a) if (n  % anA != 0) return false;
        for (int  aB : b) if (aB % n   != 0) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Integer n = in.nextInt();
        Integer m = in.nextInt();
        Integer[] a = new Integer[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        Integer[] b = new Integer[m];
        for(int b_i = 0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int total = getTotalX(Arrays.asList(a), Arrays.asList(b));
        System.out.println(total);
        in.close();
    }
}
