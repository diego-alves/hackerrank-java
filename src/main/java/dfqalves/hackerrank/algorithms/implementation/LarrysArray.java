package dfqalves.hackerrank.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by cin_dalves on 3/29/16.
 */
public class LarrysArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = readArray(sc, n);
            System.out.println(sort(arr) ? "YES" : "NO");
        }
    }

    static int[] readArray(Scanner sc, int n){
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        return arr;
    }

    static boolean sort(int[] arr) {

        for(int i = arr.length -2 ; i >= 1; i--) {
            for(int j = 0; j < i; j++) {

                if(arr[j+1] > arr[j+2]) {
                    if (!rotate(arr, j))
                        return false;
                }

                if(arr[j] > arr[j+2]) {
                    if(!rotate(arr, j))
                        return false;

                }
            }
        }

        return arr[0] < arr[1];

    }

    static boolean rotate(int[] arr, int index) {
        if(index + 2 >= arr.length)
            return false;

        int aux = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = arr[index+2];
        arr[index+2] = aux;

        return true;
    }
}
