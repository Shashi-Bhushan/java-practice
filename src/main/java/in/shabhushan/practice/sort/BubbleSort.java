package in.shabhushan.practice.sort;

import static in.shabhushan.practice.util.ArrayUtil.printArray;

public class BubbleSort {
    /**
     * Do a bubble sort on arr and change it's elements as a side effect
     * The Largest element of each iteration will bubble to the end of array
     *
     * @param arr
     *      the integer array to sort
     */
    public static void sort(@org.jetbrains.annotations.NotNull int arr[], boolean debug) {
        int len = arr.length;

        for(int i = 0; i < len - 1; i++) {
            // j will go till i +1
            for(int j = 0; j < len - (i + 1); j++) {
                // if element with earlier index is larger, swap it
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

                if(debug) {
                    printArray(arr);
                }
            }
        }
    }

    /**
     * Do a bubble sort on arr and change it's elements as a side effect
     * The Largest element of each iteration will bubble to the end of array
     *
     * @param arr
     *      the integer array to sort
     */
    public static void sortWithSkip(@org.jetbrains.annotations.NotNull int arr[], boolean debug) {
        int len = arr.length;

        for(int i = 0; i < len - 1; i++) {
            // assume Array is already sorted in this pass
            boolean sorted = true;

            // j will go till i +1
            for(int j = 0; j < len - (i + 1); j++) {
                // if element with earlier index is larger, swap it
                if (arr[j] > arr[j+1]) {
                    sorted = false;

                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

                if(debug) {
                    printArray(arr);
                }
            }

            // if no swap has occurred in a pass, array is sorted
            if(sorted) {
                break;
            }
        }
    }
}
