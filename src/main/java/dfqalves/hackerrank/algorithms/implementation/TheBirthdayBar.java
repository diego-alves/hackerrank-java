package dfqalves.hackerrank.algorithms.implementation;

import java.util.Scanner;

public class TheBirthdayBar {
    static int solve(int n, int[] s, int d, int m){
        int sum = sumFirst(s, m);
        int r = 0;
        int i = m - 1;

        do {
            if(sum == d) r++;
            if(++i >= n) break;
            sum += s[i] - s[i-m];
        } while (true);

        return r;

    }

    private static int sumFirst(int[] s, int m) {
        int sum = 0;
        for(int i=0; i<m; i++) {
            sum += s[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = solve(n, s, d, m);
        System.out.println(result);
    }

}
