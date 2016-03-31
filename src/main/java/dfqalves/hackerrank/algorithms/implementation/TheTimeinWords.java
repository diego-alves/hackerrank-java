package dfqalves.hackerrank.algorithms.implementation;

/**
 * Created by cin_dalves on 3/31/16.
 */
public class TheTimeinWords {
    private static final String[] nums = {
            "o' clock",
            "one",
            "two",
            "three",
            "four",
            "five",
            "six",
            "seven",
            "eight",
            "nine",
            "ten",
            "eleven",
            "twelve",
            "thirteen",
            "fourteen",
            "quarter",
            "sixteen",
            "seventeen",
            "eighteen",
            "nineteen",
            "twenty",
            "twenty one",
            "twenty two",
            "twenty three",
            "twenty four",
            "twenty five",
            "twenty six",
            "twenty seven",
            "twenty eight",
            "twenty nine",
            "half"
    };


    static String toWords(int h, int m) {
        String minutes = m > 30 ? nums[60-m] : nums[m];
        String hours = m > 30 ? nums[h+1] : nums[h];

        if(m == 0)
            return hours + " " + minutes;
        else {
            String minutesLabel = (m % 15 == 0 ? "" : (m > 1 ? " minutes" : " minute"));
            String order = m > 30 ? " to " : " past ";
            return String.format("%s%s%s%s", minutes, minutesLabel, order, hours);
        }

    }




}
