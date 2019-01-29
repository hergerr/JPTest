package Ex24;

class C {
     class B {
        static final int x = 10; // 1
    }
}

public class A {
    public static void main(String[] args) {
        C c = new C(); // 2
        C.B obj1 = c.new B(); // 3
    }
}