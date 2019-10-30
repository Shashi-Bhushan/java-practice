package in.shabhushan.practice.dsalgopython.recursionandbacktracking;

import in.shabhushan.practice.dsalgowithpython.recursionandbacktracking.KString;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class KStringTest {

    @Test
    public void testKString() {
        List<String> list = KString.getKString(2, 3);

        Assert.assertEquals(9, list.size());
        Assert.assertEquals("00,01,02," +
                "10,11,12," +
                "20,21,22",
            String.join(",", list));

        List<String> anotherList = KString.getKString(2, 5);

        Assert.assertEquals(25, anotherList.size());
        Assert.assertEquals("00,01,02,03,04," +
                "10,11,12,13,14," +
                "20,21,22,23,24," +
                "30,31,32,33,34," +
                "40,41,42,43,44",
            String.join(",", anotherList));
    }
}
