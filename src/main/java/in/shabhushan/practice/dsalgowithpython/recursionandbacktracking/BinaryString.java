package in.shabhushan.practice.dsalgowithpython.recursionandbacktracking;

import java.util.ArrayList;
import java.util.List;

/**
 * Problem Statement: Generate all the binary strings with n bits.
 */
public class BinaryString {
    public static List<String> binaryString(final int num) {
        if(num == 0) {
            return new ArrayList<>();
        } else if(num == 1) {
            List<String> list =  new ArrayList<>();
            list.add("0");
            list.add("1");
            return list;
        } else {
            List<String> listOne = binaryString(num - 1);
            List<String> listTwo = binaryString(num - 1);

            // iterate over list and append 0 in first and 1 in second list
            for(int index = 0; index < listOne.size(); index++) {
                listOne.set(index, "0" + listOne.get(index));
                listTwo.set(index, "1" + listTwo.get(index));
            }

            List<String> list = new ArrayList<>();
            list.addAll(listOne);
            list.addAll(listTwo);

            return list;
        }
    }

    public static List<String> binaryStringRecursive(final int num) {
        if(num == 0) {
            return new ArrayList<>();
        } else if(num == 1) {
            List<String> list =  new ArrayList<>();
            list.add("0");
            list.add("1");
            return list;
        } else {
            List<String> list = new ArrayList<>();

            for(String bit: binaryStringRecursive(1)) {
                for(String digit: binaryStringRecursive(num - 1)) {
                    list.add(bit + digit);
                }
            }

            return list;
        }
    }
}
