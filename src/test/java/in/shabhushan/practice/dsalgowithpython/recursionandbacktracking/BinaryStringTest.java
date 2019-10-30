package in.shabhushan.practice.dsalgowithpython.recursionandbacktracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinaryStringTest {
    @Test
    public void testBinaryString() {
        List<String> list = BinaryString.binaryString(2);

        Assert.assertEquals(4, list.size());
        Assert.assertEquals("00,01,10,11", String.join(",", list));

        List<String> anotherList = BinaryString.binaryString(4);

        Assert.assertEquals(16, anotherList.size());
        Assert.assertEquals("0000,0001,0010,0011," +
                "0100,0101,0110,0111," +
                "1000,1001,1010,1011," +
                "1100,1101,1110,1111",
            String.join(",", anotherList));
    }
}
