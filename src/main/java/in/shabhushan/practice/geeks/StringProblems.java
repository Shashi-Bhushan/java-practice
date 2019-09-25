package in.shabhushan.practice.geeks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringProblems {

    private static final String DOT = ".";

    /**
     * Given a String of length S, reverse the whole string without reversing the individual words in it. Words are separated by dots.
     *
     * Input:
     * The first line contains T denoting the number of testcases. T testcases follow. Each case contains a string S containing characters.
     *
     * Output:
     * For each test case, in a new line, output a single line containing the reversed String.
     *
     * Constraints:
     * 1 <= T <= 100
     * 1 <= |S| <= 2000
     *
     * Example:
     * Input:
     * 2
     * i.like.this.program.very.much
     * pqr.mno
     *
     * Output:
     * much.very.program.this.like.i
     * mno.pqr
     *
     * @param string
     * @return
     */
    public static String[] reverseString(String[] string) {

        String[] reverseString = new String[string.length];

        for(int testCase = 0; testCase < string.length; testCase++) {
            String[] splittedString = string[testCase].split("\\.", -1);

            String[] newString = new String[splittedString.length];

            for(int index = 0; index < splittedString.length; index++) {
                newString[index] = splittedString[splittedString.length - 1 - index];
            }

            reverseString[testCase] = String.join(DOT, newString);
        }

        return reverseString;
    }

    public static void main (String[] args) throws IOException {
        //code
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(reader.readLine());

        String[] str = new String[t];

        while(t-- > 0) {
            str[t] = reader.readLine();
        }

        for(String s: reverseString(str)) {
            System.out.println(s);
        }
    }
}
