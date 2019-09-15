package in.shabhushan.practice.search;

public class BinarySearch {
    public static int search(int[] arr, int digit, int... indeces) {
        int left, right;

        if(null == indeces) {
            left = 0;
            right = arr.length - 1;
        } else if(indeces.length == 2) {
            left = indeces[0];
            right = indeces[1];

            if(left > right) {
                return -1;
            }
        } else {
            return -1;
        }

        int mid = (left + right) / 2;

        if(arr[mid] == digit) {
            return mid;
        } else if (arr[mid] < digit) { // Digit
            return search(arr, digit, mid + 1, right);
        } else if(digit < arr[mid]){
            return search(arr, digit, left, mid - 1);
        }

        return -1;
    }
}
