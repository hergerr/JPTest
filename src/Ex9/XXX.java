package Ex9;

public class XXX {
    public static void main(String[] args) {
        int i, j = 0;
        et2:
        for (i = 0; i < 3; i++) {
            et1:
            do {
                j++;
                System.out.print(i + " " + j + ",");
                if (i % 2 == 0)
                    continue et2;
                else break et1;
            } while (j < 3);
            j = 0;
        }
    }
}
