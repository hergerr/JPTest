package Ex22;

public class A {
    public static void main(String args[])
            throws InterruptedException { // 2
        R r = new R();
        r.join(); // 3
    }
}