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
        int[][] in = new int[t][3];

        for(int i = 0; i < t; i ++)
            for(int j =
                0; j < 3; j++)
                in[i][j] = sc.nextInt();

        for (int[] ints : resolve(in)) {
            for (int anInt : ints) {
                System.out.printf("%d ", anInt);
            }
            System.out.println();
        }
    }

    public static int[][] resolve(int[][] in) {
        int r[][] = new int[in.length][];

        for(int i = 0; i < in.length; i++) {
            int a = in[i][A];
            int b = in[i][B];
            int n = in[i][N];
            r[i] = new int[n];

            for (int j = 0; j < n; j++)
                if(j == 0)
                    r[i][j] = (int) (a + pow(2,j) * b);
                else
                    r[i][j] = (int) (r[i][j-1] + pow(2,j)*b);

        }
        return r;
    }

}
