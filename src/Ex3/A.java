package Ex3;

public class A {
    public static int i;

    {
        i++;
        System.out.print(i);
    }

    public static void main(String[] args) {
        System.out.print(A.i);
    }
}
