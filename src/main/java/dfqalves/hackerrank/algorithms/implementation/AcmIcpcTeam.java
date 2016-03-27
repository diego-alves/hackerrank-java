package dfqalves.hackerrank.algorithms.implementation;

/**
 * Created by diegoalves on 27/03/16.
 */

import java.util.Scanner;

public class AcmIcpcTeam {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of people
        int m = sc.nextInt(); // number of topics
        int max = 0;
        int teams = 0;

        boolean[][] matrix = readMatrix(sc, n, m);

        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {

                int topics = calcTopics(matrix[i], matrix[j]);

                if(topics > max) {
                    max = topics;
                    teams = 1;
                } else if(topics == max){
                    teams++;
                }

            }
        }

        System.out.println(max);
        System.out.println(teams);

    }

    static int calcTopics(boolean[] a, boolean[] b) {
        int count = 0;
        for(int i = 0; i < b.length; i++)
            if(a[i] || b[i])
                count++;
        return count;
    }


    static boolean[][] readMatrix(Scanner sc, int n, int m){
        boolean[][] r = new boolean[n][m];
        for(int i = 0; i < n; i++) {
            char[] charArray = sc.next().toCharArray();
            for (int j = 0; j < charArray.length; j++) {
                r[i][j] = (charArray[j] == '1');
            }
        }
        return r;
    }
}
