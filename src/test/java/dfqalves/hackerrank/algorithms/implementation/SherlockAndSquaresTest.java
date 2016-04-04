package dfqalves.hackerrank.algorithms.implementation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by cin_dalves on 3/31/16.
 */
public class SherlockAndSquaresTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUp() throws Exception {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testMain() throws Exception {
        String data = "2\n3 9\n17 24";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        SherlockAndSquares.main(null);
        assertThat(out.toString(), is(equalTo("2\n0\n")));
    }
}