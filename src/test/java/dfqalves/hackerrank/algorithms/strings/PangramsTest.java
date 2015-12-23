package dfqalves.hackerrank.algorithms.strings;

import dfqalves.hackerrank.HackerrankTest;
import org.testng.annotations.Test;

/**
 * Created by diegoalves on 23/12/15.
 */
public class PangramsTest extends HackerrankTest {

    @Test
    public void testPangram() throws Exception {
        in("We promptly judged antique ivory buckles for the next prize");
        Pangrams.main(null);
        out("pangram\n");
    }

    @Test
    public void testNotPagram() throws Exception {
        in("We promptly judged antique ivory buckles for the prize");
        Pangrams.main(null);
        out("not pangram\n");
    }
}