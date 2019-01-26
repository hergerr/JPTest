package Ex14;

class E extends Exception {
}

public class A {
    public static void m() throws E, Exception {
    }

    public static void main(String[] args) {
        try {
            A.m();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}