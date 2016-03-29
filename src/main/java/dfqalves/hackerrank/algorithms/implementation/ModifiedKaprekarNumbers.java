package dfqalves.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by cin_dalves on 3/28/16.
 */
public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt(); // lowest
        int q = sc.nextInt(); // highest
        boolean hasAny = false;

        for(long i = p; i <= q; i++) {
            if (isKaprekar(i)) {
                hasAny = true;
                System.out.print(i + " ");
            }
        }

        if(!hasAny) {
            System.out.print("INVALID RANGE");
        }

    }

    static boolean isKaprekar(long n) {
        if(n <= 3) return n == 1;
        int d = Long.toString(n).length();
        long square = n * n;
        int c = Long.toString(square).length() - d;
        int r = Integer.parseInt(Long.toString(square).substring(c));
        int l = Integer.parseInt(Long.toString(square).substring(0, c));
        return l + r == n;
    }
}
