package in.shabhushan.practice.effectivejava.typesystem;

public class GenericType {

    public static <T extends Number> T pick(T t1, T t2) {
        return t1 != null ? t1 : (T)new Integer(t2.hashCode());
    }
}
