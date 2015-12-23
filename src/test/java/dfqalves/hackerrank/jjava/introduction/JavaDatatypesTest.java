package dfqalves.hackerrank.jjava.introduction;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.testng.Assert.*;

/**
 * Created by diegoalves on 22/12/15.
 */
public class JavaDatatypesTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUp() throws Exception {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testMain() throws Exception {
        String data = //
                "5\n" + //
                "-150\n" + //
                "150000\n" + //
                "1500000000\n" + //
                "213333333333333333333333333333333333\n" + //
                "-100000000000000"; //

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaDatatypes.main(null);

        assertEquals( //
                "-150 can be fitted in:\n" + //
                "* short\n" + //
                "* int\n" + //
                "* long\n" + //
                "150000 can be fitted in:\n" + //
                "* int\n" + //
                "* long\n" + //
                "1500000000 can be fitted in:\n" + //
                "* int\n" + //
                "* long\n" + //
                "213333333333333333333333333333333333 can't be fitted anywhere.\n" + //
                "-100000000000000 can be fitted in:\n" + //
                "* long\n", out.toString());

    }
}