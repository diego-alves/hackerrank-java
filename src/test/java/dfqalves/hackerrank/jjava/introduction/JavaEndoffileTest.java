package dfqalves.hackerrank.jjava.introduction;

import static org.testng.Assert.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * JavaEndoffileTest.java<br>
 *
 * @author <a href="mailto:cin_dalves@uolinc.com">Diego Alves - cin_dalves</a>
 * @version $Revision: $<br>
 *          $Id: $
 * @since 12/22/15
 */
public class JavaEndoffileTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUp() throws Exception {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testMain() throws Exception {

        String data = //
                "Hello world\n" + //
                "I am a file\n" + //
                "Read me until end-of-file."; //

        System.setIn(new ByteArrayInputStream(data.getBytes()));
        JavaEndoffile.main(null);

        assertEquals( //
                "1 Hello world\n" + //
                "2 I am a file\n" + //
                "3 Read me until end-of-file.\n", out.toString());

    }
}