package in.shabhushan.practice.effectivejava;

import org.junit.Test;

interface Parent {
    int x = 0;
}

interface SecondParent {
    int x = 10;
}

class Child implements   Parent, SecondParent {
    public void testX() {
        System.out.println(Parent.x);
    }

    public void test(String str) {
        System.out.println("String");
    }

    public void test(Object obj) {
        System.out.println("Object");
    }
}

public class InheritanceTest {
    @Test
    public void testX() {
        Child p = new Child();
        p.testX();

        p.test(null);
    }
}
