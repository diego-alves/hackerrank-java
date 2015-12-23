package dfqalves.hackerrank;

import org.testng.annotations.BeforeMethod;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.assertEquals;

/**
 * Created by diegoalves on 23/12/15.
 */
public class HackerrankTest {

    private ByteArrayOutputStream out;

    @BeforeMethod
    public void setUp() throws Exception {
        out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
    }

    protected void in(String in) {
        System.setIn(new ByteArrayInputStream(in.getBytes()));
    }

    protected void out(String expected) {
        assertEquals(out.toString(), expected);
    }


}
