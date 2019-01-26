package Ex11;

class A implements pakiecik3.I {
    public static void main(String[] args){
        new A().m(10);
    }

    @Override
    public void m(int i) {
        System.out.println(i);
    }
}