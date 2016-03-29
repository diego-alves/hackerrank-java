package dfqalves.hackerrank.algorithms.implementation;

/**
 * Created by cin_dalves on 3/29/16.
 */
public class Encryption {

    static String encrypt(String text){
        Double sqrt = Math.sqrt(text.length());
        int c = Long.valueOf(Math.round(sqrt)).intValue();
        int r = sqrt > c ? c + 1 : c;

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < r; i++) {
            for(int j = 0; j < c; j++) {
                int index = i + j*r;
                if(index >= text.length())
                    break;
                sb.append(text.charAt(index));
            }

            if(i + 1 != r) sb.append(" ");
        }

        return sb.toString();
    }
}
