package in.shabhushan.practice.effectivejava;

import org.junit.Test;

public class EnumSetTest {

    public static void printBinary(long l) {
        System.out.println(String.format("%16s", Long.toBinaryString(l)).replaceAll(" ", "0"));
    }

    @Test
    public void testElement() {
        long element = 1L;

        printBinary(element);
    }
}
