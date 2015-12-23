package dfqalves.hackerrank.jjava.introduction;

import static java.lang.Math.pow;

import java.util.Scanner;

/**
 * JavaLoops.java<br>
 *
 * @author <a href="mailto:dfqalves@gmail.com">Diego Alves</a>
 * @version $Revision: $<br>
 *          $Id: $
 * @since 21/12/15
 */
public class JavaLoops {

    private final static int A = 0;
    private final static int B = 1;
    private final static int N = 2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i ++)
            new JavaLoops().resolve(sc);

    }

    private void resolve(Scanner sc) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();

        int r = 0;

        for (int j = 0; j < n; j++) {
            if(j == 0) {
                r = (int) (a + pow(2, j) * b);
                System.out.print(r + " ");
            } else {
                r = (int) (r + pow(2, j) * b);
                System.out.print(r + " ");
            }
        }
        System.out.println("");
    }

}
