package Ex15;

class B extends A {
}

public class A {
    public static void n(A[] a) {
    } // 1

    public static void main(String[] args) {
        B[] aB = new B[2];
        A[] aA = new A[2];
        n(aB); // 2
        n(aA); // 3
    }
}