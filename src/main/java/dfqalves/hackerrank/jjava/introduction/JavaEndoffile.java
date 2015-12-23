package dfqalves.hackerrank.jjava.introduction;

import java.util.Scanner;

/**
 * JavaEndoffile.java<br>
 *
 * @author <a href="mailto:dfqalves@gmail.com">Diego Alves</a>
 * @version $Revision: $<br>
 *          $Id: $
 * @since 22/12/15
 */
public class JavaEndoffile {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int i = 1;
        while(sc.hasNextLine()) {
            System.out.println(i++ + " " + sc.nextLine());
        }

    }

}
