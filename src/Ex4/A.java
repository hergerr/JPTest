package Ex4;

public class A {
    public int i;

    {
        i++;
        System.out.print(i);
    }

    A() {
        i++;
    }

    public static void main(String[] args) {
        A a = new A();
    }
}