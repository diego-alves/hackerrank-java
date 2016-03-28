package dfqalves.hackerrank.algorithms.implementation;

import java.math.BigInteger;
import java.util.Scanner;

import static java.math.BigInteger.ONE;

/**
 * Created by diegoalves on 27/03/16.
 */
public class ExtraLongFactorials {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        BigInteger n = sc.nextBigInteger();
        BigInteger r = ONE;

        while(n.compareTo(ONE) > 0) {
            r = r.multiply(n);
            n = n.subtract(ONE);
        }

        System.out.print(r);

    }

}
