package Ex1;

public class A {
    public int i;
    {
        i++;
        System.out.print(i);
    }

    public static void main(String[] args) {
        A a1 = new A(), a2 = new A();
    }
}
