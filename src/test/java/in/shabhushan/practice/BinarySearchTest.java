package in.shabhushan.practice;

import in.shabhushan.practice.search.BinarySearch;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class BinarySearchTest {

    private static BinarySearch ob;

    @BeforeClass
    public static void init() {
        ob = new BinarySearch();
    }

    @Test
    public void testSearch() {
        int arr[] = { 2, 3, 4, 10, 40 };
        int n = arr.length;

        Assert.assertEquals(1, ob.search(arr, 3, 0,  n - 1));
        Assert.assertEquals(4, ob.search(arr, 40, 0,  n - 1));
        Assert.assertEquals(-1, ob.search(arr, 30, 0,  n - 1));
    }
}
