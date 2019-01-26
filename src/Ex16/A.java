package Ex16;

import java.util.*;

class B extends A {
}

public class A {
    static void n(Collection<B> a) {
    } //1

    public static void main(String[] args) {
        Collection<B> cB = new LinkedList<B>();
        Collection<A> cA = new LinkedList<A>();
        n(cB); // 2
//        n(cA); // 3
    }
}