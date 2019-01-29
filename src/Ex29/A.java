package Ex29;

import java.net.MalformedURLException;
import java.net.URL;

public class A {
    public static void main(String[] args) {
        URL obj = null;
        try {
            obj = new URL("http://www.pwr.edu.pl/index.dhtml");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        System.out.print(obj.getHost());
    }
}
