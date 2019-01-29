package Ex30;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

public class A {
    public static void main(String[] args) {
        String ftpUrl = "ftp://user:password@server.com/projekty/plik.zip";
        try {
            URL url = new URL(ftpUrl); // 1
            URLConnection conn = url.openConnection(); // 2
            InputStream inputStream = conn.getInputStream();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
