package in.shabhushan.practice.dsalgowithpython.recursionandbacktracking;

import java.util.Arrays;

public class CheckSorted {

    public static boolean isSorted(int[] arr) {
        if(arr.length == 1) {
            return true;
        } else {
            return arr[0] <= arr[1] && isSorted(Arrays.copyOfRange(arr, 1, arr.length));
        }
    }
}
