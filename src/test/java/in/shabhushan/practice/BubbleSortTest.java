package in.shabhushan.practice;

import in.shabhushan.practice.sort.BubbleSort;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Arrays;

import static in.shabhushan.practice.util.ArrayUtil.printArray;
import static org.junit.Assert.assertTrue;

public class BubbleSortTest {

    private static BubbleSort bubbleSort;

    @BeforeClass
    public static void init() {
        bubbleSort = new BubbleSort();
    }

    @Test
    public void testBubbleSort() {
        int arr[] = {4, 3, 2, 1, 15, 8, 3, 13};
        int sortedArray[] = {1, 2, 3, 3, 4, 8, 13, 15};

        bubbleSort.sort(arr, true);

        printArray(arr);

        assertTrue(Arrays.equals(arr, sortedArray));
    }

    @Test
    public void testBubbleSortWithSkip() {
        int arr[] = {4, 3, 2, 1, 15, 8, 3, 13};
        int sortedArray[] = {1, 2, 3, 3, 4, 8, 13, 15};

        bubbleSort.sortWithSkip(arr, true);

        printArray(arr);

        assertTrue(Arrays.equals(arr, sortedArray));
    }
}
