package dfqalves.hackerrank.algorithms.implementation;

/**
 * Created by cin_dalves on 3/29/16.
 */
public class LarrysArray {

    private final static int SIZE = 3;

    static boolean sort(int[] arr) {

        for(int i = arr.length -1 ; i >= 1; i--) {
            for(int j = 0; j < i; j++) {


                if(arr[j] > arr[j+1]) {
                    if(arr[j+1] > arr[j+2]) {
                        if(!rotate(arr, j))
                            return false;
                    }

                    if(!rotate(arr, j))
                        return false;

                }
            }
        }

        return true;

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
