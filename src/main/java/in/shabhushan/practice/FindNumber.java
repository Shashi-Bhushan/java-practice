package in.shabhushan.practice;

import org.jetbrains.annotations.NotNull;

public class FindNumber {

    /**
     * Given two integers M and K, the task is to find the Kth smallest number with digit sum as M.
     *
     * @param M
     * @param K
     * @return
     */
    public static int smallestNumWithSum(@NotNull final int M, @NotNull final int K) {
        // find numbers with digit sum M
        int digitCount = findDigitCount(M);

        int digitArr[] = new int[M];

        for(int index = 0; index < M; index++) {
            // TODO: change this to check base also
            digitArr[index] = (index) * 10 + (M - index);
        }
        return digitArr[K-1];
    }


    /**
     * Find count of digits which would add up to M
     * @param M
     * @return
     */
    public static int findDigitCount(final int M) {
        int i = 0;
        int base = 1;
        // At least 1 number is required
        int index = 1;

        while(i < 1) {
            i = M / base;

            index++;

            // increase base
            base *= 10;
        }

        return index;
    }
}
