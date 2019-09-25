package in.shabhushan.practice.effectivejava;

import org.junit.Test;
import sun.misc.SharedSecrets;

import static org.junit.Assert.assertEquals;

public class EnumSetTest {

    public static void printBinary(long l) {
        System.out.println(getBinary(l));
    }

    public static String getBinary(long l) {
        return String.format("%16s", Long.toBinaryString(l)).replaceAll(" ", "0");
    }

    @Test
    public void testElement() {
        long element = 1L;

        printBinary(element);
    }

    @Test
    public void testGetUniverse() {
        // Gets All possible Enum Values as an array
        EnumSetCustom[] enumUniverse = SharedSecrets.getJavaLangAccess().getEnumConstantsShared(EnumSetCustom.class);

        for(EnumSetCustom enumValue: enumUniverse) {
            System.out.println(enumValue);
        }
        System.out.println(enumUniverse.length);
    }

    /**
     * If Enum Universe length is less than 64, then use RegularEnumSet class
     *
     * new RegularEnumSet<>(elementType, universe);
     *
     * elementType = final Class<E> elementType;
     * universe = final Enum<?>[] universe;
     */
    @Test
    public void testRegularEnumSet_addAll() {
        // Gets All possible Enum Values as an array
        EnumSetCustom[] enumUniverse = SharedSecrets.getJavaLangAccess().getEnumConstantsShared(EnumSetCustom.class);

        ///////////////////////
        // mock addAll() method
        ///////////////////////
        long elements = -1 >>> -enumUniverse.length; // Universe Length is 5

        assertEquals("0000000000011111", getBinary(elements));

        //////////////////////
        // mock addRangeMethod
        //////////////////////
        int from = EnumSetCustom.SECOND_VALUE.ordinal();
        int to = EnumSetCustom.FOURTH_VALUE.ordinal();

        elements = -1L >>> (from - to - 1) << from;
        assertEquals("0000000000001110", getBinary(elements));

    }
}
