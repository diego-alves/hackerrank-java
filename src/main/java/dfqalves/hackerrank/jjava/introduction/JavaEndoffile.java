package dfqalves.hackerrank.jjava.introduction;

import java.util.ArrayList;
import java.util.List;
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
        List<String> list = new ArrayList<String>();

        while(sc.hasNextLine()) {
            list.add(sc.nextLine());
        }

        int i = 1;
        for (String s : list) {
            System.out.println(i++ + " " + s);
        }

    }

}
