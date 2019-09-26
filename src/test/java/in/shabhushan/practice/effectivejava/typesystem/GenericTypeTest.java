package in.shabhushan.practice.effectivejava.typesystem;

import org.junit.Test;

public class GenericTypeTest {

    @Test
    public void testInteger() {
        System.out.println(GenericType.pick(null, 2));
    }
}
