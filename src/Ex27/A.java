package Ex27;


import java.io.ObjectInputStream;
import java.net.Socket;

class A{

    protected int y = 10;
    private  int zz = 24;

    public static void main(String[] args) {
        B b = new B();
        b.y = 15;
        System.out.println(b.y);

        A a = new A();
        System.out.println(a.zz);

    }
}

class B extends A{
    private int i = 10;
}