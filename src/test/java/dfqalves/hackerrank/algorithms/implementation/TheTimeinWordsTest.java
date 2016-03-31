package dfqalves.hackerrank.algorithms.implementation;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsEqual.equalTo;

/**
 * Created by cin_dalves on 3/31/16.
 */
public class TheTimeinWordsTest {

    @DataProvider(name = "times")
    public Object[][] createDataTest(){
        return new Object[][] {
            {5,0,"five o' clock"},
            {5,1,"one minute past five"},
            {5,10,"ten minutes past five"},
            {5,30,"half past five"},
            {5,40,"twenty minutes to six"},
            {5,45,"quarter to six"},
            {5,47,"thirteen minutes to six"},
            {5,28,"twenty eight minutes past five"}
        };
    }

    @Test(dataProvider = "times")
    public void testToWords(int h, int m, String r) {
        String word = TheTimeinWords.toWords(h, m);
        assertThat(word, is(equalTo(r)));
    }

    @Test
    public void testToWords547() {
        String word = TheTimeinWords.toWords(5, 47);
        assertThat(word, is(equalTo("thirteen minutes to six")));
    }

}