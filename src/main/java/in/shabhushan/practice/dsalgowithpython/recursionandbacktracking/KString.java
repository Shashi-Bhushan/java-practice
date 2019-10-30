package in.shabhushan.practice.dsalgowithpython.recursionandbacktracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: Generate all the strings of length n drawn from [0 .. k - 1]
 *
 * If I want all two digit numbers from k = 5, then the result should be
 * [
 *  '00', '01', '02', '03', '04',
 *  '10', '11', '12', '13', '14',
 *  '20', '21', '22', '23', '24',
 *  '30', '31', '32', '33', '34',
 *  '40', '41', '42', '43', '44'
 * ]
 *
 * Solve using recursion
 *
 *
 * Algorithm:
 * Get a
 */
public class KString {

    public static List<String> getKString(int n, int k) {
        if (n == 1) {
            // Generate an Array of K Strings
            List<String> list = new ArrayList<>();

            for (int index = 0; index < k; index++) {
                list.add(String.valueOf(index));
            }

            return list;
        } else {
            List<String> list = new ArrayList();

            for(String bit: getKString(1, k)) {
                for(String digits: getKString(n -1, k)) {
                    list.add(bit + digits);
                }
            }

            return list;
        }
    }
}
