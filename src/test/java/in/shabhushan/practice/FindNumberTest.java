package in.shabhushan.practice;

import org.junit.BeforeClass;
import org.junit.Test;

public class FindNumberTest {

    private static FindNumber findNumber;

    @BeforeClass
    public static void init() {
        findNumber = new FindNumber();
    }

    @Test
    public void findDigitCountTest() {
        System.out.println(findNumber.findDigitCount(5));

        System.out.println(findNumber.smallestNumWithSum(5, 3));
    }
}
