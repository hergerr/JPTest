package Ex18;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class A {
    public static void main(String[] args) {
        Integer[] ti = {3, 1, 2};
        ArrayList<Integer> al = new ArrayList<Integer>(Arrays.asList(ti));
        al.sort((a1, a2) -> a2 - a1);
        Collections.sort(al, (a1, a2) -> a1 - a2);
        System.out.println(al);
    }
}