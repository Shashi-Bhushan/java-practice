package in.shabhushan.practice.dsalgowithpython.recursionandbacktracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class BinaryStringTest {
    @Test
    public void testBinaryString() {
        List<String> list = BinaryString.binaryString(2);

        Assert.assertEquals(4, list.size());
    }
}
