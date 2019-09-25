package in.shabhushan.practice.geeks;

import org.junit.Test;

public class StringProblemsTest {

    @Test
    public void testReverseString() {
        String[] testString = {"i.like.this.program.very.much", "pqr.mno"};

        String[] reversedStringArr = StringProblems.reverseString(testString);

        System.out.println(reversedStringArr);
    }
}
