package dfqalves.hackerrank.algorithms.implementation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;
import static org.testng.Assert.*;

/**
 * Created by diegoalves on 28/03/16.
 */
public class ExtraLongFactorialsTest {
    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUp() throws Exception {
        System.setOut(new PrintStream(out));
    }

    @Test
    public void testMain() throws Exception {
        String data = "25";
        System.setIn(new ByteArrayInputStream(data.getBytes()));
        ExtraLongFactorials.main(null);
        assertThat(out.toString(), is(equalTo("15511210043330985984000000")));
    }
}