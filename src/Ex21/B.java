package Ex21;

import javax.swing.*;
import java.awt.*;

class B{
    String a ="B";

    @Override
    public String toString() {
        return a;
    }
}

class X extends JFrame {


    public X() {
        this.setSize(400, 200);
        this.setLocationRelativeTo(null);
        B[] ta = {new B(),new B()};
        JList list = new JList(ta);
        JPanel contentPane = new JPanel();
        contentPane.add(list, BorderLayout.WEST);
        this.add(contentPane);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        new X();
    }
}
