package dfqalves.hackerrank.algorithms.implementation;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by diegoalves on 27/03/16.
 */
public class AcmIcpcTeamTest {

    private final ByteArrayOutputStream out = new ByteArrayOutputStream();

    @BeforeMethod
    public void setUp() throws Exception {
        System.setOut(new PrintStream(out));
    }


    @Test
    public void testMain() throws Exception {
        String data = //
                        "4 5\n" +
                        "10101\n" +
                        "11100\n" +
                        "11010\n" +
                        "00101"; //

        System.setIn(new ByteArrayInputStream(data.getBytes()));

        AcmIcpcTeam.main(null);

        assertThat(out.toString(), is(equalTo("5\n2\n")));
    }

    @Test
    public void testCalcTopics1() throws Exception {
        boolean[] a = {true, true, false, false, true};
        boolean[] b = {true, false, true, false, true};

        int r = AcmIcpcTeam.calcTopics(a, b);

        assertThat(r, equalTo(4));
    }

    @Test
    public void testCalcTopics2() throws Exception {
        boolean[] a = {true, true, false, false, false};
        boolean[] b = {false, false, false, false, false};

        int r = AcmIcpcTeam.calcTopics(a, b);

        assertThat(r, equalTo(2));
    }

    @Test
    public void testCalcTopics3() throws Exception {
        boolean[] a = {true, true, false, false, false};
        boolean[] b = {false, true, false, false, false};

        int r = AcmIcpcTeam.calcTopics(a, b);

        assertThat(r, equalTo(2));
    }

    @Test
    public void testReadMatrix() throws Exception {
        String data = //
                        "10101\n" + //
                        "11100\n" + //
                        "11010\n" + //
                        "00101"; //

        Scanner sc = new Scanner(new ByteArrayInputStream(data.getBytes()));

        boolean[][] r = AcmIcpcTeam.readMatrix(sc, 4, 5);
        boolean[][] exp = {
                {true,  false, true,  false, true},
                {true,  true,  true,  false, false},
                {true,  true,  false, true,  false},
                {false, false, true,  false, true},
        };

        assertThat(r, equalTo(exp));


    }
}