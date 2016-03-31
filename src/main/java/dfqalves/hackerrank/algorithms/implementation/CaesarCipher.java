package dfqalves.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by diegoalves on 22/01/2016.
 */
public class CaesarCipher {

    private static final int A = 'A';
    private static final int Z = 'Z';

    private static final int a = 'a';
    private static final int z = 'z';

    public static void main (String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        int k = in.nextInt() % (Z-A+1);

        String encrypted = "";

        for(int i = 0; i < n; i++)
            encrypted += encrypt(s.charAt(i), k);

        System.out.print(encrypted);
    }

    private static char encrypt(char c, int k) {
        int enc = c + k;
        if(c >= A && c <= Z) {
            return rotate(enc, A, Z);
        } if (c >= a && c <= z) {
            return rotate(enc, a, z);
        } else {
            return c;
        }

    }

    private static char rotate(int enc, int a, int z) {
        return (char) (enc <= z ? enc : enc - z + a - 1);
    }
}
