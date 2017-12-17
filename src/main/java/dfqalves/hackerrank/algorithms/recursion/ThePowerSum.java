package dfqalves.hackerrank.algorithms.recursion;

import static java.lang.Math.floor;

public class ThePowerSum {

    public static void main(String[] args) {

        System.out.println(resolve(10, 2, 1));

        //System.out.println(resolve(10,2));


    }

    private static int resolve(double total, int pow, int num) {
        double result = Math.pow(num, pow);
        if(result < total) {
            return resolve(total, pow, num+1) + resolve(total - result, pow, num+1);
        } else if (result == total) {
            return 1;
        }
        return 0;

    }

    private static boolean isInteger(double r) {
        return r == floor(r);
    }
}
