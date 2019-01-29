package Ex23;

public class A {
    static boolean koniec = false;

    synchronized public void m() {
        while (!koniec) try {
            wait();
        } catch (InterruptedException e) {
        }
    }

    synchronized public void n() {
        notify();
    }

    public static void main(String args[]) {
        Thread t1, t2;
        A a = new A();
        t1 = new Thread(new Runnable() {
            public void run() {
                a.m();
            }
        });
        t2 = new Thread(new Runnable() {
            public void run() {
                koniec = true;
                a.n();
            }
        });
        t2.start();
        t1.start();
    }
}