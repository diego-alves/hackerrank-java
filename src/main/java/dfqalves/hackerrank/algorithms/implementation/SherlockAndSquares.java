package dfqalves.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by cin_dalves on 3/30/16.
 */
public class SherlockAndSquares {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();

        while(t-- > 0) {
            long a = in.nextLong();
            long b = in.nextLong();
            int count = 0;

            for(int i = 0; i*i <= b; i++) {
                if(i*i >= a) {
                    count++;
                }
            }

            System.out.println(count);

        }
    }
}
