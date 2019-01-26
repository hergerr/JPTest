package Ex2;

public class A {
    public static int i;
    static {
        i++;
        System.out.print(i);
    }
    public static void main(String[] args) {
        A a1 = new A(), a2 = new A();
    }
}
