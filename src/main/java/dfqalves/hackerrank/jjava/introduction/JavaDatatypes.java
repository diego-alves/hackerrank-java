package dfqalves.hackerrank.jjava.introduction;

import java.util.Scanner;

/**
 * Created by diegoalves on 22/12/15.
 */
public class JavaDatatypes {

    public enum Type {
        BYTE(8),
        SHORT(16),
        INT(32),
        LONG(64);

        final int bits;

        Type(int bits) {
            this.bits = bits;
        }

        public boolean canBeFitted(long value) {
            double total = Math.pow(2, bits - 1d);
            return value >= -total && value <= total - 1;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        JavaDatatypes javaDatatypes = new JavaDatatypes();

        for (int i = 0; i < t; i++) {
            javaDatatypes.resolve(sc);
        }
    }


    private void resolve(Scanner sc) {
        try {
            long x = sc.nextLong();
            System.out.println(x + " can be fitted in:");
            for (Type type : Type.values()) {
                if (type.canBeFitted(x)) {
                    System.out.println("* " + type.name().toLowerCase());
                }
            }
        } catch (Exception e) {
            System.out.println(sc.next() + " can't be fitted anywhere.");

        }

    }
}
