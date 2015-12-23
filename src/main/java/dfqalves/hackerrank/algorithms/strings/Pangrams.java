package dfqalves.hackerrank.algorithms.strings;

import java.util.Scanner;

/**
 * Created by diegoalves on 23/12/15.
 */
public class Pangrams {
    final static String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    public static final char HIPHEN = '-';
    public static final String NOT = "not ";
    public static final String PANGRAM = "pangram";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            new Pangrams().resolve(in);
        }

    }

    private void resolve(Scanner in) {
        char[] alph = ALPHABET.toCharArray();
        String phrase = in.nextLine();
        for (char c : phrase.toLowerCase().toCharArray()) {
            for (int i = 0; i < alph.length; i++) {
                if (alph[i] == c) alph[i] = HIPHEN;
            }
        }
        if (hasLetter(alph)) {
            System.out.print(NOT);
        }
        System.out.println(PANGRAM);
    }

    private boolean hasLetter(char[] alph) {
        for (char a : alph) {
            if (a != '-') {
                return true;
            }
        }
        return false;
    }

}
