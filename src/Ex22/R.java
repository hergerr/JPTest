package Ex22;

class R extends Thread {
    Thread t;
    R() {
        t = new Thread(this); // 1
        t.start(); }
    public void run() { try {
        sleep(100);
    } catch (InterruptedException e) { }
    }
}
