package Ex17;

public class A {
    enum E {
        RAZ(1), DWA(2); // 1
        final int i;

        E(int i) {
            this.i = i;
        }

        E() {
            this.i = 0;
        }
    }

    public static void main(String args[]) {
        E[] aE = {E.RAZ, E.RAZ}; // 2
        for (E e : aE)
            switch (e) {
                case RAZ:
                    break;
                case DWA:
                    break;
            } // 3
    }
}