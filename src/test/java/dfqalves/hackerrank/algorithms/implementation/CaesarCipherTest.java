package dfqalves.hackerrank.algorithms.implementation;

import dfqalves.hackerrank.HackerrankTest;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 * Created by diegoalves on 22/01/2016.
 */
public class CaesarCipherTest extends HackerrankTest{

    @Test
    public void testMain() throws Exception {
        in("11\nmiddle-Outz\n2");
        CaesarCipher.main(null);
        out("okffng-Qwvb");

    }

    @Test
    public void testMainA() throws Exception {
        in("5\nzz-zz\n24");
        CaesarCipher.main(null);
        out("xx-xx");
    }
}