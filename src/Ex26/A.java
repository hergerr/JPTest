package Ex26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class A {
    public void run() {
        String command;
        Socket so = null;
        BufferedReader instream = null;
        while (true) {
            try {
                so = new ServerSocket(2000).accept(); // 1
                instream = new BufferedReader(
                        new InputStreamReader(so.getInputStream())); // 2
                while(true){
                    command = instream.readLine();
                    System.out.println(command);
                }
            } catch (Exception ex) {
                try {
                    instream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    so.close(); // 3
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
