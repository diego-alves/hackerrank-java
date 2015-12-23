package dfqalves.hackerrank.jjava.introduction;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Created by diegoalves on 22/12/15.
 */
public class JavaLoopsTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUp() throws Exception {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void test(){

        String data =
                "2\n" + //
                "0 2 10\n" + //
                "5 3 5"; //

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaLoops.main(null);

        assertEquals(out.toString(), //
                "2 6 14 30 62 126 254 510 1022 2046 \n" + //
                "8 14 26 50 98 \n");

    }

}