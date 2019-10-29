package in.shabhushan.practice.dsalgopython.recursionandbacktracking;

import in.shabhushan.practice.dsalgowithpython.recursionandbacktracking.CheckSorted;
import org.junit.Assert;
import org.junit.Test;

public class CheckSortedTest {

    @Test
    public void testUnsortedArray() {
        int[] arr = new int[]{0, 1, 2, 3, 3, 5, 4, 5};

        Assert.assertFalse(CheckSorted.isSorted(arr));
    }

    @Test
    public void testSortedArray() {
        int[] arr = new int[]{0, 1, 2, 3, 3, 5, 5, 6};

        Assert.assertTrue(CheckSorted.isSorted(arr));
    }
}
